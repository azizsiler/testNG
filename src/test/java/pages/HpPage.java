package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HpPage {

    public HpPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@href='/Account/Logon']")
        public WebElement HploginButonu;

    @FindBy (xpath= " //input[@class='form-control required']")
        public WebElement HpUserNameKutusu;

    @FindBy (xpath = "//input[@class='form-control required password']")
    public WebElement HpPasswordKutusu;

    @FindBy (xpath = "//input[@id='btnSubmit']")
    public WebElement HpIkinciLogin;

    @FindBy (linkText = "//span[@class='title']")
    public WebElement HpHotelManangment;

    @FindBy (xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement HpHoleList;

    @FindBy (xpath = "//input[@name='IDUser']")
    public WebElement HpIDKutusu;

    @FindBy(xpath = "//input[@name='UserName']")
    public WebElement HpMAnagerUsername;

    @FindBy(xpath = "//input[@class='form-control form-filter input-sm']")
    public WebElement HpEmailManagerUsername;




    //buradan itibaren 2.Test calisir

    @FindBy (xpath = "//span[@class='btn btn-primary py-3 px-5']")

    public WebElement HpCreatAccount;

    @FindBy (xpath = "//input[@class='form-control required']")
    public WebElement HpUsernameAccount;

    @FindBy (xpath = "//input[@placeholder='Password']")
    public WebElement HpPasswordAccount;

    @FindBy (xpath = "//input[@class='form-control required email']")
    public WebElement HpEmailAccount;

    @FindBy(xpath = "//input[@id='NameSurname']")
    public WebElement HpFullNameAccount;

    @FindBy (xpath = "//input[@id='PhoneNo']")
    public  WebElement HpNumberAccount;

    @FindBy (xpath = "//input[@placeholder='Social Security Number']")
    public WebElement HpSosyalNumberAccount;

    @FindBy (xpath = "//input[@name='DrivingLicense']")
    public WebElement HpDriverLicenseAccount;

    @FindBy (xpath = "//select[@id='IDCountry']")
    public WebElement HpSelectCountryAccount;

    @FindBy (xpath = "//select[@data-val-number='The field IDCountry must be a number.']")
    public WebElement HpSelectTurkeyAccount;

}
