package june27;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.manage().window().fullscreen();
		
		
		driver.get("https://www.duotech.io/");
		
		driver.findElement(By.id("comp-k043kr8ilabel")).click();
		
		String expectedTitle = "AWS Certified Solutions Architect – Associate Certification";
		String current =  driver.getWindowHandle();
		
		
		for(String handle: driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			if(driver.getTitle().equals(expectedTitle)) {
				break;
			}else
				driver.switchTo().window(current);
			
		}
		
		


		
		driver.findElement(By.xpath("//span[.=' Schedule an exam']")).click();
//		
//		
//		
//		driver.findElement(By.id("mo-sitePriv-close")).click();
//		driver.findElement(By.xpath("//a[@data-testid='AccountControlButtonSignIn']")).click();
		

	}

}
