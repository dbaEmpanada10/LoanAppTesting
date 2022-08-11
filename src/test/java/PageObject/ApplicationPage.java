package PageObject;

import org.openqa.selenium.By;

public class ApplicationPage extends BasePage{
//    private static final By LAST_NAME = By.xpath("//input[@id='firstLame']");
//    private static final By AGE = By.xpath("//input[@id='age']");
//    private static final By ADDRESS_ONE = By.xpath("//input[@id='addressLine1']");
//    private static final By ADDRESS_TWO = By.xpath("//input[@id='addressLine2']");
//    private static final By POSTCODE = By.xpath("//input[@id='postCode']");
//    private static final By EMAIL = By.xpath("//input[@id='email']");
//    private static final By LOAN_AMOUNT = By.xpath("//input[@id='amount']");

    public void enterApplicationInfo(String selector, String input){
        By xPathSelector = By.xpath("//input[@id='" + selector + "']");
        findAndType(xPathSelector, input);
    }
}
