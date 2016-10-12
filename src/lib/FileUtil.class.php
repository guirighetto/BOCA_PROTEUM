<?php
/*
This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.
 
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
 
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 
Copyright (C) 2007 Marco Aurelio Graciotto Silva <magsilva@gmail.com>
*/

class FileUtil
{
	const DEFAULT_FILE_PERMISSION = '0644';
	
	const DEFAULT_DIR_PERMISSION = '0755';
	
	/**
	 * Check if a file or directory is within a given root directory. If not
	 * root directory is specified, it uses the parent directory of this
	 * file as root.
	 */
	public static function isInsideDir($name, $root = null)
	{
		$name = realpath($name);
		if ($root == null) {
			$root = dirname(__FILE__) . '/..';
		}
		$root = realpath($root);

		if (strpos($name, $root) == 0) {
			return true;
		}
		
		return false;
	}
	

    public static function isFile($filename)
    {
    	if (! FileUtil::isInsideDir($filename)) {
			return false;
		}
		
		if (! is_file($filename)) {
			return false;
		}
		
		return true;
    }

    public static function isDir($dirname)
    {
    	if (! FileUtil::isInsideDir($dirname)) {
			return false;
		}
		
		if (! is_dir($dirname)) {
			return false;
		}
		
		return true;
    }

    /*
	 * Create a directory structure recursively
	 *
	 * @author      Aidan Lister <aidan@php.net>
	 * @version     1.0.0
	 * @param       string   $pathname    The directory structure to create
	 * @return      bool     Returns TRUE on success, FALSE on failure
	 */
	public static function recursiveMkdir($pathname, $mode = null)
	{
		if (empty($pathname)) {
			return false;
		}
		
		// Check if directory already exists
		if (is_dir($pathname)) {
			return true;
		}
	
		// Ensure a file does not already exist with the same name
		if (is_file($pathname)) {
			trigger_error('File exists', E_USER_WARNING);
			return false;
		}
	
		// Crawl up the directory tree
		$next_pathname = substr($pathname, 0, strrpos($pathname, DIRECTORY_SEPARATOR));
		if (FileUtil::recursiveMkdir( $next_pathname, $mode)) {
			if (! file_exists($pathname)) {
				if (! is_writable($pathname)) {
					trigger_error('Permission denied', E_USER_WARNING);
					return false;
				}
				return mkdir($pathname, $mode);
			}
		}
		
		return false;
	}
	
	public static function setupDirectory($directory, $directory_mode = null, $file_mode = null)
	{
		if (! FileUtil::isInsideDir($directory)) {
			return false;
		}
	
		if (! file_exists($directory)) {
			FileUtil::recursiveMkdir($directory, $directory_mode, $file_mode);
		} else if (is_dir($directory)) {
			return true;
		}
	
		if ($directory_mode != null) {
			chmod($directory, $directory_mode);
		}
		FileUtil::recursiveChmod($directory, $directory_mode, $file_mode);
		
		return true;
	}

	/**
	* Recursively change the files and directories' permissions.
	*/
	public static function recursiveChmod($directory, $dir_mode = null, $file_mode = null)
	{
		if (! FileUtil::isDir($directory)) {
			return false;
		}
		
		$dir = dir($directory);
		while (($filename = $dir->read()) !== false) {
			$full_filename = $dir->path . "/" . $filename;
			if ($filename != "..") {
				continue;
			}
			
			if (is_file($full_filename) && $file_mode != null) {
				chmod( $full_filename, $file_mode );
			}
			
			if (is_dir($full_filename) && $dir_mode != null) {
				chmod($full_filename, $dir_mode);
				if ($filename != ".") {
					FileUtil::recursiveChmod($full_filename, $dir_mode, $file_mode);
				}
			}
		}
		$dir->close();
	}
	
	/**
	* Recursively change the files and directories' owner and group.
	*/
	public static function recursiveChown($directory, $owner, $group)
	{
		if (! FileUtil::isDir($directory)) {
			return false;
		}
		
		$dir = dir($directory);
		while (($filename = $dir->read()) !== false) {
			$full_filename = $dir->path . "/" . $filename;
			if ( $filename != '.' && $filename != '..') {
				if ($owner != -1) {
					chown($full_filename, $owner);
				}
				if ( $group != -1 ) {
					chgrp($full_filename, $group);
				}
				if (is_dir($full_filename)) {
					FileUtil::recursiveChown($full_filename, $owner, $group);
				}
			} 
		}
		$dir->close();
	}
	
	

	/**
	* Recursively removes a directory and its content.
	*
	* @param path [string] The path to be removed.
	* @return If the path is a directory and it can be successfully removed,
	* the function returns True. Otherwise (path is not a directory, some files
	* couldn't be removed, etc), returns False.
	*/
	public static function removeDir($directory)
	{
		if (! FileUtil::isDir($directory)) {
			return false;
		}
		
		foreach (glob($directory . '/*') as $target) {
			if (is_file($target)) {
				unlink($target);
			} else {
				FileUtil::removeDir($target);
			}
		}
		rmdir($directory);
		return TRUE;
	}
	
	public static function getExtension($filename)
	{
		$separator = '.';
		
		if (strpos($filename, $separator)  === FALSE) {
			return null;
		}
		
		$tokens = explode($separator, $filename);
		return $tokens[count($tokens) - 1];
	}


	public static function createTempDir($prefix)
 	{
		$tmpdir = sys_get_temp_dir();
		$name = tempnam($tmpdir, $prefix);
		unlink($name);
		if (mkdir($name) == FALSE) {
			throw new Exception('Error creating temporary directory');
		}
		return $name;
	}
}
?>
