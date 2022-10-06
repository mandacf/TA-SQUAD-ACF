#created_by : Adit
#created_date : 4/10/2022
#updated_by : 
#updated_date : 

Feature: Update Data Sales Lima Kombinasi
	
	Scenario: Siloam120 Sales Login 
	When Siloam120 Sales Mengakses Halaman Website
	Then Siloam120 Validasi Sales Masuk Ke Halaman TTD Digital

  Scenario: Siloam120 Sales Update Data Lima Kombinasi
    When Siloam120 Sales Tekan Tombol Edit 
    And Siloam120 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> 
    And Siloam120 Sales tekan tombol Simpan
    Then Siloam120 Validasi Data Tersimpan Dan Form Ter-update
    
    
#56 Data
  Examples: 
  |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
	|Aditya|7263548901932|9127846376190291|Kediri|KOTA KEDIRI||||
	|Aditya|7263548901932|9127846376190291|Kediri||Klinik Testing|||
	|Aditya|7263548901932|9127846376190291|Kediri|||Kota Bogor||
	|Aditya|7263548901932|9127846376190291|Kediri||||Testing|
	|Aditya|7263548901932|9127846376190291||KOTA KEDIRI|Klinik Testing|||
	|Aditya|7263548901932|9127846376190291||KOTA KEDIRI||Kota Bogor||
	|Aditya|7263548901932|9127846376190291||KOTA KEDIRI|||Testing|
	|Aditya|7263548901932|9127846376190291|||Klinik Testing|Kota Bogor||
	|Aditya|7263548901932|9127846376190291|||Klinik Testing||Testing|
	|Aditya|7263548901932|9127846376190291||||Kota Bogor|Testing|
	|Aditya|7263548901932||Kediri|KOTA KEDIRI|Klinik Testing|||
	|Aditya|7263548901932||Kediri|KOTA KEDIRI||Kota Bogor||
	|Aditya|7263548901932||Kediri|KOTA KEDIRI|||Testing|
	|Aditya|7263548901932||Kediri||Klinik Testing|Kota Bogor||
	|Aditya|7263548901932||Kediri||Klinik Testing||Testing|
	|Aditya|7263548901932||Kediri|||Kota Bogor|Testing|
	|Aditya|7263548901932||Kediri|||Kota Bogor|Testing|
	|Aditya|7263548901932|||KOTA KEDIRI|Klinik Testing|Kota Bogor||
	|Aditya|7263548901932|||KOTA KEDIRI|Klinik Testing||Testing|
	|Aditya|7263548901932|||KOTA KEDIRI||Kota Bogor|Testing|
	|Aditya|7263548901932||||Klinik Testing|Kota Bogor|Testing|
	|Aditya||9127846376190291|Kediri|KOTA KEDIRI|Klinik Testing|||
	|Aditya||9127846376190291|Kediri|KOTA KEDIRI||Kota Bogor||
	|Aditya||9127846376190291|Kediri|KOTA KEDIRI|||Testing|
	|Aditya||9127846376190291|Kediri||Klinik Testing|Kota Bogor||
	|Aditya||9127846376190291|Kediri||Klinik Testing||Testing|
	|Aditya||9127846376190291||KOTA KEDIRI|Klinik Testing|Kota Bogor||
	|Aditya||9127846376190291||KOTA KEDIRI|Klinik Testing||Testing|
	|Aditya||9127846376190291||KOTA KEDIRI||Kota Bogor|Testing|
	|Aditya||9127846376190291|||Klinik Testing|Kota Bogor|Testing|
	|Aditya|||Kediri|KOTA KEDIRI|Klinik Testing|Kota Bogor||
	|Aditya|||Kediri|KOTA KEDIRI|Klinik Testing||Testing|
	|Aditya|||Kediri|KOTA KEDIRI||Kota Bogor|Testing|
	|Aditya|||Kediri||Klinik Testing|Kota Bogor|Testing|
	|Aditya||||KOTA KEDIRI|Klinik Testing|Kota Bogor|Testing|
	||7263548901932|9127846376190291|Kediri|KOTA KEDIRI|Klinik Testing|||
	||7263548901932|9127846376190291|Kediri|KOTA KEDIRI||Kota Bogor||
	||7263548901932|9127846376190291|Kediri|KOTA KEDIRI|||Testing|
	||7263548901932|9127846376190291|Kediri||Klinik Testing|Kota Bogor||
	||7263548901932|9127846376190291|Kediri||Klinik Testing||Testing|
	||7263548901932|9127846376190291|Kediri|||Kota Bogor|Testing|
	||7263548901932|9127846376190291||KOTA KEDIRI|Klinik Testing|Kota Bogor||
	||7263548901932|9127846376190291||KOTA KEDIRI|Klinik Testing||Testing|
	||7263548901932|9127846376190291||KOTA KEDIRI||Kota Bogor|Testing|
	||7263548901932|9127846376190291|||Klinik Testing|Kota Bogor|Testing|
	||7263548901932||Kediri|KOTA KEDIRI|Klinik Testing|Kota Bogor||
	||7263548901932||Kediri|KOTA KEDIRI|Klinik Testing||Testing|
	||7263548901932||Kediri|KOTA KEDIRI||Kota Bogor|Testing|
	||7263548901932||Kediri||Klinik Testing|Kota Bogor|Testing|
	||7263548901932|||KOTA KEDIRI|Klinik Testing|Kota Bogor|Testing|
	|||9127846376190291|Kediri|KOTA KEDIRI|Klinik Testing|Kota Bogor||
	|||9127846376190291|Kediri|KOTA KEDIRI|Klinik Testing||Testing|
	|||9127846376190291|Kediri|KOTA KEDIRI||Kota Bogor|Testing|
	|||9127846376190291|Kediri||Klinik Testing|Kota Bogor|Testing|
	|||9127846376190291||KOTA KEDIRI|Klinik Testing|Kota Bogor|Testing|
	||||Kediri|KOTA KEDIRI|Klinik Testing|Kota Bogor|Testing|