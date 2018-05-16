package testcucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewsYandexTest {

    private WebDriver driver;
    String browserName = System.getProperty("browser");


    @Given("^I am on Yandex home page$")
    public void i_am_on_Yandex_home_page(){
        WebDriverManager driverManager = new WebDriverManager(driver);
        driver = driverManager.getInstance(browserName);

        driver.get("https://yandex.ru");
    }

    @When("^I press news button$")
    public void i_press_news_buttons(){

        WebElement newsButton = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-id='news']")));
        newsButton.click();

    }

    @Then("^I am on news page$")
    public void i_am_on_news_page(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://news.yandex.ru/");
    }

    @After
    public void close(){
        driver.quit();
    }


}
