import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector(".a-button-text")).click();
		Actions a=new Actions(driver);
		WebElement element=driver.findElement(By.cssSelector(".icp-nav-link-inner"));
		a.moveToElement(element).build().perform();
		a.contextClick(driver.findElement(By.id("nav-cart"))).build().perform();
		driver.findElement(By.cssSelector(".a-button-input")).click();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	}

}
