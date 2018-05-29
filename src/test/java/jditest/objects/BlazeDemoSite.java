package jditest.objects;


import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;

@JSite(value = "http://blazedemo.com")
public class BlazeDemoSite extends WebSite {

    @JPage(url = "/index.php", title = "BlazeDemo")
    public static HomePage homePage;
    @JPage(url = "/reserve.php", title = "BlazeDemo - reserve")
    public static ReservePage reservePage;




}
