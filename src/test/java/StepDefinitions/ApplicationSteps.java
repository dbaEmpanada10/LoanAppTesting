package StepDefinitions;

import PageObject.ApplicationPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class ApplicationSteps{
    private ApplicationPage application;
    private HomePage homePage;
    private LoginPage login;
    private WebDriver driver;
    DriverFactory driverFactory = new DriverFactory();
    public ApplicationSteps(){
        driver = driverFactory.getDriver();
        homePage = new HomePage();
        login = new LoginPage();
        application = new ApplicationPage();
    }

    @Given("I am logged in as user")
    public void setLoginAsUser(){
        homePage.clickOnLoginLink();
        login.setEnterUser("user");
        login.setEnterPass();
        login.setClickSubmit();
    }

    @And("I am at the application page")
    public void iAmAtTheApplicationPage() {
        homePage.clickOnApplicationLink();
    }

    @When("I submit the application")
    public void iSubmitTheApplication(DataTable userLoginCreds) {
        Map<String, String> loginMap = userLoginCreds.asMap();
        String loginFirstName = loginMap.get("firstName");
        String loginLastName = loginMap.get("lastName");
        System.out.println(loginFirstName);
        System.out.println(loginLastName);
        application.enterApplicationInfo("firstName", loginFirstName );
        application.enterApplicationInfo("lastName", loginLastName );
    }
}
