package cucumber.framework.runner.siloam.ttddigital;

//#created_by : Alamanda
//#created_date : 31/09/2022
//#updated_by : Alamanda
//#updated_date : 3/10/2022

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
//import cucumber.framework.scenariotest.siloam.SiloamLogin;
import cucumber.framework.scenariotest.siloam.SiloamTTDDigital;
import cucumber.framework.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TandaTanganDigitalOutlineHooks {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/siloam/extentreport/siloam-sales-Update TTD Digital-outline.html");
	private static SiloamTTDDigital[] tests = SiloamTTDDigital.values();
	private static final int[] DATA_OUTLINE = {9,29,59,71, 57};
	private String testReport = "";
//	9,29,59,
	
	@Before
	public void setUp() {		
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		testReport = tests[Utils.testCount].getTestName();
		extentTest = reports.startTest(testReport);
//		System.out.println("COUNT OUTLINE VALUE : "+Utils.countOutline+" TEST COUNT VALUE : "+Utils.testCount+" NILAI INDEX : "+DATA_OUTLINE VALUE [Utils.testCount]);		
		if(Utils.countOutline==DATA_OUTLINE[Utils.testCount])
		{
			Utils.countOutline=0;
			Utils.testCount++;
		}
		Utils.countOutline++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, "Siloam_TandaTanganDigitalOutlineHooks"+scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));;
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
//	@AfterTest
	@AfterAll
	public static void closeBrowser() {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		DriverSingleton.closeObjectInstance();
	}

}
