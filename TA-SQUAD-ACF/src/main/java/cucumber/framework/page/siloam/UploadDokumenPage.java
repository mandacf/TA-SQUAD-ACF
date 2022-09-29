package cucumber.framework.page.siloam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.framework.connection.DriverSingleton;

public class UploadDokumenPage {
	
private WebDriver driver;
	
	public UploadDokumenPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//UPLOAD DOKUMEN
	@FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
	//input[contains(@attr, 'value')]
	private WebElement uploadImgAwal;
	
	@FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
	//input[contains(@attr, 'value')]
	private WebElement uploadImgTujuan;
	
	@FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
	//input[contains(@attr, 'value')]
	private WebElement uploadImgDigital;
	
	@FindBy(xpath = "//input[@id='file']")
	//input[contains(@attr, 'value')]
	private WebElement file;
	
	@FindBy(xpath = "//button[@id='btnSave']")
	//input[contains(@attr, 'value')]
	private WebElement Save;
	
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	//input[contains(@attr, 'value')]
	private WebElement Cancel;
	
	//UPLOAD DOKUMEN
	public void uploadDocImgAwal() {
		uploadImgAwal.click();
	}
	
	public void uploadDocImgTujuan() {
		uploadImgTujuan.click();
	}
	
	public void uploadDocImgDigital() {
	uploadImgDigital.click();
	}
	
	public void btnAddFile() {
		file.click();
	}
	
	public void btnSave() {
		Save.click();
	}
	
	public void btnCancel() {
		Cancel.click();
	}

}
