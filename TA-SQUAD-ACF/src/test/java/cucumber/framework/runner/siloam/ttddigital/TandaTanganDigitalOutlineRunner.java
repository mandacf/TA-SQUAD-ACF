package cucumber.framework.runner.siloam.ttddigital;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/test/resources/features/siloam/100UpdateDataSalesSatuKombinasi.feature",
		},
glue = "cucumber.framework.runner.siloam.ttddigital",
monochrome=true,
plugin = {"pretty","html:target/siloam/htmlreport/TTDDigitalRunnerOutline.html",
		"json:target/siloam/jsonreport/TTDDigitalRunnerOutline.json",
		"junit:target/siloam/junitreport/TTDDigitalRunnerOutline.xml"})

public class TandaTanganDigitalOutlineRunner extends AbstractTestNGCucumberTests{}

