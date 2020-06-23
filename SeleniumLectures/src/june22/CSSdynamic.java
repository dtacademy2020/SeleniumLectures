package june22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSdynamic {

	public static void main(String[] args) {
		//a[@href='quote/INDU:IND']//ancestor::tr
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.quora.com/");
		
		//input[id^='__w2'][id$='20_email']
		
		driver.findElement(By.cssSelector("input[id^='__w2'][id$='20_email']")).sendKeys("edwgf@gmail.com");
		driver.findElement(By.cssSelector("input[id^='__w2'][id$='20_password']")).sendKeys("shjgajsag767");
		driver.findElement(By.cssSelector("input[id^='__w2'][id$='20_submit_button']")).click();
		
/*
 * 
 * 
XPATH 

1.With Xpath you can search for an element in both directions in HTML documnt(DOM),(you can locate parent by its child)
2. It is more versatile.
3. It can find an element based on its text
4. It is slower compared to CSS

CSS.

1. With CSS you cannot go backwards in DOM
2. It is faster
3. Cannot find element by its text
4. It has cleaner syntax
 */

		
	
	}

}
