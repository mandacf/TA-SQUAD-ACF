package cucumber.framework.runner.siloam.loginsales;

/*
created_by : Manda
created_date : 29/09/2022
updated_by : -
updated_date : -
*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/features/siloam/002ValidSalesLogin.feature"},
glue = "cucumber.framework.runner.siloam.loginsales",
monochrome=true,
plugin = {"pretty","html:target/siloam/htmlreport/LoginRunnerOutline.html",
		"json:target/siloam/jsonreport/LoginRunnerOutline.json",
		"junit:target/siloam/junitreport/LoginRunnerOutline.xml"})
public class SalesLoginOutlineRunner extends AbstractTestNGCucumberTests{}