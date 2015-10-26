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

require_once('BocaConfig.class.php');

class Boca
{
	private $config;

	public __construct() {
		$this->config = new BocaConfig();
	}

	private function setupPhp() {
		$htaccess = <<<EOT
php_flag output_buffering on

php_value memory_limit 256M
php_value post_max_size 128M
php_value upload_max_filesize 128M

# Disable magic quotes
php_flag magic_quotes_gpc off
php_flag magic_quotes_runtime off
php_flag magic_quotes_sybase off
EOT;
	}
}
?>
