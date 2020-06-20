package june19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Utility;

public class ByLink {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
        
        //
        
       //1. Go to google.com
		driver.get("https://www.google.com/");
        
        //2.Click on About link
		
		driver.findElement(By.linkText("About")).click();
		
		//3.Verify page title
		
		String expected = "Google - About Google, Our Culture & Company News";
		
		String actual = driver.getTitle();
		
		
		Utility.assertEquals(expected, actual);
		
		
		//4. Navigate back to main page and click on "How search works" link
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Search")).click();
		
		
		//5. Verify page title
		
		expected = "Google Search - Discover How Google Search Works";
		
		 actual = driver.getTitle();
		
		
		Utility.assertEquals(expected, actual);
       
//		
		

		



		

	}

}
