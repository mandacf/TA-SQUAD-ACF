package cucumber.framework.runner.siloam.login;

/*
created_by : Novri
created_date : 29/09/2022
updated_by : manda
updated_date : 30/09/2022
*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/test/resources/features/siloam/001ValidAdminLogin.feature",
		"src/test/resources/features/siloam/005ValidSalesLogin.feature",
		"src/test/resources/features/siloam/010InvalidAdminLogin.feature",
		"src/test/resources/features/siloam/015InvalidAdminLoginEmpty.feature",
		"src/test/resources/features/siloam/018InvalidSalesLogin.feature",
		"src/test/resources/features/siloam/019InvalidSalesLoginEmpty.feature",
		},
glue = "cucumber.framework.runner.siloam.login",
monochrome=true,
plugin = {"pretty","html:target/siloam/htmlreport/LoginRunnerOutline.html",
		"json:target/siloam/jsonreport/LoginRunnerOutline.json",
		"junit:target/siloam/junitreport/LoginRunnerOutline.xml"})
public class LoginOutlineRunner extends AbstractTestNGCucumberTests{}