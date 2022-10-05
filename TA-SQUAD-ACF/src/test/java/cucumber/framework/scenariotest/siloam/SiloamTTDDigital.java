package cucumber.framework.scenariotest.siloam;

/*
created_by : Manda
created_date : 02/10/2022
updated_by : 
updated_date : 
*/

public enum SiloamTTDDigital {
	
		T1("Siloam100 Sales Update Data Satu Kombinasi"),
	    T2("Siloam105 Sales Update Data Dua Kombinasi"),
	 	T3("Siloam110 Sales Update Data Tiga Kombinasi"),
		T4("Siloam115 Sales Update Data Empat Kombinasi");
		
		private String testName;
		
		private SiloamTTDDigital(String value) {
			testName = value;
		}
		
		public String getTestName() {
			return testName;
		}	

}
