package sputnik.objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;


@DefaultUrl("https://www.sputnik.ru/")
public class HomePage extends PageObject {

    @FindBy(xpath = "//input[@id='js-search-input']")
    WebElement searchInput;

    public void inputWordInSearchBar(String keywords){
        searchInput.sendKeys(keywords);
        $("//button[@value='Найти']").click();
    }
}
