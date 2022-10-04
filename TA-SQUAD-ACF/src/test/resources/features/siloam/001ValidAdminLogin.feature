#created_by : Novri
#created_date : 29/09/2022
#updated_by : Alamanda
#updated_date : 4/10/2022

Feature: Valid Admin Login

  Scenario: Siloam001 Admin Valid Login Username 
		When Siloam001 Admin Mengakses Halaman Website
    And Siloam001 Admin Input <username> dan <password> Valid
    And Siloam001 Admin Menekan Tombol Login
    Then Siloam001 Validasi Nama Admin di Halaman Home Page
   
#3 data
  Examples: 
    | username  | password      |
    | admindika | d1k4@passw0rd |

