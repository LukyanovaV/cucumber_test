package jditest.objects;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Input;
import com.epam.jdi.uitests.web.selenium.elements.complex.Selector;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;

public class PurchasePage extends WebPage {

    @FindBy(xpath = "//p[1]")
    WebElement airline;

    @FindBy(xpath = "//p[2]")
    WebElement flightNum;

    @FindBy(xpath = "//p[3]")
    WebElement price;


    @FindBy(xpath = "//*[@id='inputName']")
    public  Input name;

    @FindBy(xpath = "//*[@id='address']")
    public Input addres;

    @FindBy(xpath = "//*[@id='city']")
    public Input city;

    @FindBy(xpath = "//*[@id='state']")
    public Input state;

    @FindBy(xpath = "//*[@id='zipCode']")
    public Input zipCode;

    @FindBy(xpath = "//*[@id='cardType']")
    public Selector cardType;

    @FindBy(xpath = "//*[@id='creditCardNumber']")
    public Input creditCardNumber;

    @FindBy(xpath = "//*[@id='creditCardMonth']")
    public Input creditCardMonth;

    @FindBy(xpath = "//*[@id='creditCardYear']")
    public Input creditCardYear;

    @FindBy(xpath = "//*[@id='nameOnCard']")
    public Input nameOnCard;

    @FindBy(xpath = "//*[@value='Purchase Flight']")
    public Button purchFlight;

    public PurchasePage InputName(String name){ this.name.input(name); return this; }
    public PurchasePage InputAddres(String addres){this.addres.input(addres); return this;}
    public PurchasePage InputCity(String city){this.city.input(city); return this;}
    public PurchasePage InputState(String state){this.state.input(state); return this;}
    public PurchasePage InputZipCode(String zipCode){this.zipCode.input(zipCode); return this;}
    public PurchasePage SetCardType(String cardType){this.cardType.select(cardType); return this;}
    public PurchasePage InputCreditCardNum(String creditCardNumber){this.creditCardNumber.input(creditCardNumber); return this;}
    public PurchasePage InputCreditCardMonth(String creditCardMonth){this.creditCardMonth.clear(); this.creditCardMonth.input(creditCardMonth); return this;}
    public PurchasePage InputCreditCardYear(String creditCardYear){this.creditCardYear.clear(); this.creditCardYear.input(creditCardYear); return this;}
    public PurchasePage InputNameOnCard(String nameOnCard){this.nameOnCard.input(nameOnCard); return this;}

    public void complete(){purchFlight.click();}

    public void checkFlight(String airLine, String flightNumber, Float price){

        doesContains(airline.getText(),airLine);
        doesContains(flightNum.getText(),flightNumber);
        doesContains(this.price.getText(),price.toString());

    }

    public void doesContains(String message, String word){
        if(!message.contains(word)){
            logger.info(message+" doesn't contain "+ word);
        }
        Assert.assertTrue(message.contains(word));

    }



}
