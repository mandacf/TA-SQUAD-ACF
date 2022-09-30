package cucumber.framework.scenariotest.siloam;

/*
created_by : Novri
created_date : 29/09/2022
updated_by : -
updated_date : -
*/

public enum SiloamLogin {

//	T1("Siloam001 Admin Valid Login Username");
	T2("Siloam010 Admin Invalid Login Username");
	
	private String testName;
	
	private SiloamLogin(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
