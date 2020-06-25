package june24;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowms {

	public static void main(String[] args) {
		// flight-OriginStationCode
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//implicit wait is implemented for the whole 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.spirit.com/");
		
		driver.findElement(By.id("flight-OriginStationCode")).click();
		
		driver.findElement(By.xpath("//button[contains( text(), 'SJD')]")).click();
		
		driver.findElement(By.id("flight-DestinationStationCode")).click();
		
		driver.findElement(By.xpath("(//button[contains( text(), 'DTW')])[2]")).click();
		driver.findElement(By.id("flight-Date")).click();

		
		String xpath = "//bs-days-calendar-view[1]//table//tr//td//span[not(@class='is-other-month')]";
		
		List<WebElement> currentMonthDates = driver.findElements(By.xpath(xpath));

		for (int i = 0; i < currentMonthDates.size(); i++) {
			String text = driver.findElements(By.xpath(xpath)).get(i).getText();
			
			if(text.equals("27")) {
				driver.findElements(By.xpath(xpath)).get(i).click();
			}
			
			if(text.equals("30")) {
				driver.findElements(By.xpath(xpath)).get(i).click();
			}
			
		}

	}

}
