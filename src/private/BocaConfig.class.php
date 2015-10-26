<?php
/**
 * BOCA Online Contest Administrator
 *
 * Copyright (C) 2013 Marco Aurélio Graciotto Silva <magsilva@utfpr.edu.br>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

class BocaConf
{
	const DEFAULT_CONFIG_FILE = '/etc/boca.conf';

	const CONFIG_OPT_BOCADIR = 'bocadir';

	const CONFIG_OPT_WWW_IP = 'BOCASERVER';

	const CONFIG_OPT_AUTOJUDGE_IP = 'BOCASERVER';

	const CONFIG

	private $bocaDir;

	private $wwwServerIP;

	private $autoJudgeIP;

	
	private $dbEncoding = 'UTF8';

	private $dbClientEncoding = 'UTF8';

	private $dbUseUnixSocket = false;

	private $dbHostname = 'localhost';

	private $dbPort = '5432';

	private $dbName = 'bocadb';

	private $dbUsername = 'bocauser';

	private $dbPassword = 'dAm0HAiC';

	private $dbSuperUsername = 'bocauser';

	private $dbSuperPassword = 'dAm0HAiC';

	private $defaultPassword = 'boca';

	private $secret = 'GG56KFJtNDBGjJprR6ex';

	private $config;

	private $storeTimezone;

	private $displayTimezone;

	public __construct() {
		$this->config = loadDefaultConfiguration();
	}

	public function readConfiguration($configFile = self::DEFAULT_CONFIG_FILE) {
		if (! is_readable($configFile)) {
			throw new InvalidArgumentException('Could not find configuration file: ' . $configFile);	
		}

		$pif = parse_ini_file($configFile);
		$this->bocadir = trim($pif[self::CONFIG_OPT_BOCADIR]);
		$this->wwwServerIP = trim($pif[self::CONFIG_OPT_WWW_IP]);
		$this->autoJudgeIP = trim($pif[self::CONFIG_OPT_AUTOJUDGE_IP]);
	}

	private function loadDefaultConfiguration() {
		// Initial password for any user (including 'system'). Set it to something hard to guess.
		$conf['basepass'] = 'boca';
		// Secret key to be used in HTTP headers. It should be set with a random and large sequence.
		$conf['key'] = 'GG56KFJtNDBGjJprR6ex';
		// IP address of the computer running the auto-judge script.
		$conf['ip'] = 'local';

		$this->storeTimezone = 'UTC';
		$this->displayTimezone = 'UTC';

		date_default_timezone_set($this->storeTimezone);
	}
}
?>
