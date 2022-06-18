package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@href='/login']")
    public WebElement singUpLoginButonu;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement userName;

    @FindBy (xpath = "(//input[@name='email'])[2]")
    public WebElement emailAdress;

    @FindBy (xpath = "(//button[@class='btn btn-default'])[2]")
    public WebElement singUppButonu2;

    @FindBy (xpath = "//input[@type='radio']")
    public WebElement radioButton;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy (xpath = "//select[@id='days']")
    public WebElement birthDayDay;

    @FindBy (xpath = "//select[@id='months']")
    public WebElement birthDayMonth;

    @FindBy (xpath = "//select[@id='years']")
    public WebElement birthDayYear;

    @FindBy (xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy (xpath = "//input[@id='last_name']")
    public WebElement lastName;

    @FindBy (xpath = "//input[@id='company']")
    public WebElement campany;

    @FindBy (xpath = "//input[@id='address1']")
    public WebElement Adress;

    @FindBy (xpath = "//input[@id='address2']")
    public WebElement Adress2;

    @FindBy (xpath = "//select[@id='country']")
    public WebElement Country;

    @FindBy (xpath = "//input[@id='state']")
    public WebElement State;

    @FindBy (xpath = "//input[@id='city']")
    public WebElement City;

    @FindBy (xpath = "//input[@id='zipcode']")
    public WebElement Zipcode;

    @FindBy (xpath = "//input[@id='mobile_number']")
    public WebElement mobilNumber;

    @FindBy (xpath = "//button[@class='btn btn-default'][1]")
    public WebElement createButton;

    @FindBy (xpath = "//h2[@data-qa='account-created']")
    public WebElement accountCreate;

























}
