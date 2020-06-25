package june24;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptGroup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//implicit wait is implemented for the whole 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.cargurus.com/");
		
//		Select s = new Select(driver.findElement(By.id("carPickerUsed_makerSelect")));
//		
//		List<WebElement> options = s.getOptions();
//		
//		System.out.println(options.size());
//		
//		for (WebElement webElement : options) {
//			System.out.println(webElement.getText());
//		}
//		
//		s.selectByVisibleText("Willys");
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='carPickerUsed_makerSelect']//option"));
		
		for (WebElement webElement : options) {
			if(webElement.getText().equals("Willys"))
			webElement.click();
		}
	}

}
