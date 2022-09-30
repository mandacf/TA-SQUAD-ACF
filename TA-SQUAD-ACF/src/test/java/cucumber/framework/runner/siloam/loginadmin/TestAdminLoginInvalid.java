package cucumber.framework.runner.siloam.loginadmin;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.LoginPage;
import cucumber.framework.runner.siloam.loginsales.SalesLoginOutlineHooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAdminLoginInvalid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestAdminLoginInvalid() {
		driver = AdminLoginOutlineHooks.driver;
		extentTest = AdminLoginOutlineHooks.extentTest;
	}
	
	@When("Siloam010 Admin Mengakses Halaman Website")
	public void siloam010_admin_mengakses_halaman_website() {
		driver.get(Constants.URL_SILOAM);
		extentTest.log(LogStatus.PASS, "Siloam010 Sales Mengakses Halaman Website Siloam");
	  
	}

	@When("^Siloam010 Admin Memasukan (.*) dan (.*) Salah$")
	public void siloam010_admin_memasukan_username_dan_password_salah(String username, String password) {
		System.out.println("admin_memasukan_username_dan_password_salah : "+username+" pwd : "+password);
		loginPage.login(username, password);
		extentTest.log(LogStatus.PASS, "Siloam010 Admin Memasukan username dan password Salah");
	}

	@When("Siloam010 Admin Menekan Tombol Login")
	public void siloam010_admin_menekan_tombol_login() {
		loginPage.btnLogin();;
		extentTest.log(LogStatus.PASS, "Siloam010 Admin Menekan Tombol Login");
	}

	@Then("Siloam010 Validasi pesan pada halaman login")
	public void siloam010_validasi_pesan_pada_halaman_login() {
		String msgInvalidError = "Wrong username or password!";
		assertTrue(loginPage.msgInvalid().contains(msgInvalidError));
		extentTest.log(LogStatus.PASS, "Siloam010 Validasi pesan pada halaman login");
	}
}
