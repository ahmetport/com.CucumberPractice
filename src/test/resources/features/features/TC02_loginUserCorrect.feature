Feature: Login user correct
@login  @vip
  Scenario: TC02_a_Login_User_With_Correct_email_and_password
            (Dogru e-posta ve sifre ile kullanici oturum acma)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then kullanici signup-login butonuna tiklar
    Then kullanicinin Login to your account yazisinin gorunur oldugunu test eder
    Then kullanici dogru email ve sifreyi girer
    Then kullanici login butonuna tiklar
    Then kullanici oturum actigini test eder(Logged in as username)

