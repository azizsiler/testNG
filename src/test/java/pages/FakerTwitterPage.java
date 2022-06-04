package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FakerTwitterPage {
    public FakerTwitterPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "//span[@class='css-901oao css-16my406 css-bfa6kz r-poiln3 r-a023e6 r-rjixqe r-bcqeeo r-qvutc0']")
    public WebElement fakerTwitterKayitButonu;
}
