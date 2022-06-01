package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /*
    Page Object Modlde driver için test Base classına extend etmek yerine Driver classından methodlar
    kullaanarak  driver olusturup ilgili ayarların yapılması ve en sonunda driverin kapatılması tercih edilmiştir
     */

    static WebDriver driver;
    private Driver(){

    }
    public static WebDriver getDriver(){


        if(driver==null) {
            switch (ConfigReader.getProperty("browser")){
                case "chrone":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }


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
