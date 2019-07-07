@AutomationKitaBisa
Feature: lanjut Pembayaran

  @Positif
  Scenario: Positif case
    Given user menuju ke landing page
    When user klik campaign
    Then user seharusnya menuju kehalaman detail campaign
    When user klik button donasi sekarang
    Then seharusnya menuju ke halaman lanjut pembayaran
    When user input jumlah uang "5000"
    #semua parameter input bisadi ubah untuk di jadikan negatif case juga
    And user klik button pilih pembayaran
    And seharusnya muncul pop up metode pembayaran
    And user pilih go-pay
    And user input nama lengkap "user_testing"
    And user input email "klobdaya@gmail.com"
    And user input comment "semoga berkah ya"
    And user klik button lanjutkan pembayaran
    Then seharusnya user menuju kehalaman intruksi pembayaran


   @Negatif
   Scenario: Negatif case
     Given user ke halaman landing page
     When user klik salah satu campaign
     Then seharusnya menuju kehalaman detail campaign
     When user klik btn donasi sekarang
     Then seharusnya ke halaman lanjut pembayaran
     When user klik btn lanjutkan
     Then seharusnya muncul error message


