import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage {

    public void submitForm(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Vasile");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Dan");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Tester");

        WebElement educationLevel = driver.findElement(By.id("radio-button-1"));
        educationLevel.click();

        WebElement gender = driver.findElement(By.id("checkbox-1"));
        gender.click();

        WebElement experience = driver.findElement(By.cssSelector("option[value='4']"));
        experience.click();

        WebElement date = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));
        date.sendKeys("11/11/2022");

        WebElement submitBtn = driver.findElement(By.cssSelector("a[class*='btn-lg'][role='button']"));
        submitBtn.click();
    }
}
