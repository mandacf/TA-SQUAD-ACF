package cucumber.framework.runner.siloam.loginadmin;

/*
created_by : Novri
created_date : 29/09/2022
updated_by : -
updated_date : -
*/

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAdminLoginValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestAdminLoginValid() {
		driver = AdminLoginOutlineHooks.driver;
		extentTest = AdminLoginOutlineHooks.extentTest;
	}
	
	@When("Siloam001 Admin Mengakses Halaman Website")
	public void siloam001_admin_mengakses_halaman_website() {
		driver.get(Constants.URL_SILOAM);
		extentTest.log(LogStatus.PASS, "Siloam001 Admin Mengakses Halaman Website Siloam");
	}

	@When("^Siloam001 Admin Input (.*) dan (.*) Valid$")
	public void siloam001_admin_input_username_dan_password_valid(String username, String password) {
		System.out.println("admin_input_username_dan_password_valid : "+username+" pwd : "+password);
		loginPage.login(username, password);
		extentTest.log(LogStatus.PASS, "Siloam001 Admin Input Username dan Password Valid");
	}

	@When("Siloam001 Admin Menekan Tombol Login")
	public void siloam001_admin_menekan_tombol_login() {
		loginPage.btnLogin();;
		extentTest.log(LogStatus.PASS, "Siloam001 Admin Menekan Tombol Login");
	}

	@Then("Siloam001 Validasi Nama Admin di Halaman Home Page")
	public void siloam001_validasi_nama_admin_di_halaman_home_page() {
		String salesName = "ELVA YUNDRA RINDYANA";
		assertEquals(loginPage.getTxtUserInfo(), salesName);
		extentTest.log(LogStatus.PASS, "Siloam001 Validasi Nama Admin di Halaman Home Page");
	}
	
}