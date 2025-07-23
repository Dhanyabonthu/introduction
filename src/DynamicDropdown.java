import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2'][normalize-space()='From']")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Bengaluru')]")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Chennai')]")).click();
		//using parent-child 
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']//div[contains(text(),'Bengaluru')]")).click();
	}

}
