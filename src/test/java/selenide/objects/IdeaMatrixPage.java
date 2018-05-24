package selenide.objects;

import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class IdeaMatrixPage extends ResultIdeaForm{

    private static By ideaForm = By.cssSelector(".input");

    public IdeaMatrixPage searchIdea(String idea){
        $(ideaForm).clear();
        $(ideaForm).setValue(idea);
        $(".button").click();

        return page(IdeaMatrixPage.class);
    }

    public boolean checkResultsIdea(String idea){
       List<String> list = getResultsSearchingIdea();
       for(String l:list) {
           if(l.contains(idea)){
               continue;
       }
       else {
              return false;
           }
       }
       return true;
    }

}
