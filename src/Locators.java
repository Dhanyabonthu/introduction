import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(3000);
		driver.findElement(By.id("inputUsername")).sendKeys("rahulshetty");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahulshetty");	
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahushettyacademy");	
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7569162974");	
		driver.findElement(By.xpath("//button[normalize-space()='Reset Login']")).click();	
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		//driver.findElement(By.cssSelector("button.logout-btn")).click();
	
		driver.close();

	}

}
