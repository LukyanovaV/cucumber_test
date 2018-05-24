package selenide.objects;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    MainMenu mainMenu;


    public static MainPage openMainPage(){
        open("https://www.artlebedev.ru/");
        return page(MainPage.class);
    }

    public ToolsPage openToolsPage(){
        mainMenu.chooseToolsMenu();
        return page(ToolsPage.class);
    }



}
