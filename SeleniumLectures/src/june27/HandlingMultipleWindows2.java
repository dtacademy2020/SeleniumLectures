package june27;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.manage().window().fullscreen();
		
		
		driver.get("https://www.duotech.io/");
		
		driver.findElement(By.id("comp-k043kr8ilabel")).click();
		
		String parentWindowhandle = driver.getWindowHandle();
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for (String handle : allHandles) {
			if(!handle.equals(parentWindowhandle)) {
				driver.switchTo().window(handle);
			}
		}
		
		
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[.=' Schedule an exam']")).click();
		
		String childWindow1 = driver.getWindowHandle();
		
		allHandles = driver.getWindowHandles();
		
		for (String handle : allHandles) {
			if(!handle.equals(parentWindowhandle) && !handle.equals(childWindow1)) {
				driver.switchTo().window(handle);
			}
		}
		
		driver.findElement(By.id("mo-sitePriv-close")).click();
		driver.findElement(By.xpath("//a[@data-testid='AccountControlButtonSignIn']")).click();
		

	}

}
