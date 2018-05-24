package selenide.objects;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class MainMenu extends ElementsContainer {

    private By menu = By.xpath("//menu[@class='clearfix']");

    @FindBy(xpath = "/html/body/div[3]/div[1]/div[1]/menu/li[2]/a")
    SelenideElement toolsMenu;

    public ToolsPage chooseToolsMenu() {

        //toolsMenu.click();
        $x("/html/body/div[3]/div[1]/div[1]/menu/li[2]/a").click();
        return page(ToolsPage.class);
    }
}


