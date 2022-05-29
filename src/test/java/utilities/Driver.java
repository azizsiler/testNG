package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    /*
    Page Object Modlde driver için test Base classına extend etmek yerine Driver classından methodlar
    kullaanarak  driver olusturup ilgili ayarların yapılması ve en sonunda driverin kapatılması tercih edilmiştir
     */

    static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver!=null) { //driver a deger atanmışsa
            driver.close();
            driver=null;
        }
    }
}
