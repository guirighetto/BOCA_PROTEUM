
<?php
class TestCaseDAO
{
	private $zipclass;
	public function SubmissionDAO(){
		$this->zipclass = new Zipfiles();
	}
	/**
 	 * Delete record from table
 	 */
	public function delete(){
	}
	
	/**
 	 * Insert record to table
 	 *
 	 */
	public function insert(){
	}
	
	/**
 	 * Update record in table
 	 *
 	 */
	public function update(){
	}
	/**
 	 * Update record in table
 	 *
 	 */
	public function read(){
	}

	public function readTestCases($problemnumber)
	{
		$sql = 'SELECT testcasenumber, problemnumber, input, output FROM testcasetable WHERE problemnumber = ?';
			   
		$sqlQuery = new SqlQuery($sql);					   
		$sqlQuery->setNumber($problemnumber);
		$answerSql = $this->execute($sqlQuery);
		$testCasesInput = array();
		$testCasesOutput = array();


		foreach ($answerSql as $row)
		{ 
			$testCasesInput[] = $row->input;
			$testCasesOutput[] = $row->output;
		}
		
		return $testCasesInput, $testCasesOutput;	
	}
 
	/**
 	 * Read record in table
 	 *
 	 */
	public function readAll($contestnumber)
	{
		$sql = 'SELECT testcasenumber, problemnumber, input, output FROM testcasetable';
		$sqlQuery = new SqlQuery($sql);	
		$sqlQuery->setNumber($contestnumber);
		$answerSql = $this->execute($sqlQuery);
		$allTestCasesInput = array();
		$allTestCasesOutput = array();
		
		foreach ($answerSql as $row)
		{
			$allTestCasesInput[$row->problemnumber] = $row->input;
			$allTestCasesOutput[$row->problemnumber] = $row->output; 
		}

		return $allTestCasesInput, $allTestCasesOutput;
		
	}
	/**
	 * Execute sql query
	 */
	protected function execute($sqlQuery){
		$queryExecutor = new QueryExecutor();
		return $queryExecutor->execute($sqlQuery);
	}
	/**
	 * Execute export data
	 */
	protected function executeExport($name, $id, $path){
		$queryExecutor = new QueryExecutor();
		return $queryExecutor->executeExport($name, $id, $path);
	}	
		
	/**
	 * Execute sql query update
	 */
	protected function executeUpdate($sqlQuery){
		$queryExecutor = new QueryExecutor();		
		return $queryExecutor->executeUpdate($sqlQuery);
	}
	/**
	 * Insert row to table
	 */
	protected function executeInsert($sqlQuery){
		return QueryExecutor::executeInsert($sqlQuery);
	}
}
?>