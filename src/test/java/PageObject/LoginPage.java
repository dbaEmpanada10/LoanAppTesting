package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private static final By CLICK_LOG = By.xpath("//span/a[@href]");
    private static final By ENTER_USER = By.xpath("//input[@id='username']");
    private static final By ENTER_PASS = By.xpath("//input[@id='password']");
    private static final By CLICK_SUBMIT = By.xpath("//input[@type='submit']");
    private static final By ASSERT_TEXT = By.xpath("//fieldset/h1");

    public void generalLog(){ waitAndClick(CLICK_LOG);}
    public void setEnterUser(String input){findAndType(ENTER_USER, input);}
    public void setEnterPass(){findAndType(ENTER_PASS, "password");}
    public void setClickSubmit(){waitAndClick(CLICK_SUBMIT);}
    public void assertLoginText(){
        String assertText = findText(ASSERT_TEXT);
        Assert.assertEquals("Please Sign In", assertText);
    }
}
