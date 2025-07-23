import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(3);
		WebElement firstelement=dropdown.getFirstSelectedOption();
		System.out.println(firstelement.getText());
		dropdown.selectByVisibleText("INR");
		dropdown.selectByValue("AED");
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
