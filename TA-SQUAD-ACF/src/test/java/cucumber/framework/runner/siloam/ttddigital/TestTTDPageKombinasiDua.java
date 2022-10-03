package cucumber.framework.runner.siloam.ttddigital;

//#created_by : Alamanda
//#created_date : 3/10/2022
//#updated_by : 
//#updated_date : 

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



public class TestTTDPageKombinasiDua {
	
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
	
	public TestTTDPageKombinasiDua() {
		driver = TandaTanganDigitalOutlineHooks.driver;
		extentTest = TandaTanganDigitalOutlineHooks.extentTest;
	}
	
	@When("Siloam105 Sales Mengakses Halaman Website")
	public void siloam105_sales_mengakses_halaman_website() {
		driver.get(Constants.URL_SILOAM);
		ttdPage.login(Constants.USERNAME_SALES_SILOAM,Constants.PASSWORD_SALES_SILOAM );
		ttdPage.btnLogin();
		extentTest.log(LogStatus.PASS, "Siloam105 Sales Mengakses Halaman Website");
	}

	@Then("Siloam105 Validasi sales masuk ke halaman ttd digital")
	public void siloam105_validasi_sales_masuk_ke_halaman_ttd_digital() {
		driver.get("https://dev.ptdika.com/siloam/sales/input/ttd_digital2/568");
		extentTest.log(LogStatus.PASS, "Siloam105 Validasi sales masuk ke halaman ttd digital");
	}

	@When("Siloam105 Sales Tekan Tombol Edit")
	public void siloam105_sales_tekan_tombol_edit() {
		ttdPage.btnEdit();
		   extentTest.log(LogStatus.PASS, "Siloam105 Sales Tekan Tombol Edit");
	}

	@When("^Siloam105 Sales Melakukan Update Pada (.*), (.*), (.*), (.*), (.*), (.*), (.*), dan (.*)$")
	public void siloam105_sales_melakukan_update_pada_nama_nomor_bpjs_nomor_ktp_address_kota_ktp_faskes_awal_faskes_tujuan_dan_alasan(String nama, String nomBpjs,String nomKtp, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan)throws AWTException {
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

	@When("Siloam105 Sales tekan tombol Simpan")
	public void siloam105_sales_tekan_tombol_simpan() {
		ttdPage.btnUpdate();
		extentTest.log(LogStatus.PASS, "Siloam105 Sales tekan tombol Simpan");
	}

	@Then("Siloam105 Validasi Data tersimpan dan form ter-update")
	public void siloam105_validasi_data_tersimpan_dan_form_ter_update() {
	//NAMA
		if(strNama != "" && strBpjs != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtName(), updateStrName);
			assertEquals(ttdPage.getTxtNoBPJS(), updateStrBpjs);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
		} 
		
		if(strNama != "" && strNoKTP != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtName(), updateStrName);
			assertEquals(ttdPage.getTxtNomKtp(), updateStrNoKTP);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		} 
		
		if(strNama != "" && strAlamat != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtName(), updateStrName);
			assertEquals(ttdPage.getTxtAddress(), updateStrAlamat);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
		} 
		if(strNama != "" && strKotaKTP != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtName(), updateStrName);
			assertTrue(ttdPage.getTxtKotaKTP().contains(updateStrKotaKTP));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
		} 
		if(strNama != "" && strFaskesAwal != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtName(), updateStrName);
			assertEquals(ttdPage.getTxtFaskesAwal(), updateStrFaskesAwal);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
		}
		if(strNama != "" && strFaskesTujuan != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtName(), updateStrName);
			assertTrue(ttdPage.getTxtFaskesTujuan().contains(updateStrFaskesTujuan));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
		}
		if(strNama != "" && strAlasan != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtName(), updateStrName);
			assertEquals(ttdPage.getTxtAlasan(), updateStrAlasan);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
		}
		
		//NO BPJS
		if(strBpjs != "" && strNoKTP != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtNoBPJS(), updateStrBpjs);
			assertEquals(ttdPage.getTxtNomKtp(), updateStrNoKTP);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		} 
		
		if(strBpjs != "" && strAlamat != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtNoBPJS(), updateStrBpjs);
			assertEquals(ttdPage.getTxtAddress(), updateStrAlamat);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
		} 
		if(strBpjs != "" && strKotaKTP != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtNoBPJS(), updateStrBpjs);
			assertTrue(ttdPage.getTxtKotaKTP().contains(updateStrKotaKTP));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
		} 
		if(strBpjs != "" && strFaskesAwal != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtNoBPJS(), updateStrBpjs);
			assertEquals(ttdPage.getTxtFaskesAwal(), updateStrFaskesAwal);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
		}
		if(strBpjs != "" && strFaskesTujuan != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtNoBPJS(), updateStrBpjs);
			assertTrue(ttdPage.getTxtFaskesTujuan().contains(updateStrFaskesTujuan));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
		}
		if(strBpjs != "" && strAlasan != "") {
			String txtExpected = "Data berhasil Di Simpan";
			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
			assertEquals(ttdPage.getTxtNoBPJS(), updateStrBpjs);
			assertEquals(ttdPage.getTxtAlasan(), updateStrAlasan);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
		}
		
		//NO KTP
//		if(strNoKTP != "" && strAlamat != "") {
//			String txtExpected = "Data berhasil Di Simpan";
//			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
//			assertEquals(ttdPage.getTxtNomKtp(), updateStrNoKTP);
//			assertEquals(ttdPage.getTxtNomKtp(), updateStrNoKTP);
//			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
//		} 
//		
//		if(strNoKTP != "" && strKotaKTP != "") {
//			String txtExpected = "Data berhasil Di Simpan";
//			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
//			assertEquals(ttdPage.getTxtNomKtp(), updateStrNoKTP);
//			assertEquals(ttdPage.getTxtNomKtp(), updateStrNoKTP);
//			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
//		} 
//		
//		if(strNoKTP != "" && strFaskesAwal != "") {
//			String txtExpected = "Data berhasil Di Simpan";
//			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
//			assertEquals(ttdPage.getTxtNomKtp(), updateStrNoKTP);
//			assertEquals(ttdPage.getTxtAddress(), updateStrAlamat);
//			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
//		} 
//		if(strNoKTP != "" && strFaskesTujuan != "") {
//			String txtExpected = "Data berhasil Di Simpan";
//			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
//			assertEquals(ttdPage.getTxtNomKtp(), updateStrNoKTP);
//			assertEquals(ttdPage.getTxtKotaKTP(), updateStrKotaKTP);
//			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
//		} 
//		if(strNoKTP != "" && strAlasan != "") {
//			String txtExpected = "Data berhasil Di Simpan";
//			assertTrue(ttdPage.msgSuccessUpdate().contains(txtExpected));
//			assertEquals(ttdPage.getTxtNomKtp(), updateStrNoKTP);
//			assertEquals(ttdPage.getTxtFaskesAwal(), updateStrFaskesAwal);
//			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);	
//		}

		
		extentTest.log(LogStatus.PASS, "Siloam105 Validasi Data tersimpan dan form ter-update");
	    
	}

}
