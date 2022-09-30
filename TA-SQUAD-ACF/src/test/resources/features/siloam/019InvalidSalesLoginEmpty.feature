#created_by : Alamanda
#created_date : 29/09/2022
#updated_by : -
#updated_date : -


Feature: Invalid Sales Login

  Scenario: Siloam019 Sales Invalid Login Username 
		When Siloam019 Sales Mengakses Halaman Website
    And Siloam019 Sales Memasukan <username> dan <password> Salah
    And Siloam019 Sales Menekan Tombol Login
    Then Siloam019 Validasi pesan pada halaman login
  
  #5 data
  Examples: 
  |username|password|
	||10/23/97|
	||10/26/97|
	|D6200927||
	|d7200927||
	|| |