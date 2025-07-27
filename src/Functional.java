import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functional {
	public static void main(String[] args) {
		int count=0;
		WebDriver driver=new ChromeDriver();
		String[] itemsNeeded= {"Cucumber", "Brocolli","Beetroot"};
		int j=0;
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		List<WebElement>products=driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			
			//formatting the product name
			//convert array into arraylist for easy search
			//check wether name you excpected is present in Array list or not
			List itemsNeededList=Arrays.asList(itemsNeeded);
			
			
			if(itemsNeededList.contains(formattedName))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==3)
				{
					break;
				}
				
				
			}
			
		}
		
	}

}
