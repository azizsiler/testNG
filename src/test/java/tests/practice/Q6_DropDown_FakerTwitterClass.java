package tests.practice;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.FakerTwitterPage;
import utilities.Driver;
import utilities.TestBase;

public class Q6_DropDown_FakerTwitterClass extends TestBase {
    //twitter a faker class kullanarak mail ile kayit olmaya calisiniz
    //actions class kullanmayin twitteri deneyen instagram i denesin

    // Not :bilerek page class yapmadim, derste FaceBook uzerine calismissnz karissin istemedim,
    // siz isterseniz uyarlayabilirisniz



    @Test
    public void fakerTwitter() throws InterruptedException {
        Faker faker=new Faker();
        driver.get("https://www.twitter.com");
        WebElement twitterKayitGiris= driver.findElement(By.xpath("//a[@role='link']"));
        twitterKayitGiris.click();

        WebElement kayitButonu= driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-16y2uox r-1wbh5a2 r-1wzrnnt r-1udh08x r-xd6kpl r-1pn2ns4 r-ttdzmv']"));
            kayitButonu.click();

          WebElement emailYerine= driver.findElement(By.xpath("//span[.='E-posta kullan']"));
          emailYerine.click();

          WebElement isimYerine= driver.findElement(By.xpath("//input[@autocapitalize='sentences']"));
          isimYerine.click();
          isimYerine.sendKeys(faker.funnyName().name());

          WebElement mailYerine= driver.findElement(By.name("email"));
          mailYerine.click();
          mailYerine.sendKeys(faker.internet().emailAddress());

          Thread.sleep(4000);

          WebElement ayElementi=driver.findElement(By.xpath("//select[@id='SELECTOR_1']"));
          WebElement gunElementi= driver.findElement(By.xpath("//select[@id='SELECTOR_2']"));
          WebElement yilElementi= driver.findElement(By.xpath("//select[@id='SELECTOR_3']"));

        Select select=new Select(ayElementi);
        select.selectByIndex(faker.number().numberBetween(1,13));

        Select select1=new Select(gunElementi);
        select1.selectByIndex(faker.number().numberBetween(1,30));

        Select select2=new Select(yilElementi);
        select2.selectByIndex(faker.number().numberBetween(1,65));

        WebElement ileriButonu= driver.findElement(By.xpath("(//div[@role='button'])[3]"));
        ileriButonu.click();

        WebElement ileriButonu2= driver.findElement(By.xpath("(//div[@dir='auto'])[6]"));
        ileriButonu2.click();

        WebElement kaydolButonu= driver.findElement(By.xpath("(//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0'])[29]"));
        kaydolButonu.click();

      Thread.sleep(5555);
      driver.close();






    }




}