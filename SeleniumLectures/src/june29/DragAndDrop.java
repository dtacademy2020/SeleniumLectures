package june29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://javascript.info/mouse-drag-and-drop");
//		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/article/mouse-drag-and-drop/ball4/']")));
		
		WebElement source = driver.findElement(By.id("ball"));
		
		WebElement target = driver.findElement(By.id("gate"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(source, target).build().perform();
		
	}

}
