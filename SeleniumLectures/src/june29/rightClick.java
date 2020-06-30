package june29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {
	
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		
//		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[.='right click me']"));
		
		Actions a = new Actions(driver);
		
		a.contextClick(rightClickButton).sendKeys(Keys.DOWN, Keys.DOWN,Keys.DOWN, Keys.ENTER).build().perform();
		
	}
	
	

}
