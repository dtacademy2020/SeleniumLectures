package june27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		// 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//implicit wait is implemented for the whole 
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.get("https://the-internet.herokuapp.com/iframe");
//		
//		driver.switchTo().frame("mce_0_ifr");
//		System.out.println(driver.findElement(By.tagName("p")).getText());
//		
//		
//		driver.switchTo().parentFrame();
//		
//		System.out.println(driver.findElement(By.tagName("h3")).getText());
//		
//		System.out.println("Switching back 2nd time");
//		
//		driver.switchTo().frame(0);
//		
//		System.out.println(driver.findElement(By.tagName("p")).getText());
//		
//		
//		driver.switchTo().defaultContent();
//		
//		System.out.println(driver.findElement(By.tagName("h3")).getText());
//		
//		driver.get("http://jorisvoorn.com/");
//		
//		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
//		
		
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe");
		
		driver.switchTo().frame("frame_Example1");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='iframe Example 1']")));
		
		
		
		driver.findElement(By.id("goButton")).click();
		
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.id("Examples")).getText());
		
		
		
	//	driver.switchTo().alert().accept();
		
		
		
		

	}

}
