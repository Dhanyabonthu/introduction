import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selfintroduction {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[normalize-space()='Gmail']")).click();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
		driver.close();

	}

}
