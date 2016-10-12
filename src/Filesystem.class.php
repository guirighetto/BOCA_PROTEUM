<?php

/**
 * Delete a file, or a folder and its contents (recursive algorithm)
 *
 * @author      Aidan Lister <aidan@php.net>
 * @version     1.0.3
 * @link        http://aidanlister.com/repos/v/function.rmdirr.php
 * @param       string   $dirname    Directory to delete
 * @return      bool     Returns TRUE on success, FALSE on failure
 */
function rmdirr($dirname)
{
    // Sanity check
    if (!file_exists($dirname)) {
        return false;
    }

    // Simple delete for a file
    if (is_file($dirname) || is_link($dirname)) {
        return unlink($dirname);
    }

    // Loop through the folder
    $dir = dir($dirname);
    while (false !== $entry = $dir->read()) {
        // Skip pointers
        if ($entry == '.' || $entry == '..') {
            continue;
        }

        // Recurse
        rmdirr($dirname . DIRECTORY_SEPARATOR . $entry);
    }

    // Clean up
    $dir->close();
    return rmdir($dirname);
}


/**
 * Delete a file, or a folder and its contents (stack algorithm)
 *
 * @author      Aidan Lister <aidan@php.net>
 * @version     1.0.0
 * @link        http://aidanlister.com/repos/v/function.rmdirr.php
 * @param       string   $dirname    Directory to delete
 * @return      bool     Returns TRUE on success, FALSE on failure
 */
function rmdirr_alternative($dirname)
{
    // Sanity check
    if (!file_exists($dirname)) {
        return false;
    }

    // Simple delete for a file
    if (is_file($dirname) || is_link($dirname)) {
        return unlink($dirname);
    }

    // Create and iterate stack
    $stack = array($dirname);
    while ($entry = array_pop($stack)) {
        // Watch for symlinks
        if (is_link($entry)) {
            unlink($entry);
            continue;
        }

        // Attempt to remove the directory
        if (@rmdir($entry)) {
            continue;
        }

        // Otherwise add it to the stack
        $stack[] = $entry;
        $dh = opendir($entry);
        while (false !== $child = readdir($dh)) {
            // Ignore pointers
            if ($child === '.' || $child === '..') {
                continue;
            }

            // Unlink files and add directories to stack
            $child = $entry . DIRECTORY_SEPARATOR . $child;
            if (is_dir($child) && !is_link($child)) {
                $stack[] = $child;
            } else {
                unlink($child);
            }
        }
        closedir($dh);
        print_r($stack);
    }

    return true;
}


function tempdir($basedir, $prefix)
{
	$filename = tempnam($basedir, $prefix);
	unlink($filename);
	mkdir($filename);

	return $filename;
}

function dir_has_file($dirname, $filename)
{
	$dirname = realpath($dirname);
	$filename = realpath($filename);
	return strncmp($dirname, $filename, len($dirname));
}
?>
