#created_by : Alamanda
#created_date : 30/09/2022
#updated_by : -
#updated_date : -


Feature: Invalid Sales Login

  Scenario: Siloam015 Admin Invalid Login Username 
		When Siloam015 Admin Mengakses Halaman Website
    And Siloam015 Admin Memasukan <username> dan <password> Salah
    And Siloam015 Admin Menekan Tombol Login
    Then Siloam015 Validasi pesan pada halaman login
    
    #5 data
  	Examples:
  	|username|password|
    	||d1k4@|
  		||d1k4@passw0rd|
  		|admindika||
  		|manda||
			| | |
