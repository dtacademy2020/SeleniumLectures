package june20;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEndKeys {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
        //
        
       //1. Go to google.com
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys(Keys.chord(Keys.LEFT_SHIFT, "sos") + Keys.ENTER);
		
		
		
		
		

	}

}
