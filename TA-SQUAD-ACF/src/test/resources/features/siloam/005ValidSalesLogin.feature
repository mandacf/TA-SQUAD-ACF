#created_by : Alamanda
#created_date : 29/09/2022
#updated_by : Alamanda
#updated_date : 4/10/2022


Feature: Valid Sales Login

  Scenario: Siloam005 Sales Valid Login Username 
		When Siloam005 Sales Mengakses Halaman Website
    And Siloam005 Sales Input <username> dan <password> Valid
    And Siloam005 Sales Menekan Tombol Login
    Then Siloam005 Validasi Nama Sales di Halaman Home Page
    
    #3 data
  Examples: 
    | username | password   |
    | D6200927 | 1997-10-23 |