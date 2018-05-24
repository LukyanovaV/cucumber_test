package selenide.objects;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class ResultIdeaForm extends ElementsContainer {

    public List<String> getResultsSearchingIdea(){
        return $$(".als-columns").texts();
    }
}
