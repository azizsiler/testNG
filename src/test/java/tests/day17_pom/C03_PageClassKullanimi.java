package tests.day17_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_PageClassKullanimi {
    @Test
    public void test01(){
        FacebookPage facebookPage=new FacebookPage();
        //facebook ana sayfasına gidin
        Driver.getDriver().get("https://www.facebook.com");

        //kullanıcı mail kutusuna rastgele bir isim yazdırın
        Faker faker=new Faker();
        facebookPage.mailKutusu.sendKeys(faker.internet().emailAddress());

        // kullanıcı şifre  kutusuna rastgele bir password yazdırın
   facebookPage.sifreKutusu.sendKeys(faker.internet().password());
        // login kutusuna basın
        facebookPage.loginTusu.click();
        //gişiş yayapılmadığını test edin
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());
        Driver.closeDriver();
    }
}
