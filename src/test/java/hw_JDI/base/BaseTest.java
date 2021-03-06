package hw_JDI.base;

import com.epam.jdi.light.driver.WebDriverFactory;
import com.epam.jdi.light.elements.init.PageFactory;
import hw_JDI.JdiSite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;

public class BaseTest {
    @BeforeTest(alwaysRun = true)
    public void beforeTest(){
        PageFactory.initElements(JdiSite.class);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        WebDriverFactory.getDriver().quit();
    }

    @AfterTest(alwaysRun = true)
    public void afterTest(){
        killAllSeleniumDrivers();
    }
}
