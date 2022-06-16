package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LogınPage;
import utilities.Driver;

public class LogınUserStepDefinitions {

LogınPage logPage=new LogınPage();



    @Then("kullanicinin Login to your account yazisinin gorunur oldugunu test eder")
    public void kullanicininLoginToYourAccountYazisininGorunurOldugunuTestEder() {
        Assert.assertTrue(logPage.yourAcountYazısı.isDisplayed());
    }
    @Then("kullanici dogru email ve sifreyi girer")
    public void kullaniciDogruEmailVeSifreyiGirer() {
        logPage.emailİkinciAdres.sendKeys("practicebatch44@gmail.com");
        logPage.İkinciPassword.sendKeys("123456");
    }
    @Then("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        logPage.İkinciLogin.click();
    }
    @Then("kullanici oturum actigini test eder\\(Logged in as username)")
    public void kullaniciOturumActiginiTestEderLoggedInAsUsername() {
        Assert.assertTrue(logPage.batch44.isDisplayed());
    }
}
