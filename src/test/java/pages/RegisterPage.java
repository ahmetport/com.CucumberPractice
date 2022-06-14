package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(partialLinkText = "Signup")
    public WebElement signUpLogin;
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newSignUpLogin;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement newName;
    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    public WebElement eMailAdress;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signUp;
    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement yazınınGörünürOldugunuTest;
    @FindBy(id = ("id_gender1"))
    public WebElement mr;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;
    @FindBy(xpath = "//select[@id='days']")
    public WebElement days;
    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement checkBox1;
    @FindBy(xpath = "//input[@id='optin']")
    public WebElement checkBox2;



}
