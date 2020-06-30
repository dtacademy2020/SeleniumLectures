package june29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://jorisvoorn.com/");
//		
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		
		WebElement button = driver.findElement(By.xpath("//div[@class='ytp-scrubber-button ytp-swatch-background-color']"));
//		
		Actions a = new Actions(driver);
		
		
		
		a.sendKeys(Keys.PAGE_DOWN).clickAndHold(button).moveByOffset(300, 0).release().build().perform();
	}

}
