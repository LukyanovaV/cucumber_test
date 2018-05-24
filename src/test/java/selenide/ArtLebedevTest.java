package selenide;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Configuration.timeout;
import static selenide.objects.MainPage.openMainPage;

public class ArtLebedevTest {

    String query = System.getProperty("query");

    @BeforeClass
    public static void settingConf(){
        timeout = 30000;
        browser = "chrome";
    }


    @Test
    public void searchOnArtLebedev(){
        openMainPage()
                .openToolsPage()
                .chooseIdeaMatrix()
                .searchIdea(query)
                .checkResultsIdea(query);

}
}

