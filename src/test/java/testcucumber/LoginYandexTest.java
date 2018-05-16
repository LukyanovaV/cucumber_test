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

public class LoginYandexTest {

    private WebDriver driver;
    String browserName = System.getProperty("browser");

    @Given("^I am on yandex login page$")
    public void i_am_on_yandex_login_page(){

        WebDriverManager driverManager = new WebDriverManager(driver);
        driver = driverManager.getInstance(browserName);

        driver.get("https://passport.yandex.ru");
    }

    @When("^I input \"(.*)\" in login, \"(.*)\" in password$")
    public void i_input_login_and_password(String Login, String Password){

       driver.findElement(By.xpath("//input[@name='login']")).sendKeys(Login);
       driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(Password);
       driver.findElement(By.xpath("//button[@class='passport-Button']")).click();

    }

    @Then("^I am not on email page$")
    public void i_am_not_on_email_page(){
        WebElement errorMessage = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/div/div/div[1]")));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @After
    public void driver_close(){
        driver.quit();
    }


}
