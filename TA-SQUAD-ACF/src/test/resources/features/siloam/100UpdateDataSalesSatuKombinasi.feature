#created_by : Alamanda
#created_date : 29/09/2022
#updated_by : -
#updated_date : -


Feature: Update Data Sales Satu Kombinasi

  Scenario: Siloam100 Sales Update Data Satu Kombinasi
		When Siloam100 Sales Sudah Login dan Berada di Halaman TTD Digital
    And Siloam100 Sales Tekan Tombol Edit 
    And Siloam100 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> 
    And Siloam100 Sales tekan tombol Simpan
    #Then Siloam100 Validasi Data tersimpan dan form Nama ter-update
  
  #8 data
  Examples: 
  |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
#	|Alamanda||||||||
	||1123232343460|||||||
#	|||0163456765432123||||||
#	||||Padang|||||
#	|||||KOTA PADANG||||
#	||||||Klinik Test|||
#	|||||||Tangerang||
#	||||||||Test|