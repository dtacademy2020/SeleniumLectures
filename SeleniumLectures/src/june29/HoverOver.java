package june29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		
//		
		driver.get("https://amazon.com");
		
		WebElement link = driver.findElement(By.xpath("//span[contains(text(), 'Account & Lists')]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(link).pause(Duration.ofSeconds(3)).click(driver.findElement(By.xpath("//a[@href='/gp/your-garage/?ref_=nav_AccountFlyout_au_pf_as_GNO']"))).build().perform();
		
		

	}

}
