package june29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		
//		http://swisnl.github.io/jQuery-contextMenu/demo.html
		driver.get("https://developer.mozilla.org/en-US/docs/Web/API/Element/dblclick_event");
		
		driver.switchTo().frame("frame_Examples");
		
		WebElement elem = driver.findElement(By.xpath("//h3[.='My Card']"));
		
		Actions a = new Actions(driver);
		
		a.doubleClick(elem).build().perform();
		
	}
	
	

}
