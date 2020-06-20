package june20;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
        //
        
       //1. Go to google.com
//		driver.get("https://www.hoteltonight.com/");
//		
//		driver.findElement(By.name("searchfield")).clear();
//		
//		
//		
//		driver.findElement(By.name("searchfield")).sendKeys("Washington DC");
		
		driver.get("https://www.dice.com/");
		
		
		driver.findElement(By.id("google-location-search")).sendKeys("Washington DC");
		Thread.sleep(2000);
		driver.findElement(By.id("google-location-search")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("google-location-search")).sendKeys("Tysons Corner");
		
		
		
		
		
		
		
		

	}

}
