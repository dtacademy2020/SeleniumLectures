package june19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Utility;

public class Byname {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
        
        //
        
       //1. Go to duotech.io
		driver.get("https://www.duotech.io/");
        
        //2.Click on Learn more
		
		driver.findElement(By.id("comp-k05huz6ulabel")).click();
        //3.Verify that yoa are on Programs page
		Thread.sleep(2000);
		String expected = "Programs | Duotech" ;
		String actual = driver.getTitle(); 
		
		Utility.assertEquals(expected, actual);
		
		
		driver.quit();
		
		

		



		

	}

}
