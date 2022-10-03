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
	private String updateStrBpjs;
	private String updateStrNoKTP;
	private String updateStrAlamat;
	private String updateStrKotaKTP;
	private String updateStrFaskesAwal;
	private String updateStrFaskesTujuan;
	private String updateStrAlasan;
	
	public TestTTDPageKombinasiSatu() {
		driver = TandaTanganDigitalOutlineHooks.driver;
		extentTest = TandaTanganDigitalOutlineHooks.extentTest;
	}
	
	@When("Siloam100 Sales Mengakses Halaman Website")
	public void siloam100_sales_mengakses_halaman_website() {
		driver.get(Constants.URL_SILOAM);
		ttdPage.login(Constants.USERNAME_SALES_SILOAM,Constants.PASSWORD_SALES_SILOAM );
		ttdPage.btnLogin();
		extentTest.log(LogStatus.PASS, "Siloam100 Sales Mengakses Halaman Website");
	}
	
	@Then("Siloam100 Validasi sales masuk ke halaman ttd digital")
	public void siloam100_sales_sudah_login_dan_berada_di_halaman_ttd_digital() {
		driver.get("https://dev.ptdika.com/siloam/sales/input/ttd_digital2/568");
		extentTest.log(LogStatus.PASS, "Siloam100 Validasi sales masuk ke halaman ttd digital");
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
			strKotaKTP = "";	
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
		updateStrBpjs = nomBpjs;
		updateStrNoKTP = nomKtp;
		updateStrAlamat = address;
		updateStrKotaKTP = kotaKTP;
		updateStrFaskesAwal = faskesAwal;
		updateStrFaskesTujuan = faskesTujuan;
		updateStrAlasan = alasan;
		
		
		ttdPage.update(nama, nomBpjs, nomKtp, address, kotaKTP, faskesAwal, faskesTujuan, alasan);
		extentTest.log(LogStatus.PASS, "Siloam100 Sales Melakukan Update Pada nama, nomorBPJS, nomorKTP, address, kotaKTP, faskesAwal, faskesTujuan, dan alasan");
	}

	@When("Siloam100 Sales tekan tombol Simpan")
	public void siloam100_sales_tekan_tombol_simpan() {
		ttdPage.btnUpdate();
		extentTest.log(LogStatus.PASS, "Siloam100 Sales tekan tombol Simpan");
	}

	@Then("Siloam100 Validasi Data tersimpan dan form ter-update")
	public void siloam100_validasi_data_tersimpan_dan_form_ter_update() {
		if(strNama != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtName(), updateStrName);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
			
		} 
		if (strBpjs != "") {
			String txtExpected = "Data berhasil Di Simpan";
			System.out.println(ttdPage.msgSuccessUpdate());
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
//			System.out.println(ttdPage.getTxtNoBPJS());
//			System.out.println(updateStrBpjs);
			assertEquals(ttdPage.getTxtNoBPJS(), updateStrBpjs);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (strNoKTP != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtNomKtp(), updateStrNoKTP);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (strAlamat != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtAddress(), updateStrAlamat);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (strKotaKTP != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertTrue(ttdPage.getTxtKotaKTP().contains(updateStrKotaKTP));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (strFaskesAwal != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtFaskesAwal(), updateStrFaskesAwal);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (strFaskesTujuan != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			System.out.println(ttdPage.getTxtFaskesTujuan());
			System.out.println(updateStrFaskesTujuan);
			assertTrue(ttdPage.getTxtFaskesTujuan().contains(updateStrFaskesTujuan));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (strAlasan != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtAlasan(), updateStrAlasan);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		
		extentTest.log(LogStatus.PASS, "Siloam100 Validasi Data tersimpan dan form ter-update");
	    
	}

}
