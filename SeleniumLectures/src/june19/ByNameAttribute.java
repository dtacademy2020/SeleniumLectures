package june19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Utility;

public class ByNameAttribute {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
        
        //
        
       //1. Go to google.com
		driver.get("https://www.google.com/");
        
        //2.Enter a search term
		String expected = "Adidas Shoes";
		driver.findElement(By.name("q")).sendKeys(expected + Keys.ENTER);
        //3.Verify that the results page's title contains search term
//		Thread.sleep(2000);
		
		
		String actual = driver.getTitle(); 
		
		Utility.assertContains(expected, actual);
		
		
		driver.quit();
//		
		

		



		

	}

}
