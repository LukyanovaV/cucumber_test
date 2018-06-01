package jditest.objects;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.Selector;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends WebPage {

    @JFindBy(xpath = "/html/body/div[3]/form/select[1]")
    public static Selector fromPort;

    @JFindBy(xpath = "//select[@name='toPort']")
    public static Select toPort;

    @JFindBy(css = "input.btn")
    public static Button findFlights;


    public static void searchFlights(String from, String to){
        fromPort.select(from);
        toPort.selectByValue(to);
        findFlights.click();

    }

}
