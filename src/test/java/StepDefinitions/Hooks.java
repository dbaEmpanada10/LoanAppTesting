package StepDefinitions;

import PageObject.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    DriverFactory driverFactory;
    public WebDriver driver;

    @Before
    public void Before(){
        driverFactory = new DriverFactory();
        driver = driverFactory.getDriver();
        HomePage home = new HomePage();
        home.goTo();
    }
    @After
    public void After(){
        driverFactory = new DriverFactory();
        driverFactory.tearDownDriver();
    }
}
