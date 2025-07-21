import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("theme-btn.register-btn")));
		

		
		driver.get("http://www.rahulshettyacademy.com/");
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("dhanya");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dhanya@gmail.com");
		driver.findElement(By.xpath("//input[@id='allowMarketingEmails']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='otp-login-btn']")).click();
		
		//driver.close();

	}

}
