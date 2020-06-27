package june26;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NonJSAlerts {

	public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//implicit wait is implemented for the whole 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.delta.com/login/loginPage?staticurl=");
		
		driver.findElement(By.xpath("//a[@class='persistent-login-help icon-help circle-outline']")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='Close']//span")).click();
		
	}

}
