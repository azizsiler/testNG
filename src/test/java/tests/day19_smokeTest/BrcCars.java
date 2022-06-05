package tests.day19_smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.BrcPage1;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class BrcCars {

    //-> https://www.bluerentalcars.com/ adresıne gıdıp asagıdakı bılgılerle  login olalim
    //brcValidEmail=customer@bluerentalcars.com
    //brcValidPassword=12345

    BrcPage1 brcPage1=new BrcPage1();
    Actions actions=new Actions(Driver.getDriver());


    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        brcPage1.ilkLogin.click();
        brcPage1.emailKutusu.sendKeys(ConfigReader.getProperty("emailKutusu"));
        brcPage1.passwordKutusu.sendKeys(ConfigReader.getProperty("passwordKutusu"));
        brcPage1.ikinciLogin.click();


        //-> Ford Kuga i secip reservasyon yapalim
       WebElement secimElementi=Driver.getDriver().
               findElement(By.xpath("//select[@name='car']"));
       Select select=new Select(secimElementi);
       select.selectByVisibleText("Maseratittt");
       actions.click(brcPage1.picupSelect).
               sendKeys("Van"+ Keys.TAB).
               sendKeys("Izmir"+Keys.TAB).
               sendKeys("12.02.2023"+Keys.TAB).
               sendKeys("23:30"+Keys.TAB).
               sendKeys("12.03.2023"+Keys.TAB).
               sendKeys("23:30"+Keys.TAB).
               sendKeys(Keys.SPACE).perform();

        //Kart bilgilerini girerek ilerleyin

        actions.click(brcPage1.kartNo).
                sendKeys(ConfigReader.getProperty("kartNo")+Keys.TAB).
                sendKeys(ConfigReader.getProperty("kartName")+Keys.TAB).
                sendKeys(ConfigReader.getProperty("kartDate")+Keys.TAB).
                sendKeys(ConfigReader.getProperty("kartCvc")+Keys.TAB).
                sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.SPACE).
                perform();


       // Driver.closeDriver();
    }
}
