package testcucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = "src/test/resources/features/search/search_by_keyword.feature"
//glue = "java/sputnik/steps"
)
public class RunCucumberTest {
}