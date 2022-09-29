package cucumber.framework.page.siloam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.framework.connection.DriverSingleton;


public class TandaTanganDigitalPage {
	
private WebDriver driver;
	
	public TandaTanganDigitalPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	
//DATA
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
	
	@FindBy(xpath = "//button[@id='btnEdit']")
	//input[contains(@attr, 'value')]
	private WebElement edit;
	
	@FindBy(xpath = "//button[@id='btnUpdate']")
	//input[contains(@attr, 'value')]
	private WebElement update;
	
	@FindBy(xpath = "//button[@id='btnCancelUpdate']")
	//input[contains(@attr, 'value')]
	private WebElement cancelUpdate;
	
	
//DOKUMEN
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
	//input[contains(@attr, 'value')]
	private WebElement bfImage;

	

//UPLOAD DOKUMEN
//UPLOAD DOKUMEN kolom File Upload
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]/span[1]")
	//input[contains(@attr, 'value')]
	private WebElement imgBefore;
//UPLOAD DOKUMEN kolom Kontrol
	@FindBy(xpath = "//form[@id='fileupload']/div/table/tbody/tr[3]/td[4]/a/i")
	//input[contains(@attr, 'value')]
	private WebElement uploadFile;
	
	@FindBy(xpath = "//input[@id='file']")
	//input[contains(@attr, 'value')]
	private WebElement file;
	
	@FindBy(xpath = "//button[@id='btnSaveFoto']")
	//input[contains(@attr, 'value')]
	private WebElement saveFoto;
	
	@FindBy(xpath = "//button[@class='btn btn-danger pull-left']")
	//input[contains(@attr, 'value')]
	private WebElement cancelUpload;

	


	
	
//DATA	
	public void updateName(String nama) {
		this.nama.sendKeys(nama);
	}
	
	public void updateNoBPJS(String nomBpjs) {
		this.nomBpjs.sendKeys(nomBpjs);
	}
	
	public void updateNomKtp(String nomKtp) {
		this.nomKtp.sendKeys(nomKtp);
	}
	
	public void updateAddress(String address) {
		this.address.sendKeys(address);
	}
	
	public void updateKotaKTP(String kotaKTP) {
		this.kotaKTP.sendKeys(kotaKTP);
	}
	
	public void updateFaskesAwal(String faskesAwal) {
		this.faskesAwal.sendKeys(faskesAwal);
	}
	
	public void updateFaskesTujuan(String faskesTujuan) {
		this.faskesTujuan.sendKeys(faskesTujuan);
	}
	
	public void updateAlasan(String alasan) {
		this.alasan.sendKeys(alasan);
	}
	
	public void btnEdit() {
		this.edit.click();
	}
	
	public void btnUpdate() {
		this.update.click();
	}
	
	public void btncancelUpdate() {
		this.cancelUpdate.click();
	}

}
