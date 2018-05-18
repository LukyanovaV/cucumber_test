package sputnik.objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultPage extends PageObject {

    @FindBy(xpath = "//div[@class='b-result-text']")
    List<WebElement> listingResults;

    public List<String> getResultTitles(){
        return listingResults.stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());
    }


}
