package cucumber.framework.runner.siloam.login;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSalesLoginInvalid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestSalesLoginInvalid() {
		driver = LoginOutlineHooks.driver;
		extentTest = LoginOutlineHooks.extentTest;
	}
	
	@When("Siloam018 Sales Mengakses Halaman Website")
	public void siloam018_sales_mengakses_halaman_website() {
		driver.get(Constants.URL_SILOAM);
		extentTest.log(LogStatus.PASS, "Siloam018 Sales Mengakses Halaman Website");
	}

	@When("^Siloam018 Sales Memasukan (.*) dan (.*) Salah$")
	public void siloam018_sales_memasukan_username_dan_password_salah(String username, String password) {
		System.out.println("sales_memasukan_username_dan_password_salah : "+username+" pwd : "+password);
		loginPage.login(username, password);
		extentTest.log(LogStatus.PASS, "Siloam018 Sales Memasukan username dan password Salah");
	}

	@When("Siloam018 Sales Menekan Tombol Login")
	public void siloam018_sales_menekan_tombol_login() {
		loginPage.btnLogin();;
		extentTest.log(LogStatus.PASS, "Siloam018 Sales Menekan Tombol Login");
	}

	@Then("Siloam018 Validasi pesan pada halaman login")
	public void siloam018_validasi_pesan_pada_halaman_login() {
		String msgInvalidError = "Wrong username or password!";
		assertTrue(loginPage.msgInvalid().contains(msgInvalidError));
		extentTest.log(LogStatus.PASS, "Siloam018 Validasi pesan pada halaman login");
	}
}
