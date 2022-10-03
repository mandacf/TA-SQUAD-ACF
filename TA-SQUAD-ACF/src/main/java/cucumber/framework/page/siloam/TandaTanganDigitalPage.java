package cucumber.framework.page.siloam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/*
created_by : Manda
created_date : 30/09/2022
updated_by : -
updated_date : -
*/ 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;


public class TandaTanganDigitalPage extends LoginPage{
	
private WebDriver driver;
	
	public TandaTanganDigitalPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

//PAGE NEW
	@FindBy(xpath = "//a[@href='https://dev.ptdika.com/siloam/sales/new_data']")
	//input[contains(@attr, 'value')]
	private WebElement pageNew;
	
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
	
	@FindBy(xpath = "//input[@role='textbox']")
	//input[contains(@attr, 'value')]
	private WebElement txtBox;
	
	
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
	
	@FindBy(xpath = "//div[@role='alert']")
	//input[contains(@attr, 'value')]
	private WebElement msgSuccess;
	
	
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
	
	public void update(String nama, String nomBpjs,String nomKtp, String address, String srkotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		Robot robot = new Robot();
		
		if(nama != "") {
			clearName();
			updateName(nama);
		}
		if(nomBpjs != "") {
			clearNomBpjs();
			updateNoBPJS(nomBpjs);
		} 
		if(nomKtp != "") {
			clearNomKtp();
			updateNomKtp(nomKtp);
		}
		if(address != "") {
			clearAddress();
			updateAddress(address);
		}
		if(srkotaKTP != "") {
			clickKotaKTP();
			updateKotaKTP(srkotaKTP);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
//			Select skotaKtp = new Select(kotaKTP);
//			skotaKtp.selectByValue(srkotaKTP);
		}
		if(faskesAwal != "") {
			clearfaskesAwal();
			updateFaskesAwal(faskesAwal);
		}
		if(faskesTujuan != "") {
			clickFaskesTujuan();
			updateFaskesTujuan(faskesTujuan);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		if(alasan != "") {
			clearAlasan();
			updateAlasan(alasan);
		}
		
	}

	
//PAGE NEW
	public void menuNew() {
		this.pageNew.click();
	}
	
//DATA	
	
	//Nama
	public String getTxtName() {		
		return nama.getAttribute("value");
	}
	
	public void clearName() {
		this.nama.clear();
	}
	
	public void updateName(String nama) {
		this.nama.sendKeys(nama);
	}
	
	//No BPJS
	public void clearNomBpjs() {
		this.nomBpjs.clear();
	} 
	
	public void updateNoBPJS(String nomBpjs) {
		this.nomBpjs.sendKeys(nomBpjs);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtNoBPJS() {		
		return nomBpjs.getAttribute("value");
	}
	
	//No KTP
	public void clearNomKtp() {
		this.nomKtp.clear();
	} 
	
	public void updateNomKtp(String nomKtp) {
		this.nomKtp.sendKeys(nomKtp);
	}
	
	public String getTxtNomKtp() {		
		return nomKtp.getAttribute("value");
	}
	
	//Address
	public void clearAddress() {
		this.address.clear();
	} 
	
	public void updateAddress(String address) {
		this.address.sendKeys(address);
	}
	
	public String getTxtAddress() {		
		return address.getAttribute("value");
	}
	
	//Kota KTP
	public String getTxtKotaKTP() {		
		return kotaKTP.getAttribute("title");
	}
	
	public void clickKotaKTP() {
		this.kotaKTP.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	} 
	
	public void updateKotaKTP(String kotaKTP) {
		this.txtBox.sendKeys(kotaKTP);
	}
	
	//Faskes Awal
	public void clearfaskesAwal() {
		this.faskesAwal.clear();
	} 
	
	public void updateFaskesAwal(String faskesAwal) {
		this.faskesAwal.sendKeys(faskesAwal);
	}
	
	public String getTxtFaskesAwal() {		
		return faskesAwal.getAttribute("value");
	}
	
	//Faskes Tujuan
	public void clickFaskesTujuan() {
		this.faskesTujuan.click();
	}
	
	public void updateFaskesTujuan(String faskesTujuan) {
		this.txtBox.sendKeys(faskesTujuan);
	}
	
	public String getTxtFaskesTujuan() {		
		return faskesTujuan.getAttribute("title");
	}
	
	//Alasan
	public void clearAlasan() {
		this.alasan.clear();
	} 
	
	public void updateAlasan(String alasan) {
		this.alasan.sendKeys(alasan);
	}
	
	public String getTxtAlasan() {		
		return alasan.getAttribute("value");
	}
	
	
	public void btnEdit() {
		this.edit.click();
	}
	
	public void btnUpdate() {
		this.update.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btncancelUpdate() {
		this.cancelUpdate.click();
	}
	
	public String msgSuccessUpdate() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgSuccess);
	}

}
