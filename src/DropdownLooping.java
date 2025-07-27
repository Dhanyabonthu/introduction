import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownLooping {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		
		//with while loop
		/*int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
	driver.findElement(By.id("btnclosepaxoption")).click();
	}*/
		
		//with for loop
		//WebElement loopingdropdown = driver.findElement(By.id("hrefIncAdt"));
		


		for(int i=1;i<5;i++)
			
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		System.out.println(driver.findElement(By.id("hrefIncAdt")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
	}
	}

		
		

