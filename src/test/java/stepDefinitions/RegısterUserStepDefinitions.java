package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class RegısterUserStepDefinitions {

    RegisterPage regisUser = new RegisterPage();

    @When("kullanici tarayiciyi baslatir")
    public void kullanici_tarayiciyi_baslatir() {
        Driver.getDriver();
    }
    @Then("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
    }
    @Then("ana sayfanin gorunur oldugunu test eder")
    public void ana_sayfanin_gorunur_oldugunu_test_eder() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.automationexercise.com/test_cases";
        Assert.assertEquals(expectedUrl, actualUrl);
    }
    @Then("kullanici signup-login butonuna tiklar")
    public void kullanici_signup_login_butonuna_tiklar() {
        regisUser.signUpLogin.click();
    }
    @Then("kullanici,New User Signup! in gorunur oldugunu test eder")
    public void kullanici_new_user_signup_in_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(regisUser.newSignUpLogin.isDisplayed());
    }
    @When("kullanici olarak isim ve maili girer")
    public void kullanici_olarak_isim_ve_maili_girer() {
        regisUser.newName.sendKeys("ahmet");
        regisUser.eMailAdress.sendKeys("umitenes6@gmail.com");
    }
    @Then("signup butonuna tiklar")
    public void signup_butonuna_tiklar() {
        regisUser.signUp.click();
    }
    @Then("acilan sayfada ENTER ACCOUNT INFORMATION yazisinn gorunur oldugunu test eder")
    public void acilan_sayfada_enter_account_ınformatıon_yazisinn_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(regisUser.yazınınGörünürOldugunuTest.isDisplayed());
    }
    @Then("kullanici ayrintilari \\(birinci bolum) doldurur")
    public void kullanici_ayrintilari_birinci_bolum_doldurur() {
        regisUser.mr.click();
        regisUser.password.sendKeys("12345");
        WebElement day = Driver.getDriver().findElement(By.xpath("//select[@id='days']"));
        Select select = new Select(day);
        select.selectByIndex(2);
        WebElement month = Driver.getDriver().findElement(By.xpath("//select[@id='months']"));
        Select select1 = new Select(month);
        select1.selectByVisibleText("May");
        WebElement years = Driver.getDriver().findElement(By.xpath("//select[@id='years']"));
        Select select2 = new Select(years);
        select2.selectByValue("2020");
    }
    @Then("kullanici Sign up for our newsletter! checkbox ini secer")
    public void kullanici_sign_up_for_our_newsletter_checkbox_ini_secer() {
        regisUser.checkBox1.click();
    }

    @Then("kullanici Receive special offers from our partners! checkbox ini secer")
    public void kullanici_receive_special_offers_from_our_partners_checkbox_ini_secer() {
        regisUser.checkBox2.click();

    }
    @Then("kullanici ayrintilari \\(ikinci bolum) doldurur")
    public void kullanici_ayrintilari_ikinci_bolum_doldurur() {
        regisUser.firstName.sendKeys("ahmet");
        regisUser.lastName.sendKeys("portakal");
        regisUser.compannny.sendKeys("orangeltd");
        regisUser.address1.sendKeys("konya");
        regisUser.adress2.sendKeys("konya");
         WebElement ülke=Driver.getDriver().findElement(By.xpath("//select[@id='country']"));
        Select select=new Select(ülke);
        select.selectByVisibleText("Canada");
        regisUser.state.sendKeys("Canada");
        regisUser.cityy.sendKeys("gaziantep");
        regisUser.kod.sendKeys("42100");
        regisUser.number.sendKeys("5428384690");
    }
    @Then("kullanici Create Account butonuna tiklar")
    public void kullanici_create_account_butonuna_tiklar() {
        regisUser.createButton.click();
    }

    @Then("kullanici hesabin olustugunu dogrular")
    public void kullanici_hesabin_olustugunu_dogrular() {
        Assert.assertTrue(regisUser.AccountCreatedYazısı.isDisplayed());
    }
    @When("kullanici Continue butonuna tiklar")
    public void kullanici_continue_butonuna_tiklar() {
        regisUser.Continue.click();
    }
    @Then("kullanici oturum actigini dogrulamasi gerekir\\(Logged in as username)")
    public void kullanici_oturum_actigini_dogrulamasi_gerekir_logged_in_as_username() {
        Assert.assertTrue(regisUser.LoginUsername.isDisplayed());

    }

    @Then("kullanici Delete Account butonuna tiklar")
    public void kullanici_delete_account_butonuna_tiklar() {
        //not found

    }
}