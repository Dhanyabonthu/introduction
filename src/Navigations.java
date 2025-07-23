import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("http://www.rahulshettyacademy.com/");
		driver.navigate().back();

	}

}
