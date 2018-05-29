package jditest;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import jditest.objects.BlazeDemoSite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;

@CucumberOptions(features = "src/test/resources/features/buying_ticket/buying_ticket.feature",
                 format = "pretty"   )
public class RunJDITest extends AbstractTestNGCucumberTests {

    public class BlazeDemoSiteInit extends TestNGBase {
        @BeforeSuite(alwaysRun = true)
        public void setUp() {
            WebSite.init(BlazeDemoSite.class);
            logger.info("Run Tests");
        }
    }

}