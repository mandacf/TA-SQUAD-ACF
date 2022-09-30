#created_by : Alamanda
#created_date : 29/09/2022
#updated_by : -
#updated_date : -


Feature: Invalid Sales Login

  Scenario: Siloam018 Sales Invalid Login Username 
		When Siloam018 Sales Mengakses Halaman Website
    And Siloam018 Sales Memasukan <username> dan <password> Salah
    And Siloam018 Sales Menekan Tombol Login
    Then Siloam018 Validasi pesan pada halaman login
  
  #3 data
  Examples: 
    | username | password   |
    | d6200927 | 1998-10-23 |
    | d6200927 | 1997-10-23 |
    | D6200927 | 1998-11-23 |
