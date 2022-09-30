package cucumber.framework.runner.siloam.loginadmin;

/*
created_by : Novri
created_date : 29/09/2022
updated_by : -
updated_date : -
*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
//		"src/test/resources/features/siloam/001ValidAdminLogin.feature",
//		"src/test/resources/features/siloam/010InvalidAdminLogin.feature"
		"src/test/resources/features/siloam/015InvalidAdminLoginEmpty.feature"
		},
glue = "cucumber.framework.runner.siloam.loginadmin",
monochrome=true,
plugin = {"pretty","html:target/siloam/htmlreport/LoginRunnerOutline.html",
		"json:target/siloam/jsonreport/LoginRunnerOutline.json",
		"junit:target/siloam/junitreport/LoginRunnerOutline.xml"})
public class AdminLoginOutlineRunner extends AbstractTestNGCucumberTests{}