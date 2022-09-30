#created_by : Alamanda
#created_date : 29/09/2022
#updated_by : -
#updated_date : -


Feature: Invalid Sales Login

  Scenario: Siloam010 Admin Invalid Login Username 
		When Siloam010 Admin Mengakses Halaman Website
    And Siloam010 Admin Memasukan <username> dan <password> Salah
    And Siloam010 Admin Menekan Tombol Login
    Then Siloam010 Validasi pesan pada halaman login
    
    #3 data
  Examples: 
  |username|password|
	|manda|manda@passw0rd|
	|manda|d1k4@passw0rd|
	|admindika|d1k4@|
	