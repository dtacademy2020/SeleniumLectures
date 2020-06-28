package june27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//implicit waits are global
		//implicit waits should not be 
        driver.get("http://automationpractice.com/index.php");
        
        driver.findElement(By.linkText("Sign in")).click();
        
        driver.findElement(By.id("email_creat")).sendKeys("sbagnxsvcasxb");

	}

}
