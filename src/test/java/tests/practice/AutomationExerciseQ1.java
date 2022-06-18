package tests.practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

import javax.swing.*;


public class AutomationExerciseQ1 extends TestBase {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
 // Launch browser
 // Navigate to url 'http://automationexercise.com'
 // Verify that home page is visible successfully
 // Click on 'Signup / Login' button
 // Verify 'Login to your account' is visible
 // Enter correct email address and password
 // Click 'login' button
 // Verify that 'Logged in as username' is visible
 // Click 'Delete Account' button
 // Verify that 'ACCOUNT DELETED!' is visible

@Test
    //Navigate to url 'http://automationexercise.com'
    public void test01(){
    Driver.getDriver().get(ConfigReader.getProperty("automationExerciseUrl"));

// Verify that home page is visible successfully
    String actualTitle=Driver.getDriver().getTitle();
    Assert.assertEquals("Automation Exercise", actualTitle);

    // Click on 'Signup / Login' button
    automationExercisePage.singUpLoginButonu.click();

   // Enter correct email address and password
    automationExercisePage.userName.sendKeys("UserName"+ Keys.ENTER);
    automationExercisePage.emailAdress.sendKeys("alivelifikri@mahmut.com");

    automationExercisePage.singUppButonu2.click();

    Actions actions=new Actions(Driver.getDriver());
    actions.sendKeys(Keys.SPACE).perform();
    automationExercisePage.radioButton.sendKeys(Keys.ENTER);
    actions.sendKeys(Keys.TAB).
            sendKeys(Keys.TAB).
            perform();
    automationExercisePage.password.click();
    automationExercisePage.password.sendKeys("1234");
    actions.sendKeys(Keys.TAB).
            perform();

    Select select1=new Select(automationExercisePage.birthDayDay);
    select1.selectByIndex(5);
    actions.sendKeys(Keys.TAB).perform();
    Select select2=new Select(automationExercisePage.birthDayMonth);
    select2.selectByIndex(6);
    actions.sendKeys(Keys.TAB).perform();
    Select select3=new Select(automationExercisePage.birthDayYear);
    select3.selectByIndex(3);

    actions.sendKeys(Keys.TAB).
            sendKeys(Keys.TAB).
            sendKeys(Keys.TAB).
            perform();
    automationExercisePage.firstName.sendKeys("Mahmut"+Keys.ENTER);
    automationExercisePage.lastName.sendKeys("veli"+Keys.ENTER);
    automationExercisePage.campany.sendKeys("ABA Campany");
    actions.sendKeys(Keys.TAB).perform();
    automationExercisePage.Adress.sendKeys("Yukari Mah/Asagi sok.no: 90");
    actions.sendKeys(Keys.TAB).perform();
    automationExercisePage.Adress2.sendKeys("Ankara /Haymana");
    actions.sendKeys(Keys.TAB).perform();

    Select select4=new Select(automationExercisePage.Country);
    select4.selectByIndex(3);
    actions.sendKeys(Keys.TAB).perform();

    automationExercisePage.State.sendKeys("Sidney");
    actions.sendKeys(Keys.TAB).perform();

    automationExercisePage.City.sendKeys("Mindy");
    actions.sendKeys(Keys.TAB).perform();

    automationExercisePage.Zipcode.sendKeys("12465");
    actions.sendKeys(Keys.TAB).perform();

    automationExercisePage.mobilNumber.sendKeys("15456545645");
    actions.sendKeys(Keys.TAB).perform();

    automationExercisePage.createButton.click();

    Assert.assertTrue(automationExercisePage.accountCreate.isEnabled());







}

}
