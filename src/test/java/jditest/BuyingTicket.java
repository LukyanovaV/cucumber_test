package jditest;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static jditest.objects.BlazeDemoSite.*;


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
    public void userInputHis(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9){
        perchasePage.shouldBeOpened();
        perchasePage.checkFlight(reservePage.Airlane, reservePage.FlightNum, reservePage.Price);
        perchasePage.InputName(arg0)
                    .InputAddres(arg1)
                    .InputCity(arg2)
                    .InputState(arg3)
                    .InputZipCode(arg4)
                    .SetCardType(arg5)
                    .InputCreditCardNum(arg6)
                    .InputCreditCardMonth(arg7)
                    .InputCreditCardYear(arg8)
                    .InputNameOnCard(arg9)
                    .complete();

    }

    @Then("^User get his purchase$")
    public void userGetHisPurchase(){
        confirmationPage.shouldBeOpened();
        confirmationPage.statusIsPendingCapture();
    }
}
