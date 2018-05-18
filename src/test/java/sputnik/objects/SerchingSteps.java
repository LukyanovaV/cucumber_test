package sputnik.objects;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;

public class SerchingSteps {
    HomePage homePage;
    SearchResultPage searchResultPage;

    @Step
    public void open_sputnik_home_page(){
        homePage.open();
    }

    @Step
    public void search_results_by_keyword(String keyword){
        homePage.inputWordInSearchBar(keyword);
    }

    @Step
    public void should_see_list_results_related_to(String keyword){
        List<String> resultTitles = searchResultPage.getResultTitles();
        resultTitles.stream().forEach(title -> Assert.assertTrue(title.contains(keyword)));
    }


}
