package tests.practice;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DragEndDropPage;
import utilities.Driver;

public class C05DragEndDrop {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.


    @Test
    public void test01() {
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        DragEndDropPage dragEndDropPage=new DragEndDropPage();
        Actions actions=new Actions(Driver.getDriver());

        actions.dragAndDrop(dragEndDropPage.Oslo, dragEndDropPage.Norway).
                dragAndDrop(dragEndDropPage.Stockholm,dragEndDropPage.Sweden).
                dragAndDrop(dragEndDropPage.washington,dragEndDropPage.UnitedStates).
                dragAndDrop(dragEndDropPage.Copenhagen,dragEndDropPage.Denmark).
                dragAndDrop(dragEndDropPage.Seoul,dragEndDropPage.southKorea).
                dragAndDrop(dragEndDropPage.Madrid,dragEndDropPage.Spain).
                dragAndDrop(dragEndDropPage.Roma,dragEndDropPage.Italy).perform();

        Driver.closeDriver();
    }
}
