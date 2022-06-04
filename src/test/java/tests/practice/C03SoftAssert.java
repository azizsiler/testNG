package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SousDemoPage;
import utilities.Driver;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Collections;

public class C03SoftAssert {
    /*
     * Navigate to  https://www.saucedemo.com/
     * Enter the user name  as standard_user
     * Enter the password as   secret_sauce
     * Click on login button
     *     T1 : Choose price low to high with soft Assert
     *     T2 : Verify item prices are sorted from low to high with hard Assert
     */

    // Verify item prices are sorted from low to high with hard Assert

   // softAsser: calisaya devam edet
    //hardAsset: calsimayi hata olursa durduru

    SousDemoPage sousDemoPage=new SousDemoPage();
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void souceDemoHard() {
        Driver.getDriver().get("https://www.saucedemo.com/");
        sousDemoPage.userName.sendKeys("standard_user");
        sousDemoPage.password.sendKeys("secret_sauce");
        sousDemoPage.loginButonu.click();

        Select select=new Select(sousDemoPage.dropDown);
        select.selectByVisibleText("Price (low to high)");

        String expected="PRISE (LOW TO HIGH)";
        String actual=select.getFirstSelectedOption().getText();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actual,expected);



        String actual2=Driver.getDriver().findElement(By.className("active_option")).getText();
        softAssert.assertEquals(actual2,expected);
    }

    @Test
    public void souceDemoSoft() {
        Driver.getDriver().get("https://www.saucedemo.com/");
        sousDemoPage.userName.sendKeys("standard_user");
        sousDemoPage.password.sendKeys("secret_sauce");
        sousDemoPage.loginButonu.click();

        Select select=new Select(sousDemoPage.dropDown);
        select.selectByVisibleText("Price (low to high)");

        String expected="PRISE (LOW TO HIGH)";
        String actual=select.getFirstSelectedOption().getText();

       select.selectByIndex(2);
        ArrayList<Double>urunlerDouble=new ArrayList<>();

        for (WebElement each:sousDemoPage.urunler) {
           // String strFiyatlar=each.getText().replaceAll("$","");
            String strFiyatlar= each.getText().replaceAll("^\\D","");
           urunlerDouble.add(Double.parseDouble(strFiyatlar));
        }

        ArrayList<Double>kontolListe=new ArrayList<>(urunlerDouble);
        Collections.sort(kontolListe);

        Assert.assertEquals(kontolListe,urunlerDouble);

    }


}
