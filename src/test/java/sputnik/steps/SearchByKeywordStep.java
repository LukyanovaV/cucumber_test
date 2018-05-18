package sputnik.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import sputnik.objects.SerchingSteps;

public class SearchByKeywordStep {
    @Steps
    SerchingSteps serchingSteps;

    @Given("^User is on a home page$")
    public void user_is_on_a_home_page(){
        serchingSteps.open_sputnik_home_page();
    }

    @When("^User input \"([^\"]*)\" in searching bar and click on search button$")
    public void userInputInSearchingBarAndClickOnSearchButton(String arg0) {
        serchingSteps.search_results_by_keyword(arg0);
    }



    @Then("^User is on result list page and result list contain input \"([^\"]*)\"$")
    public void userIsOnResultListPageAndResultListContainInput(String arg0){
         serchingSteps.should_see_list_results_related_to(arg0);
    }
}
