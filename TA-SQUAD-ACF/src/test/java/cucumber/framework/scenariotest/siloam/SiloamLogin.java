package cucumber.framework.scenariotest.siloam;

/*
created_by : Novri
created_date : 29/09/2022
updated_by : Manda
updated_date : 30/09/2022
*/

public enum SiloamLogin {

//	T1("Siloam001 Admin Valid Login Username"),
//	T2("Siloam005 Sales Valid Login Username"),
	T3("Siloam010 Admin Invalid Login Username"),
	T4("Siloam015 Admin Invalid Login Username Empty"),
	T5("Siloam018 Sales Invalid Login Username"),
	T6("Siloam019 Sales Invalid Login Username Empty");
	
	private String testName;
	
	private SiloamLogin(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
