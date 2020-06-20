package june19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Utility;

public class ByClassName {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
        
        //
        
       //1. Go to google.com
		driver.get("https://www.google.com/");
        
        //2.Click on Google apps link
		
		driver.findElement(By.className("gb_xc")).click();
       
//		
		

		



		

	}

}
