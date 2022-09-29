Feature: Sales Update Data

  Scenario: Sales melakukan update Nama
    When Sales tekan tombol edit 
    And Sales melakukan update pada Nama
    And Sales tekan tombol Simpan
    Then Validasi Data tersimpan dan form Nama ter-update


