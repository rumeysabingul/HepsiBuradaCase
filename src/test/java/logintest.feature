Feature: Login Test

  Scenario: Hepsiburada sayfasına git ve login caselerini test et

    Given Hepsiburada sitesine git
    And Giriş Yap pop-upı üzerine mouseı getir
    And Pop uo içindeki Giriş yap objesine tıkla
    And e-posta adresini gir
    And şifre gir
    When Giriş yap butonuna tıkladığımda
    Then Anasayfaya yönlendir