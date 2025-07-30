import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
		
		//Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> products=driver.findElements(By.cssSelector(".product-name"));
		
		
		for(int i=0;i<products.size();i++)
		{
			int count=0;
			String[] actualProducts=products.get(i).getText().split("-");
			String veggies=actualProducts[0].trim();
			
			if(veggies.contains("Cucumber"))
					{
				count++;
		
				
				driver.findElement(By.xpath("//div[3]//div[3]//button[1]")).click();
				
					}
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		
		//explicit wait
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(2));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));



		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		//fluent wait
		//fluent wait
		Wait<WebDriver> wait = new FluentWait<>(driver)
			    .withTimeout(Duration.ofSeconds(30)) // Maximum wait time
			    .pollingEvery(Duration.ofSeconds(5)) // Polling interval
			    .ignoring(NoSuchElementException.class); // Exception(s) to ignore

			WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			    public WebElement apply(WebDriver driver) {
			        return driver.findElement(By.id("elementId")); // Condition to wait for
			    }
			});
		
	}
	
	

}





