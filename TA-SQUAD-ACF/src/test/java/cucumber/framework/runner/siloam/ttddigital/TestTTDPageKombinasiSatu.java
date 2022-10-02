package cucumber.framework.runner.siloam.ttddigital;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.TandaTanganDigitalPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTTDPageKombinasiSatu {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private TandaTanganDigitalPage ttdPage = new TandaTanganDigitalPage();
	private String strNama;
	private String strBpjs;
	private String strNoKTP;
	private String strAlamat;
	private String strKotaKTP;
	private String strFaskesAwal;
	private String strFaskesTujuan;
	private String strAlasan;
	private String updateStrName;
	private String updatestrBpjs;
	
	public TestTTDPageKombinasiSatu() {
		driver = TandaTanganDigitalOutlineHooks.driver;
		extentTest = TandaTanganDigitalOutlineHooks.extentTest;
	}
	
	@When("Siloam100 Sales Sudah Login dan Berada di Halaman TTD Digital")
	public void siloam100_sales_sudah_login_dan_berada_di_halaman_ttd_digital() {
		driver.get(Constants.URL_SILOAM);
		ttdPage.login(Constants.USERNAME_SALES_SILOAM,Constants.PASSWORD_SALES_SILOAM );
		ttdPage.btnLogin();
		driver.get("https://dev.ptdika.com/siloam/sales/input/ttd_digital2/568");
		extentTest.log(LogStatus.PASS, "Siloam100 Sales Sudah Login dan Berada di Halaman TTD Digital");
	}

	@When("Siloam100 Sales Tekan Tombol Edit")
	public void siloam100_sales_tekan_tombol_edit() {
	   ttdPage.btnEdit();
	   extentTest.log(LogStatus.PASS, "Siloam100 Sales Tekan Tombol Edit");
	}
	
//	Siloam100 Sales Melakukan Update Pada nama, nomorBPJS, nomorKTP, alamat, kotaKTP, faskesAwal, faskesTujuan, dan alasan

	@When("^Siloam100 Sales Melakukan Update Pada (.*), (.*), (.*), (.*), (.*), (.*), (.*), dan (.*)$")
	public void siloam100_sales_melakukan_update_pada_nama_nomor_bpjs_nomor_ktp_address_kota_ktp_faskes_awal_faskes_tujuan_dan_alasan(String nama, String nomBpjs,String nomKtp, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		if(nama == "") {
			strNama = "";
		}
		if(nomBpjs == "") {
			strBpjs = "";
		} 
		if(nomKtp == "") {
			strNoKTP = "";
		}
		if(address == "") {
			strAlamat = "";
		}
		if(kotaKTP == "") {
			strNoKTP = "";	
		}
		if(faskesAwal == "") {
			strFaskesAwal = "";
		}
		if(faskesTujuan == "") {
			strFaskesTujuan = "";
		}
		if(alasan == "") {
			strAlasan = "";
		}
		
		updateStrName = nama;
		updatestrBpjs = nomBpjs;
		
		
		ttdPage.update(nama, nomBpjs, nomKtp, address, kotaKTP, faskesAwal, faskesTujuan, alasan);
		extentTest.log(LogStatus.PASS, "Siloam100 Sales Melakukan Update Pada nama, nomorBPJS, nomorKTP, address, kotaKTP, faskesAwal, faskesTujuan, dan alasan");
	}

	@When("Siloam100 Sales tekan tombol Simpan")
	public void siloam100_sales_tekan_tombol_simpan() {
		ttdPage.btnUpdate();
		extentTest.log(LogStatus.PASS, "Siloam100 Sales tekan tombol Simpan");
	}

	@Then("Siloam100 Validasi Data tersimpan dan form Nama ter-update")
	public void siloam100_validasi_data_tersimpan_dan_form_nama_ter_update() {
		if(strBpjs == "" && strNoKTP == "" && strAlamat == "" && strNoKTP == "" && strFaskesAwal == "" && strFaskesTujuan == "" && strAlasan == "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtName(), updateStrName);
			Utils.delay(Constants.TIMEOUT_DELAY, txtExpected);
			
		} 
		if (strNama == "" && strNoKTP == "" && strAlamat == "" && strNoKTP == "" && strFaskesAwal == "" && strFaskesTujuan == "" && strAlasan == "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtNoBPJS(), updatestrBpjs);
			Utils.delay(Constants.TIMEOUT_DELAY, txtExpected);
		}
		
		extentTest.log(LogStatus.PASS, "Siloam100 Validasi Data tersimpan dan form Nama ter-update");
	    
	}

}
