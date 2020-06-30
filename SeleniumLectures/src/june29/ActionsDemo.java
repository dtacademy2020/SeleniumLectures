package june29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		
		WebElement inputBox = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
		
		a.keyDown(Keys.LEFT_SHIFT).sendKeys(inputBox, "Tissot").
		keyUp(Keys.LEFT_SHIFT).click(searchButton).build().perform();
		
		
		

	}

}
