package cucumber.framework.runner.siloam.ttddigital;

//#created_by : Alamanda
//#created_date : 31/09/2022
//#updated_by : Alamanda
//#updated_date : 3/10/2022 

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/test/resources/features/siloam/100UpdateDataSalesSatuKombinasi.feature",
		"src/test/resources/features/siloam/105UpdateDataSalesDuaKombinasi.feature",
		"src/test/resources/features/siloam/110UpdateDataSalesTigaKombinasi.feature",
		},
glue = "cucumber.framework.runner.siloam.ttddigital",
monochrome=true,
plugin = {"pretty","html:target/siloam/htmlreport/TTDDigitalRunnerOutline.html",
		"json:target/siloam/jsonreport/TTDDigitalRunnerOutline.json",
		"junit:target/siloam/junitreport/TTDDigitalRunnerOutline.xml"})

public class TandaTanganDigitalOutlineRunner extends AbstractTestNGCucumberTests{}

