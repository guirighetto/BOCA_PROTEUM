<?php
////////////////////////////////////////////////////////////////////////////////
//BOCA Online Contest Administrator
//    Copyright (C) 2003-2012 by BOCA Development Team (bocasystem@gmail.com)
//
//    This program is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    This program is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//    You should have received a copy of the GNU General Public License
//    along with this program.  If not, see <http://www.gnu.org/licenses/>.
////////////////////////////////////////////////////////////////////////////////
// Last modified 05/aug/2012 by cassio@ime.usp.br

function globalconf() {
	$conf['dbencoding'] = 'UTF8';
	$conf['dbclientenc'] = 'UTF8';
	$conf['dblocal'] = false; // use unix socket to connect?
	$conf['dbhost'] = 'localhost';
	$conf['dbport'] = 5432;
	$conf['dbname'] = 'boca'; // name of the boca database
	$conf['dbuser'] = 'boca'; // unprivileged boca user
	$conf['dbpass'] = 'boca';
	$conf['dbsuperuser'] = 'boca'; // privileged boca user
	$conf['dbsuperpass'] = 'boca';
	// Initial password for any user (including 'system'). Set it to something hard to guess.
	$conf['basepass'] = 'boca';

	// Secret key to be used in HTTP headers. It should be set with a random and large sequence.
	$conf['key'] = 'GG56KFJtNDBGjJprR6ex';

	// IP address of the computer running the auto-judge script.
	$conf['ip'] = 'localhost';

	return $conf;
}
?>
