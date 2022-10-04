#created_by : Alamanda
#created_date : 4/10/2022
#updated_by : 
#updated_date : 

Feature: Update Data Sales Empat Kombinasi
	
	Scenario: Siloam115 Sales Login 
	When Siloam115 Sales Mengakses Halaman Website
	Then Siloam115 Validasi sales masuk ke halaman ttd digital

  Scenario: Siloam115 Sales Update Data Empat Kombinasi
    When Siloam115 Sales Tekan Tombol Edit 
    And Siloam115 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> 
    And Siloam115 Sales tekan tombol Simpan
    Then Siloam115 Validasi Data tersimpan dan form ter-update
    
    #70 data
  Examples: 
  #|nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
  #|Alamanda|1234567899093|1634567654321239|Padang|||||
#	|Alamanda|1234567899093|1634567654321239||KOTA PADANG||||
#	|Alamanda|1234567899093|1634567654321239|||Klinik Test|||
#	|Alamanda|1234567899093|1634567654321239||||Tangerang||
#	|Alamanda|1234567899093|1634567654321239|||||Test|
#	|Alamanda|1234567899093||Padang|KOTA PADANG||||
#	|Alamanda|1234567899093||Padang||Klinik Test|||
#	|Alamanda|1234567899093||Padang|||Tangerang||
#	|Alamanda|1234567899093||Padang||||Test|
#	|Alamanda||1634567654321239|Padang|KOTA PADANG||||
#	|Alamanda||1634567654321239|Padang||Klinik Test|||
#	|Alamanda||1634567654321239|Padang|||Tangerang||
#	|Alamanda||1634567654321239|Padang|KOTA PADANG|||Test|
#	|Alamanda|||Padang|KOTA PADANG|Klinik Test|||
#	|Alamanda|||Padang|KOTA PADANG||Tangerang||
#	|Alamanda|||Padang|KOTA PADANG|||Test|
#	|Alamanda||1634567654321239||KOTA PADANG|Klinik Test|||
#	|Alamanda||1634567654321239||KOTA PADANG||Tangerang||
#	|Alamanda||1634567654321239||KOTA PADANG|||Test|
#	|Alamanda||1634567654321239|||Klinik Test|Tangerang||
#	|Alamanda||1634567654321239|||Klinik Test||Test|
#	|Alamanda||1634567654321239||||Tangerang|Test|
#	|Alamanda|||Padang||Klinik Test|Tangerang||
#	|Alamanda|||Padang||Klinik Test||Test|
#	|Alamanda|||Padang|||Tangerang|Test|
#	|Alamanda|1234567899093||Padang|KOTA PADANG||||
#	|Alamanda|1234567899093||Padang||Klinik Test|||
#	|Alamanda|1234567899093||Padang|||Tangerang||
#	|Alamanda|1234567899093||Padang||||Test|
#	|Alamanda|1234567899093|||KOTA PADANG|Klinik Test|||
#	|Alamanda|1234567899093|||KOTA PADANG||Tangerang||
#	||1234567899093|1634567654321230|Padang|KOTA PADANG||||
#	||1234567899093|1634567654321230|Padang||Klinik Test|||
#	||1234567899093|1634567654321230|Padang|||Tangerang||
#	||1234567899093|1634567654321230|Padang||||Test|
#	||1234567899093|1634567654321230||KOTA PADANG|Klinik Test|||
#	||1234567899093|1634567654321230||KOTA PADANG||Tangerang||
#	|Alamanda||||KOTA PADANG|Klinik Test|Tangerang||
	|Alamanda||||KOTA PADANG|Klinik Test||Test|
	|Alamanda||||KOTA PADANG||Tangerang|Test|
	|Alamanda|||||Klinik Test|Tangerang|Test|
	||1234567899093|1634567654321230||KOTA PADANG|||Test|
	||1234567899093|1634567654321230|||Klinik Test|Tangerang||
	||1234567899093|1634567654321230|||Klinik Test||Test|
	||1234567899093|1634567654321230||||Tangerang|Test|
	||1234567899093||Padang|KOTA PADANG|Klinik Test|||
	||1234567899093||Padang|KOTA PADANG||Tangerang||
	||1234567899093||Padang|KOTA PADANG|||Test|
	||1234567899093||Padang||Klinik Test|Tangerang||
	||1234567899093||Padang||Klinik Test||Test|
	||1234567899093||Padang|||Tangerang|Test|
	||1234567899093|||KOTA PADANG|Klinik Test|Tangerang||
	||1234567899093|||KOTA PADANG|Klinik Test||Test|
	||1234567899093|||KOTA PADANG||Tangerang|Test|
	||1234567899093||||Klinik Test|Tangerang|Test|
	|||1634567654321230|Padang|KOTA PADANG|Klinik Test|||
	|||1634567654321230|Padang|KOTA PADANG||Tangerang||
	|||1634567654321230|Padang|KOTA PADANG|||Test|
	|||1634567654321230|Padang||Klinik Test|Tangerang||
	|||1634567654321230|Padang||Klinik Test||Test|
	|||1634567654321230|Padang|||Tangerang|Test|
	|||1634567654321230||KOTA PADANG|Klinik Test|Tangerang||
	|||1634567654321230||KOTA PADANG|Klinik Test||Test|
	|||1634567654321230||KOTA PADANG||Tangerang|Test|
	|||1634567654321230|||Klinik Test|Tangerang|Test|
	||||Padang|KOTA PADANG|Klinik Test|Tangerang||
	||||Padang|KOTA PADANG|Klinik Test||Test|
	||||Padang|KOTA PADANG||Klinik Test|Test|
	||||Padang||Klinik Test|Klinik Test|Test|
	|||||KOTA PADANG|Klinik Test|Klinik Test|Test|
	

  