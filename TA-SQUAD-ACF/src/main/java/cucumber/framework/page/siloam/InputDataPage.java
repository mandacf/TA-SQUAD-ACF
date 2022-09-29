package cucumber.framework.page.siloam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class InputDataPage {
	
private WebDriver driver;
	
	public InputDataPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	//INPUT DATA
	@FindBy(xpath = "//input[@id='name']")
	//input[contains(@attr, 'value')]
	private WebElement nama;
	
	@FindBy(xpath = "//input[@id='no_bpjs']")
	//input[contains(@attr, 'value')]
	private WebElement nomBpjs;
	
	@FindBy(xpath = "//input[@id='no_ktp']")
	//input[contains(@attr, 'value')]
	private WebElement nomKtp;
	
	@FindBy(xpath = "//textarea[@id='address']")
	//input[contains(@attr, 'value')]
	private WebElement address;
	
	@FindBy(xpath = "//span[@id='select2-ktp_city-container']")
	//input[contains(@attr, 'value')]
	private WebElement kotaKTP;
	
	@FindBy(xpath = "//input[@id='origin_faskes']")
	//input[contains(@attr, 'value')]
	private WebElement faskesAwal;
	
	@FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
	//input[contains(@attr, 'value')]
	private WebElement faskesTujuan;
	
	@FindBy(xpath = "//textarea[@id='reason']")
	//input[contains(@attr, 'value')]
	private WebElement alasan;
	
	@FindBy(xpath = "//button[@type='submit']")
	//input[contains(@attr, 'value')]
	private WebElement submit;
	
	@FindBy(xpath = "//span[normalize-space()='Field Alamat Harus Diisi!']")
	//input[contains(@attr, 'value')]
	private WebElement msgAlamat;
	
	@FindBy(xpath = "//span[normalize-space()='The Nomor BPJS already exist.']")
	//input[contains(@attr, 'value')]
	private WebElement msgBPJS;
	
	@FindBy(xpath = "//span[normalize-space()='Field Alasan Harus Diisi!']")
	//input[contains(@attr, 'value')]
	private WebElement msgAlasan;
	
	//INPUT DATA
	public void inputName(String nama) {
		this.nama.sendKeys(nama);
	}
	
	public void inputNoBPJS(String nomBpjs) {
		this.nomBpjs.sendKeys(nomBpjs);
	}
	
	public void inputNomKtp(String nomKtp) {
		this.nomKtp.sendKeys(nomKtp);
	}
	
	public void inputAddress(String address) {
		this.address.sendKeys(address);
	}
	
	public void inputKotaKTP(String kotaKTP) {
		this.kotaKTP.sendKeys(kotaKTP);
	}
	
	public void inputFaskesAwal(String faskesAwal) {
		this.faskesAwal.sendKeys(faskesAwal);
	}
	
	public void inputFaskesTujuan(String faskesTujuan) {
		this.faskesTujuan.sendKeys(faskesTujuan);
	}
	
	public void inputAlasan(String alasan) {
		this.alasan.sendKeys(alasan);
	}
	
	public void btnSubmit() {
		this.submit.click();
	}
	
	public String msgErrorNama() {
		String msgNama = driver.findElement(By.name("name")).getAttribute("Please fill out this field.");
		return msgNama;
	}
	
	public String msgErrorBPJSEmpty() {
			String msgBPJSEmpty = driver.findElement(By.name("no_bpjs")).getAttribute("Please fill out this field.");
			return msgBPJSEmpty;
		
	}
	
	public String msgErrorBPJSCharacter() {
		String msgBPJSCharacter = driver.findElement(By.name("no_bpjs")).getAttribute("Please match the request format.");
		return msgBPJSCharacter;
	
	}
	
	public String msgErrorBPJSReady() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgBPJS);
	
	}
	
	public String msgErrorNoKTPEmpty() {
		String msgNoKTPEmpty = driver.findElement(By.name("no_ktp")).getAttribute("Please match the request format.");
		return msgNoKTPEmpty;
	
	}
	
	public String msgErrorNoKTPCharacter() {
		String msgNoKTPCharacter = driver.findElement(By.name("no_ktp")).getAttribute("Please match the request format.");
		return msgNoKTPCharacter;
	
	}
	
	public String msgErrorAlamat() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgAlamat);
	
	}
	
	public String msgErrorKotaKTP() {
		String msgKotaKTP = driver.findElement(By.id("select2-ktp_city-container")).getAttribute("Plese select an item in the list.");
		return msgKotaKTP;
	
	}
	
	public String msgErrorFaskesAwal() {
		String msgFaskesAwal = driver.findElement(By.name("origin_faskes")).getAttribute("Please fill out this field.");
		return msgFaskesAwal;
	
	}
	
	public String msgErrorFaskesTujuan() {
		String msgFaskesTujuan = driver.findElement(By.id("select2-destination_faskes-container")).getAttribute("Plese select an item in the list.");
		return msgFaskesTujuan;
	}
	
	public String msgErrorAlasan() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgAlasan);
	
	}

}
