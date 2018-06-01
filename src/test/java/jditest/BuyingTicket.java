package jditest;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jditest.objects.BlazeDemoSite;
import org.testng.annotations.BeforeClass;

import static jditest.objects.BlazeDemoSite.homePage;
import static jditest.objects.BlazeDemoSite.reservePage;


public class BuyingTicket{


    @Given("^User is on a blazedemo page$")
    public void userIsOnABlazedemoPage() {
        homePage.open();
        homePage.shouldBeOpened();
    }

    @And("^User set \"(.*)\" and \"(.*)\"$")
    public void userSetDepcityAndDestCity(String from, String to){
        homePage.searchFlights(from,to);
            }

    @When("^User choose the cheapest flight$")
    public void userChooseTheCheapestFlight()  {
        reservePage.chooseCheapFli();
    }

    @And("^User input his \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void userInputHis(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^User get his purchase$")
    public void userGetHisPurchase() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
