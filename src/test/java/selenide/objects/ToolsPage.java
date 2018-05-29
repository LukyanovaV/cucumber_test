package selenide.objects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ToolsPage {


    public IdeaMatrixPage chooseIdeaMatrix(){

        $(By.id("item-matrix")).click();
        return page(IdeaMatrixPage.class);
    }


}
