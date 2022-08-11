package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    private static final By CLICK_LOG = By.xpath("//span/a[@href]");
    private static final By APPLICATION_LINK = By.xpath("//a[@href='/application']");
    private static final By ADMIN_PAGE = By.xpath("//h2/a[@href='/admin']");
    private static final By CLICK_LOGOUT = By.xpath("//span/a[@href='/logout']");
    private static final By ABOUT_PAGE = By.xpath("//h2/a[@href='/about']");
    private static final By SEARCH_PAGE = By.xpath("//h2/a[@href='/search']");
    private static final By HOMEPAGE_TEXT = By.xpath("//div[@class='starter-template']/p[1]");

    private String urlToFind = "http://3.10.20.20:8080/";

    /*    public HomePage(WebDriver driver) {
            super(driver);
        }*/
    public void goTo(){
        driver.get(urlToFind);
    }
    public void clickOnLoginLink(){waitAndClick(CLICK_LOG);}
    public void clickOnLogoutLink(){waitAndClick(CLICK_LOGOUT);}
    public void clickOnApplicationLink(){waitAndClick(APPLICATION_LINK);}
    public void clickOnAdminLink(){waitAndClick(ADMIN_PAGE);}
    public void clickOnSearchLink(){waitAndClick(SEARCH_PAGE);}
    public void clickOnAboutLink(){waitAndClick(ABOUT_PAGE);}
    public void assertHomePageText(){
        String assertText = findText(HOMEPAGE_TEXT);
        Assert.assertEquals("This system is the be used by bank branch staff to complete applications for loans."
                , assertText);
    }
    public void assertLogoutPage(){
        String url = driver.getCurrentUrl();
        Assert.assertEquals("http://3.10.20.20:8080/login?logout", url);
    }
}
