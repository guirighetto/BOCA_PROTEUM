<?php
	require_once(__DIR__ . '/submissionDaoFiles/includeDAO.php');
	$submissionDAO = new SubmissionDAO();
	$objSubmission = $submissionDAO->read(1,5,1); //contestes, runnumber, problemnumber
	var_dump($objSubmission);
?>
