#created_by : Alamanda
#created_date : 29/09/2022
#updated_by : -
#updated_date : -


Feature: Update Data Sales Satu Kombinasi
	
	Scenario: Siloam100 Sales Login 
	When Siloam100 Sales Mengakses Halaman Website
	Then Siloam100 Validasi sales masuk ke halaman ttd digital

  Scenario: Siloam100 Sales Update Data Satu Kombinasi
    When Siloam100 Sales Tekan Tombol Edit 
    And Siloam100 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> 
    And Siloam100 Sales tekan tombol Simpan
    Then Siloam100 Validasi Data tersimpan dan form ter-update
  
  #8 data
  Examples: 
  |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
	|acc||||||||
	||1123232343455|||||||
	|||0163456765432123||||||
	||||Padang|||||
	|||||KOTA PADANG||||
	||||||Klinik Test|||
	|||||||Tangerang||
	||||||||Test|