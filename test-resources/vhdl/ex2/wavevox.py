# coding: latin
#!/usr/local/bin/python3
#!/usr/bin/python3
import os, sys, curses
from itertools import takewhile, dropwhile

#speaker = '/usr/local/bin/speak -v brazil ' # mac os x
# speaker = '/usr/bin/espeak -v brazil ' # linux
speaker = '/usr/bin/espeak -v brazil ' # linux
player = ' --stdout | paplay'
#speaker = 'say ' # mac os x (ingles)

enddefinitions = False
time = 0
var_names = dict()
var_keys = []
var_values = dict()
var_simulation = dict()
var_times = []
var_scope = []

def initScreen():
    stdscr = curses.initscr()
    curses.noecho()
    curses.cbreak()
    stdscr.keypad(1)
    return stdscr
    
def endWindow(stdscr):
    curses.echo()
    curses.nocbreak()
    stdscr.keypad(0)
    curses.endwin()
        
def say(what):
    os.system(speaker + "'" + what + "'" + player)

def help():
    say('Ajuda. Tecle ESC para sair')

def sayTime(time):
    say('Tempo ' + str(time))
    
def saySignal(var, value):
    say('Sinal ' + var + ' valor ' + value)

def runSimulation(stdscr):
    pos_var, pos_time = 0, 0
    say('Olá! Tecle h para ajuda.')
    sayTime(var_times[pos_time])
    saySignal(var_names[var_keys[pos_var]], var_simulation[var_times[pos_time]][var_keys[pos_var]])
    while 1:
        tecla = stdscr.getch()
        if tecla == 27:
            break
        elif tecla in [ord('h'), ord('H')]:
            help()
        elif tecla == curses.KEY_UP:
            if pos_var == 0:
                say('Primeiro sinal')
            else:
                pos_var -= 1                
                saySignal(var_names[var_keys[pos_var]], var_simulation[var_times[pos_time]][var_keys[pos_var]])
        elif tecla == curses.KEY_DOWN:
            if pos_var == len(var_keys)-1:
                say('Último sinal')
            else:
                pos_var += 1
                saySignal(var_names[var_keys[pos_var]], var_simulation[var_times[pos_time]][var_keys[pos_var]])
        elif tecla == curses.KEY_LEFT:
            if pos_time == 0:
                say('Início da simulação')
            else:
                pos_time -= 1
                sayTime(var_times[pos_time])
        elif tecla == curses.KEY_RIGHT:
            if pos_time == len(var_times)-1:
                say('Final simulação')
            else:
                pos_time += 1
                sayTime(var_times[pos_time])
        else:
            say('Comando desconhecido')
    say('Até logo!')

def parse_error(tokeniser, keyword): 
    print( "Don't understand keyword: " + keyword )

def vcd_end(tokeniser, keyword): 
    if not enddefinitions: 
        parse_error(tokeniser, keyword)

def save_declaration(tokeniser, keyword): 
    print('save:'+keyword.lstrip('$'), " ".join( takewhile(lambda x: x != "$end", tokeniser)))

def vcd_scope(tokeniser, keyword):
    global var_scope
    scope_type, scope_name = tuple(takewhile(lambda x: x != "$end", tokeniser))
    var_scope.append(scope_name)
    print('scope:',var_scope)

def vcd_upscope(tokeniser, keyword):
    global var_scope
    print('upscope:'+var_scope.pop())

def end_definitions(tokeniser, keyword):
    global enddefinitions
    print('end_def:'+keyword.lstrip('$'), " ".join( takewhile(lambda x: x != "$end", tokeniser)))
    enddefinitions = True

def vcd_var(tokeniser, keyword):
    global var_names, var_keys
    # var_type, size, identifier_code, reference = tuple(takewhile(lambda x: x != "$end", tokeniser)) 
    var_options = tuple(takewhile(lambda x: x != "$end", tokeniser))
    bus_size = 1
    if len(var_options) == 4 : 
        var_type, size, identifier_code, reference = var_options; 
    else : 
        var_type, size, identifier_code, reference, bus_size = var_options;
    var_names[identifier_code]=".".join(var_scope+[reference])
    var_keys.append(identifier_code)
    print(var_type, size, identifier_code, reference, bus_size)

def readFile(filename):
    global time, var_values, var_simulation
    file = open(filename)
    tokeniser = (word for line in file for word in line.split() if word)
    for token in tokeniser:
        if not enddefinitions:
            keyword2handler[token](tokeniser, token)
        else:
            c, rest = token[0], token[1:]
            if c == '$':
                # skip $dump* tokens and $end tokens in sim section 
                continue
            elif c == '#':
                var_simulation[time] = var_values.copy()
                time = int(rest)
                print(var_values)
                var_times.append(time)
            elif c in '01xXzZ':
                var_values[rest]=c
            elif c in 'bBrR':
                var_values[rest]=c
            else:
                print("Don't understand: %s !" % (token))
    file.close()

keyword2handler = { 
    # declaration_keyword ::= 
    "$comment":        save_declaration,
    "$date":           save_declaration,
    "$version":        save_declaration,
    "$timescale":      save_declaration,
    "$scope":          vcd_scope,
    "$upscope":        vcd_upscope,
    "$enddefinitions": end_definitions, 
    "$var":            vcd_var, 
    "$end":            vcd_end, 
}

if __name__=='__main__':
    say('Ola Bem vindo ao wavevox')
    if (len(sys.argv) > 1):
        vcdfile = sys.argv[1]
        readFile(vcdfile)
        stdscr = initScreen()
        runSimulation(stdscr)
        endWindow(stdscr)
    else:
        say('Por favor, informe o nome do arquivo VCD na linha de comandos')
