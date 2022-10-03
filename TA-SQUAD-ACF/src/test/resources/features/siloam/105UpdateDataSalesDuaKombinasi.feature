#created_by : Alamanda
#created_date : 29/09/2022
#updated_by : -
#updated_date : -


Feature: Update Data Sales Dua Kombinasi
	
	Scenario: Siloam105 Sales Login 
	When Siloam105 Sales Mengakses Halaman Website
	Then Siloam105 Validasi sales masuk ke halaman ttd digital

  Scenario: Siloam105 Sales Update Data Satu Kombinasi
    When Siloam105 Sales Tekan Tombol Edit 
    And Siloam105 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> 
    And Siloam105 Sales tekan tombol Simpan
    Then Siloam105 Validasi Data tersimpan dan form ter-update
  
  #7 data
  Examples: 
  |Nama|Nomor BPJS|Nomor KTP|Alamat|Kota KTP|Faskes Awal|Faskes Tujuan|Alasan|
	|Alamanda|1234567898765|||||||
	|Alamanda||163456765432123||||||
	|Alamanda|||Padang|||||
	|Alamanda||||KOTA PADANG||||
	|Alamanda|||||Klinik Test|||
	|Alamanda||||||Tangerang||
	|Alamanda|||||||Test|