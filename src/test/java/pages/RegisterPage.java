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
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='company']")
    public WebElement compannny;
    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1;
    @FindBy(xpath = "//input[@id='address2']")
    public WebElement adress2;
    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;
    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityy;
    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement kod;
    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement number;
    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement createButton;
    @FindBy (xpath = "//*[text()='Account Created!']")
    public WebElement AccountCreatedYazısı;
    @FindBy(xpath ="//*[text()='Continue']")
    public WebElement Continue;
    @FindBy(xpath = "//*[text()='ahmet']")
    public WebElement LoginUsername;






































}
