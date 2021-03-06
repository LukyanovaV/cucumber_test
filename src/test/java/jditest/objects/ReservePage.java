package jditest.objects;

import com.epam.jdi.uitests.core.interfaces.complex.tables.interfaces.ICell;
import com.epam.jdi.uitests.core.interfaces.complex.tables.interfaces.ITable;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.table.Table;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ReservePage extends WebPage {

    public static Float Price;
    public static String Airlane;
    public static String FlightNum;


    @FindBy(xpath = "//td[6]")
    List <WebElement> price;

    @FindBy(xpath = "//td[1]")
    List <Button> chooseBtn;

    @FindBy(xpath = "//td[2]")
    List <WebElement> flight;

    @FindBy(xpath = "//td[3]")
    List <WebElement> airline;

    public List <Float> getListFlights() {

        List<String> listPrices = price.stream()
                .map(element -> element.getText().replace("$",""))
                .collect(Collectors.toList());
    return listPrices.stream().map(a ->Float.parseFloat(a)).collect(Collectors.toList());}



    public void chooseCheapFli(){
      Integer min = getListFlights().indexOf(getListFlights().stream().min(Float::compareTo).get());
      Price = getListFlights().get(min);
      Airlane = airline.get(min).getText();
      FlightNum = flight.get(min).getText();
      Button cg = chooseBtn.get(min);
      cg.click();
    }





}
