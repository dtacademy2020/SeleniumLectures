package june24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//implicit wait is implemented for the whole 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.travelocity.com/");
		
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("ba" );
		Thread.sleep(1000);
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(Keys.ENTER);
		
	}

}
