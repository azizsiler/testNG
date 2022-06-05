package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage1 {

    public BrcPage1() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy
    public WebElement brcUrl;

    @FindBy (xpath = "//a[@role='button']")
    public WebElement ilkLogin;

    @FindBy (xpath = "//input[@id='formBasicEmail']")
    public WebElement emailKutusu;

    @FindBy (xpath = "//input[@id='formBasicPassword']")
    public WebElement passwordKutusu;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement ikinciLogin;

    @FindBy (xpath = "//select[@name='car']")
    public WebElement selectElementi;

    @FindBy (xpath = "//input[@name='pickUpLocation']")
    public WebElement picupSelect;

    @FindBy (xpath = "//input[@name='cardNo']")
    public WebElement kartNo;


    @FindBy (xpath = "//input[@name='nameOnCard']")
    public WebElement kartName;

    @FindBy (xpath = "//input[@name='expireDate']")
    public WebElement kartDate;

    @FindBy (xpath = "//input[@name='cvc']")
    public WebElement kartCvc;

    @FindBy (xpath = "//input[@name='contract']")
    public WebElement contract;



    //input[@name='contract']










}
