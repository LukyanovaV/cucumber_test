package jditest.objects;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.Selector;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebPage {

    @FindBy(xpath = "/html/body/div[3]/form/select[1]")
    public Selector fromPort;

    @FindBy(xpath = "//select[@name='toPort']")
    public Selector toPort;

    @FindBy(css = "input.btn")
    public Button findFlights;


    public void searchFlights(String from, String to){
        this.fromPort.select(from);
        this.toPort.select(to);
        this.findFlights.click();

    }


}
