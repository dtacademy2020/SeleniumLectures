package june29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckingElementsState {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.manage().window().fullscreen();
		
//		
//		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//		
//		System.out.println(driver.findElement(By.xpath("//input[@type='text']")).isEnabled());
//		
//		driver.findElement(By.xpath("//button[.='Enable']")).click();
//		
//		while(!driver.findElement(By.xpath("//input[@type='text']")).isEnabled()) {
//			
//		}
		
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Checking if the input box is enabled");
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		
		driver.findElement(By.xpath("//button[.='Start']")).click();
		
	//	WebElement h4 = driver.findElement(By.xpath("//h4[contains(text(),'Hellt')]"));
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Hello')]")));

		System.out.println(driver.findElement(By.xpath("//h4[contains(text(),'Hello')]")).getText());
		
		

	}

}
