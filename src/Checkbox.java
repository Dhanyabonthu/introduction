//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkbox {
	//is Selected returns true or false

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Short wait for page load
        Thread.sleep(2000);

        // Only select checkboxes within the 'checkboxes' container (not hidden)
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        for (WebElement box : checkboxes) {
            if (box.isDisplayed() && box.isEnabled()) {
                // Scroll into view to avoid intercept issues
               // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", box);
                Thread.sleep(500); // let animation settle

                // Use JavaScript click to avoid interception
                //((JavascriptExecutor) driver).executeScript("arguments[0].click();", box);
                box.click();

                System.out.println("Clicked checkbox - selected: " + box.isSelected());
            }
        }

        driver.quit();
    }
}

