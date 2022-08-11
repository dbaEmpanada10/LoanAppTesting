package PageObject;

import StepDefinitions.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    DriverFactory driverFactory;

    public BasePage() {
        driverFactory = new DriverFactory();
        this.driver = driverFactory.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    void waitAndClick(By selector){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.click();
    }

    void findAndType(By selector, String input){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.sendKeys(input);
    }

    String findText(By selector){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        String elmtText = element.getText();
        return elmtText;
    }
    void findUrlLink(String u){
        wait.until(ExpectedConditions.urlToBe(u));
    }

}
