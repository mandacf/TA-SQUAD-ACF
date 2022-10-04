#created_by : Alamanda
#created_date : 3/10/2022
#updated_by : 
#updated_date : 


Feature: Update Data Sales Dua Kombinasi
	
	Scenario: Siloam105 Sales Login 
	When Siloam105 Sales Mengakses Halaman Website
	Then Siloam105 Validasi sales masuk ke halaman ttd digital

  Scenario: Siloam105 Sales Update Data Dua Kombinasi
    When Siloam105 Sales Tekan Tombol Edit 
    And Siloam105 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> 
    And Siloam105 Sales tekan tombol Simpan
    Then Siloam105 Validasi Data tersimpan dan form ter-update
  
  #28 data
  Examples: 
  |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
	|Alamanda|1234567898888|||||||
	|Alamanda||1634567654321233||||||
	|Alamanda|||Padang|||||
	|Alamanda||||KOTA PADANG||||
	|Alamanda|||||Klinik Test|||
	|Alamanda||||||Tangerang||
	|Alamanda|||||||Test|
	||1234567898788|1634567654321238||||||
	||1234567898788||Padang|||||
	||1234567898788|||KOTA PADANG||||
	||1234567898788||||Klinik Test|||
	||1234567898788|||||Tangerang||
	||1234567898788||||||Test|
	|||0163456765432123|Padang|||||
	|||0163456765432123||KOTA PADANG||||
	|||0163456765432123|||Klinik Test|||
	|||0163456765432123||||Tangerang||
	|||0163456765432123|||||Test|
	||||Padang|KOTA PADANG||||
	||||Padang||Klinik Test|||
	||||Padang|||Tangerang||
	||||Padang||||Test|
	|||||KOTA PADANG|Klinik Test|||
	|||||KOTA PADANG||Tangerang||
	|||||KOTA PADANG|||Test|
	||||||Klinik Test|Tangerang||
	||||||Klinik Test||Test|
	|||||||Tangerang|Test|
	