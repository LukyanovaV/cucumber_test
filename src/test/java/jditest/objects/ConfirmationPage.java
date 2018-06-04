package jditest.objects;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ConfirmationPage extends WebPage {

    @FindBy(xpath = "//tr[2]/td[2]")
    public WebElement status;

    public void statusIsPendingCapture(){
        Assert.assertEquals(status.getText(),"PendingCapture");

    }
}
