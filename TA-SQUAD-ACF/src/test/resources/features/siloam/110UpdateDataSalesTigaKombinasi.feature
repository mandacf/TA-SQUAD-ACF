#created_by : Alamanda
#created_date : 4/10/2022
#updated_by : 
#updated_date : 

Feature: Update Data Sales Tiga Kombinasi
	
	Scenario: Siloam110 Sales Login 
	When Siloam110 Sales Mengakses Halaman Website
	Then Siloam110 Validasi sales masuk ke halaman ttd digital

  Scenario: Siloam110 Sales Update Data Tiga Kombinasi
    When Siloam110 Sales Tekan Tombol Edit 
    And Siloam110 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> 
    And Siloam110 Sales tekan tombol Simpan
    Then Siloam110 Validasi Data tersimpan dan form ter-update
    
  #56 data
  Examples: 
  |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
  |Alamanda|1234567899093|1634567654321200||||||
	|Alamanda|1234567899093||Padang|||||
	|Alamanda|1234567899093|||KOTA PADANG||||
	|Alamanda|1234567899093||||Klinik Test|||
	|Alamanda|1234567899093|||||Tangerang||
	|Alamanda|1234567899093||||||Test|
	|Alamanda||1634567654321200|Padang|||||
	|Alamanda||1634567654321200||KOTA PADANG||||
	|Alamanda||1634567654321200|||Klinik Test|||
	|Alamanda||1634567654321200||||Tangerang||
	|Alamanda||1634567654321200|||||Test|
	|Alamanda|||Padang|KOTA PADANG||||
	|Alamanda|||Padang||Klinik Test|||
	|Alamanda|||Padang|||Tangerang||
	|Alamanda|||Padang||||Test|
	|Alamanda||||KOTA PADANG|Klinik Test|||
	|Alamanda||||KOTA PADANG||Tangerang||
	|Alamanda||||KOTA PADANG|||Test|
	|Alamanda|||||Klinik Test|Tangerang||
	|Alamanda|||||Klinik Test||Test|
	|Alamanda||||||Tangerang|Test|
	||1234567899093|1634567654321200|Padang|||||
	||1234567899093|1634567654321200||KOTA PADANG||||
	||1234567899093|1634567654321200|||Klinik Test|||
	||1234567899093|1634567654321200||||Tangerang||
	||1234567899093|1634567654321200|||||Test|
	||1234567899093||Padang|KOTA PADANG||||
	||1234567899093||Padang||Klinik Test|||
	||1234567899093||Padang|||Tangerang||
	||1234567899093||Padang||||Test|
	||1234567899093|||KOTA PADANG|Klinik Test|||
	||1234567899093|||KOTA PADANG||Tangerang||
	||1234567899093|||KOTA PADANG|||Test|
	||1234567899093||||Klinik Test|Tangerang||
	||1234567899093||||Klinik Test||Test|
	||1234567899093|||||Tangerang|Test|
	|||1634567654321200|Padang|KOTA PADANG||||
	|||1634567654321200|Padang||Klinik Test|||
	|||1634567654321200|Padang|||Tangerang||
	|||1634567654321200|Padang||||Test|
	|||1634567654321200||KOTA PADANG|Klinik Test|||
	|||1634567654321200||KOTA PADANG||Tangerang||
	|||1634567654321200||KOTA PADANG|||Test|
	|||1634567654321200|||Klinik Test|Tangerang||
	|||1634567654321200|||Klinik Test||Test|
	|||1634567654321200||||Tangerang|Test|
	||||Padang|KOTA PADANG|Klinik Test|||
	||||Padang|KOTA PADANG||Tangerang||
	||||Padang|KOTA PADANG|||Test|
	||||Padang||Klinik Test|Tangerang||
	||||Padang||Klinik Test||Test|
	||||Padang|||Tangerang|Test|
	|||||KOTA PADANG|Klinik Test|Tangerang||
	|||||KOTA PADANG|Klinik Test||Test|
	|||||KOTA PADANG||Tangerang|Test|
	||||||Klinik Test|Tangerang|Test|
	