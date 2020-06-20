package june19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Utility;

public class ByTag {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
        
        //
        
       //1. Go to google.com
		driver.get("https://www.google.com/");
        
        //2.Get all the links
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		
		 
		 
		
	///3. Verify the number of links
		
		int expected = 20 ;
		
		int actual = links.size();
		
		
		Utility.assertEquals(expected+"", String.valueOf(actual));
		
		
		
       
//		
		

		



		

	}

}
