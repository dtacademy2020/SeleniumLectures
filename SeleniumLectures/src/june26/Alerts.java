package june26;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Utility;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//implicit wait is implemented for the whole 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(), 'Alert')]")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		
		alert.dismiss();
		
		Utility.assertEquals("You successfuly clicked an alert", driver.findElement(By.id("result")).getText());
		
		driver.findElement(By.xpath("//button[contains(text(), 'Confirm')]")).click();
		
		
		Utility.assertEquals("I am a JS Confirm", alert.getText());
		
		alert.dismiss();
		
		
		Utility.assertEquals("You clicked: Cancel", driver.findElement(By.id("result")).getText());
		
		
		driver.findElement(By.xpath("//button[contains(text(), 'Prompt')]")).click();
		
		String message = "ALERT, GO AWAY!!!";
		alert.sendKeys(message);
		alert.accept();
		
		Utility.assertEquals("You entered: " + message, driver.findElement(By.id("result")).getText());
		
		
		

	}

}
