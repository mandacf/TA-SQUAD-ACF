#created_by : Alamanda
#created_date : 4/10/2022
#updated_by : 
#updated_date : 

Feature: Update Data Sales Empat Kombinasi
	
	Scenario: Siloam110 Sales Login 
	When Siloam110 Sales Mengakses Halaman Website
	Then Siloam110 Validasi sales masuk ke halaman ttd digital

  Scenario: Siloam110 Sales Update Data Empat Kombinasi
    When Siloam110 Sales Tekan Tombol Edit 
    And Siloam110 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> 
    And Siloam110 Sales tekan tombol Simpan
    Then Siloam110 Validasi Data tersimpan dan form ter-update
    
    #31 data
  Examples: 
  |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
  |Alamanda|1234567899093|1634567654321239|Padang|||||
	|Alamanda|1234567899093|1634567654321239||KOTA PADANG||||
	|Alamanda|1234567899093|1634567654321239|||Klinik Test|||
	|Alamanda|1234567899093|1634567654321239||||Tangerang||
	|Alamanda|1234567899093|1634567654321239|||||Test|
	|Alamanda|1234567899093||Padang|KOTA PADANG||||
	|Alamanda|1234567899093||Padang||Klinik Test|||
	|Alamanda|1234567899093||Padang|||Tangerang||
	|Alamanda|1234567899093||Padang||||Test|
	|Alamanda||1634567654321239|Padang|KOTA PADANG||||
	|Alamanda||1634567654321239|Padang||Klinik Test|||
	|Alamanda||1634567654321239|Padang|||Tangerang||
	|Alamanda||1634567654321239|Padang|KOTA PADANG|||Test|
	|Alamanda|||Padang|KOTA PADANG|Klinik Test|||
	|Alamanda|||Padang|KOTA PADANG||Tangerang||
	|Alamanda|||Padang|KOTA PADANG|||Test|
	|Alamanda||1634567654321239||KOTA PADANG|Klinik Test|||
	|Alamanda||1634567654321239||KOTA PADANG||Tangerang||
	|Alamanda||1634567654321239||KOTA PADANG|||Test|
	|Alamanda||1634567654321239|||Klinik Test|Tangerang||
	|Alamanda||1634567654321239|||Klinik Test||Test|
	|Alamanda||1634567654321239||||Tangerang|Test|
	|Alamanda|||Padang||Klinik Test|Tangerang||
	|Alamanda|||Padang||Klinik Test||Test|
	|Alamanda|||Padang|||Tangerang|Test|
	|Alamanda|1234567899093||Padang|KOTA PADANG||||
	|Alamanda|1234567899093||Padang||Klinik Test|||
	|Alamanda|1234567899093||Padang|||Tangerang||
	|Alamanda|1234567899093||Padang||||Test|
	|Alamanda|1234567899093|||KOTA PADANG|Klinik Test|||
	|Alamanda|1234567899093|||KOTA PADANG||Tangerang||
#	||1234567899093||Padang|KOTA PADANG||Tangerang||

  