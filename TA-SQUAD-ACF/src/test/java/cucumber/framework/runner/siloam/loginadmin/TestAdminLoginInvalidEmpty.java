package cucumber.framework.runner.siloam.loginadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAdminLoginInvalidEmpty {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestAdminLoginInvalidEmpty() {
		driver = AdminLoginOutlineHooks.driver;
		extentTest = AdminLoginOutlineHooks.extentTest;
	}
	
	@When("Siloam015 Admin Mengakses Halaman Website")
	public void siloam015_admin_mengakses_halaman_website() {
		driver.get(Constants.URL_SILOAM);
		extentTest.log(LogStatus.PASS, "Siloam015 Sales Mengakses Halaman Website Siloam");
	  
	}

	@When("^Siloam015 Admin Memasukan (.*) dan (.*) Salah$")
	public void siloam015_admin_memasukan_username_dan_password_salah(String username, String password) {
		System.out.println("admin_memasukan_username_dan_password_salah : "+username+" pwd : "+password);
		loginPage.login(username, password);
		extentTest.log(LogStatus.PASS, "Siloam015 Admin Memasukan username dan password Salah");
	}

	@When("Siloam015 Admin Menekan Tombol Login")
	public void siloam015_admin_menekan_tombol_login() {
		loginPage.btnLogin();;
		extentTest.log(LogStatus.PASS, "Siloam015 Admin Menekan Tombol Login");
	}

	@Then("Siloam015 Validasi pesan pada halaman login")
	public void siloam015_validasi_pesan_pada_halaman_login() {
//		String msgInvalidErrorEmpty = "Please fill out this field.";
//		assertTrue(loginPage.msgErrorEmpty().contains(msgInvalidErrorEmpty));
//		Assert.assertTrue(Boolean.parseBoolean(username.getAttribute("required")), "Username is required and message should be showin");
//		Assert.assertEquals(loginPage.msgErrorEmpty().);
		extentTest.log(LogStatus.PASS, "Siloam015 Validasi pesan pada halaman login");
	}

}
