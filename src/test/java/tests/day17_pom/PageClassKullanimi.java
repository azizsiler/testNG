package tests.day17_pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class PageClassKullanimi {
    //amazona gidelim nutella aratalım
    // sonuc yazısının nutella icerdiğini test edelim

    @Test

    public void test01(){
        AmazonPage amazonPage=new AmazonPage();
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //nutella aratalım

        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        // sonuc yazısının nutella icerdiğini test edelim
       String actualSonuc= amazonPage.aramaSonucElementi.getText();
       String arananKelime="nutella";

        Assert.assertTrue(actualSonuc.contains(arananKelime));

    }
}
