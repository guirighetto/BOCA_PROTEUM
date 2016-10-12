#include <unistd.h>
#include <stdio.h>

int main() {
	int i;
	char c;
	for (i = 0; i < 10; i++) {
		scanf("%c", &c);
		printf("%c", c);	
		sleep(1);
	}
}
