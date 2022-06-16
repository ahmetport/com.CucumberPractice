package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogınPage {
    public LogınPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


@FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement yourAcountYazısı;
    @FindBy(xpath = "//input[@placeholder='Email Address']")
    public WebElement emailİkinciAdres;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement İkinciPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement İkinciLogin;
    @FindBy(xpath = "//*[text()='batch44']")
    public WebElement batch44;
}
