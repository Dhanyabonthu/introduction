import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPageDetails {
	
	public void additem(WebDriver driver)
	{
		List<WebElement> products=driver.findElements(By.cssSelector(".product-name"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    
		//System.out.println(products.size());
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		// wait.until(ExpectedConditions.visibilityOfElementLocated( By.cssSelector(".product-name")));
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
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		

	}

	
}
