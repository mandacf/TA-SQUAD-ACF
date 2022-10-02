package cucumber.framework.scenariotest.siloam;

/*
created_by : Manda
created_date : 02/10/2022
updated_by : 
updated_date : 
*/

public enum SiloamTTDDigital {
	
		T1("Siloam100 Sales Update Data Satu Kombinasi");
		
		private String testName;
		
		private SiloamTTDDigital(String value) {
			testName = value;
		}
		
		public String getTestName() {
			return testName;
		}	

}
