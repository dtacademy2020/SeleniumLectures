package june20;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
        //
        
       //1. Go to google.com
		driver.get("https://www.hoteltonight.com/");
		
		
		
		
		
		
		
		driver.findElement(By.name("searchfield")).click();
		
		driver.findElement(By.name("searchfield")).sendKeys(Keys.DELETE);
		
		
		driver.findElement(By.name("searchfield")).sendKeys("Fairfax");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
