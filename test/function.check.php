<?php

define('CHECK_FUNCTIONS_SHOULD_TRIGGER_ERROR', true);


function check_function_on_error($msg, $err_type = NULL)
{
	assert(is_string($msg));

	if (empty($err_type) || $err_type == NULL) {
		if (CHECK_FUNCTIONS_SHOULD_TRIGGER_ERROR) {
			$err_type = E_USER_ERROR;
		} else {
			$err_type = E_USER_WARNING;
		} 
	}

	if (empty($msg)) {
		$msg = 'Invalid value';
	}

	trigger_error($msg, $err_type);

	return false;
}


function check_not_null($obj, $err_msg)
{
	if ($obj == null) {
		return check_function_on_error($obj, $err_msg);
	}
	
	return true;
}

function check_number($number, $err_msg)
{
	if ($number == null) {
		return true;
	}

	$val = intval($number);
	if ($val == 0 && $number != '0') {
		return check_function_on_error($err_msg);
	}

	return true;
}

function check_string($str, $err_msg)
{
	if ($str == null) {
		return true;
	}

	if (! is_string($str) || empty($str)) {
		return check_function_on_error($err_msg);
	}

	return true;
}


function check_date($date, $err_msg)
{
	if ($date == null) {
		return true;
	}

	$result = strptime($date, 'Y-m-d');
	if ($date == false) {
		return check_function_on_error($err_msg);
	}

	return true;
}

function check_date_difference($date1, $date2, $difference, $err_msg)
{
	if ($date1 == NULL || $date2 == NULL) {
		return true;
	}

	$date1_time = strtotime($date1);
	$date2_time = strtotime($date2);
	if (($date2_time - $date1_time) <= $difference) {
		return check_function_on_error($err_msg);
	}
}

function check_decimal($decimal, $err_msg)
{
	if ($decimal == null) {
		return true;
	}

	$numbers = explode('.', $decimal);
	if (count($numbers) == 0 || count($numbers) > 2) {
		return check_function_on_error($err_msg);
	}

	foreach ($numbers as $number) {
		check_number($number, $err_msg);
	}
	
	return true;
}

function check_array_number($array, $err_msg)
{
	if ($array == null || empty($array)) {
		return true;
	}

	foreach ($array as $value) {
		check_number($value, $err_msg);
	}

	return true;
}


function check_url($url, $err_msg)
{
	return check_string($url, $err_msg);
}

?>
