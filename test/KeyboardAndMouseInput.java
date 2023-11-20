import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        FormPage formPage = new FormPage();
        ConfirmationPage confirmationPage = new ConfirmationPage();
        driver.get("https://formy-project.herokuapp.com/form");

        formPage.submitForm(driver);
        confirmationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        driver.quit();
    }
}