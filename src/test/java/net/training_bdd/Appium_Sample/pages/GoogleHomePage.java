package net.training_bdd.Appium_Sample.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static net.training_bdd.Appium_Sample.CommonMethods.StartWebDriver;
import static org.junit.Assert.*;

/**
 * Created by Fernanda on 11/24/2016.
 */
public class GoogleHomePage {

    public static final String PAGE_TITLE = "Google";
    public static final String PAGE_URL = "http://www.google.com";

    String field_Search = "q";

    WebDriver driver;

    public GoogleHomePage(WebDriver seleniumWebDriver) {
        this.driver = seleniumWebDriver;
    }

    public void LoadPage() {
        driver.get("http://www.google.com");
        assertEquals("Not on Google home page.", driver.getTitle(), PAGE_TITLE);
    }

    public void PerformSearch(String text) {
        WebElement element = driver.findElement(By.name(field_Search));
        element.sendKeys(text, Keys.ENTER);
        assertTrue("Not on search results page.", driver.getTitle().contains(text));
    }
}
