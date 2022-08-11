package StepDefinitions;

import PageObject.HomePage;
import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MyStepDefs {
    private HomePage homePage;
    private LoginPage login;
    private WebDriver driver;
    DriverFactory driverFactory = new DriverFactory();

    public MyStepDefs() {

        driver = driverFactory.getDriver();
        homePage = new HomePage();
        login = new LoginPage();
    }


    @Given("I am at the login page")
    public void iAmAtTheLoginPage() {
        homePage.clickOnLoginLink();
    }

    @When("User enters their credentials and submits")
    public void userEntersTheirCredentialsAndSubmits() {
        login.setEnterUser("user");
        login.setEnterPass();
        login.setClickSubmit();
    }
    @Then("I am redirected to the home page")
    public void iAmRedirectedToTheHomePage() {
       homePage.assertHomePageText();
    }

    @Then("I am redirected to the login page")
    public void iAmRedirectedToTheLoginPage() {
        homePage.assertLogoutPage();
    }


    @When("Admin enters their credentials and submits")
    public void adminEntersTheirCredentialsAndSubmits() {
        login.setEnterUser("admin");
        login.setEnterPass();
        login.setClickSubmit();
    }

    @When("I logout")
    public void iLogout() {
        homePage.clickOnLogoutLink();
    }

    @Given("I am at the homepage")
    public void iAmAtTheHomepage() {
        homePage.assertHomePageText();
    }

    @When("I try to access a link")
    public void iTryToAccessALink() {
        homePage.clickOnLoginLink();
    }
}
