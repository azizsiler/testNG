package tests.day19_smokeTest;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HpPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class HpTest {

    Actions actions=new Actions(Driver.getDriver());
    HpPage hpPage=new HpPage();



    @Test
    public void test01() {

        Actions actions=new Actions(Driver.getDriver());
        //1. Tests packagenin altına class olusturun: CreateHotel
        // 2.Bir metod olusturun: createHotel
        // 3.https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HpUrl"));
        // login butonuna tiklayin
        hpPage.HploginButonu.click();
        // 4.Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
        hpPage.HpUserNameKutusu.sendKeys(ConfigReader.getProperty("HpUserNameKutusu"));
        hpPage.HpPasswordKutusu.sendKeys(ConfigReader.getProperty("HpPasswordKutusu"));
        hpPage.HpIkinciLogin.click();

        // a. Username: manager
        // b. Password: Manager 1

        // 5.Login butonuna tıklayın.

        // 6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
       actions.moveToElement(Driver.getDriver().findElement(By.xpath("//span[@class='title']")));
       actions.moveToElement(Driver.getDriver().findElement(By.xpath("//a[@href='/admin/HotelAdmin']")));

        //  7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        //actions.moveToElement(Driver.getDriver().findElement(By.xpath("//input[@name='IDUser']"))).click();

        hpPage.HpMAnagerUsername.sendKeys(ConfigReader.getProperty("HpMAnagerUsername"));
        actions.sendKeys(Keys.TAB);
        actions.moveToElement(Driver.getDriver().
                findElement(By.xpath("//input[@class='form-control form-filter input-sm']")));

        hpPage.HpEmailManagerUsername.sendKeys(ConfigReader.getProperty("HpEmailManagerUsername"));


    // 8. Save butonuna tıklayın.
        // 9. “Hotel was inserted successfully"textinin göründüğünü test edin.
        //  10. OK butonuna tıklayın.








           // Driver.closeDriver();
        }
    @Test
    public void test02() {
        //2.Kisim


        // login account butonuna tiklayin
        hpPage.HpCreatAccount.click();

        // kullanici adi abuzittin gir
        hpPage.HpUsernameAccount.sendKeys(ConfigReader.getProperty("HpUsernameAccount"));
        // sifrenizi 12345
        // actions.sendKeys(Keys.PAGE_DOWN).perform();
        hpPage.HpPasswordAccount.sendKeys(ConfigReader.getProperty("HpPasswordAccount"));
        // email adresii gir
        hpPage.HpEmailAccount.sendKeys(ConfigReader.getProperty("HpEmailAccount"));

        // Full Name'i giriniz
        hpPage.HpFullNameAccount.sendKeys(ConfigReader.getProperty("HpFullNameAccount"));

        // numranizi giriniz
        hpPage.HpNumberAccount.sendKeys(ConfigReader.getProperty("HpNumberAccount"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // Sosyal guvenluk numaranizi giriniz
        hpPage.HpSosyalNumberAccount.sendKeys(ConfigReader.getProperty("HpSosyalNumberAccount"));

        //surucu belgenizi giriniz
        hpPage.HpDriverLicenseAccount.sendKeys(ConfigReader.getProperty("HpDriverLicenseAccount"));

        hpPage.HpSelectCountryAccount.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        hpPage.HpSelectTurkeyAccount.sendKeys(ConfigReader.getProperty("HpSelectTurkeyAccount"));
        hpPage.HpSelectTurkeyAccount.click();


    }
    }



