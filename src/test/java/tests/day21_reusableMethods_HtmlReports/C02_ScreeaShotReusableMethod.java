package tests.day21_reusableMethods_HtmlReports;

import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C02_ScreeaShotReusableMethod {
    @Test
    public void test01() throws IOException {
        // amazon sayfasina gidip ekran foto cek

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.getScreenshot("amazon");
        Driver.getDriver();
    }
}
