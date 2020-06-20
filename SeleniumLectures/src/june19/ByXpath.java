package june19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Utility;

public class ByXpath {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
		
		
        
        //
        
       //1. Go to google.com
		driver.get("https://www.google.com/");
        
        //2.Locate the element with text "Today we celebrate Juneteenth"
		
		WebElement span = driver.findElement(By.xpath("//div[@id='prm']//div//span"));
		
		//3. Verify the content is equal to "Today we celebrate Juneteenth"
		
		String expected = "Today we celebrate Juneteenth.";
		
		String actual = span.getText();
		
		Utility.assertEquals(expected, actual);
       
//		
		

		



		

	}

}
