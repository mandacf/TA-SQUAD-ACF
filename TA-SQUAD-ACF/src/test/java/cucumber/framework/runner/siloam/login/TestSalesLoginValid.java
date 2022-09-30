package cucumber.framework.runner.siloam.login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestSalesLoginValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestSalesLoginValid() {
		driver = LoginOutlineHooks.driver;
		extentTest = LoginOutlineHooks.extentTest;
	}
	
	@When("Siloam005 Sales Mengakses Halaman Website")
	public void siloam005_sales_mengakses_halaman_website() {
		driver.get(Constants.URL_SILOAM);
		extentTest.log(LogStatus.PASS, "Siloam005 Sales Mengakses Halaman Website Siloam");
	  
	}

	@When("^Siloam005 Sales Input (.*) dan (.*) Valid$")
	public void siloam005_sales_input_username_dan_password_valid(String username, String password) {
		System.out.println("sales_input_username_dan_password_valid : "+username+" pwd : "+password);
		loginPage.login(username, password);
		extentTest.log(LogStatus.PASS, "Siloam005 Sales Input Username dan Password Valid");
	    
	}

	@When("Siloam005 Sales Menekan Tombol Login")
	public void siloam005_sales_menekan_tombol_login() {
		loginPage.btnLogin();;
		extentTest.log(LogStatus.PASS, "Siloam005 Sales Menekan Tombol Login");
	}

	@Then("Siloam005 Validasi Nama Sales di Halaman Home Page")
	public void siloam005_validasi_nama_sales_di_halaman_home_page() {
		String salesName = "ELVA YUNDRA RINDYANA";
		assertEquals(loginPage.getTxtUserInfo(), salesName);
		extentTest.log(LogStatus.PASS, "Siloam005 Validasi Nama Admin di Halaman Home Page");
	   
	}

}
