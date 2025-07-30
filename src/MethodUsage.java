import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodUsage {
	
	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			driver.manage().window().maximize();
			
			iddItems(driver);
		
			

	}
		public static void iddItems(WebDriver driver)
		{
			String[] veggies= {"Brocolli","Cucumber","Beetroot","Carrot"};
			List <WebElement> products=driver.findElements(By.cssSelector(".product-name"));
			for(int i=0;i<products.size();i++)
			{
				int count=0;
				String[] actualProducts=products.get(i).getText().split("-");
				String names=actualProducts[0].trim();
				List vegitables=Arrays.asList(veggies);
				if(vegitables.contains(names))
				{
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					count++;
					if(count==4)
					{
						break;
					}
				}
			}
		}
}





