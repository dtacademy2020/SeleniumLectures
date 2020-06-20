package june20;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
		
		
		
		
		
		driver.get("https://google.com");
		
//		driver.findElement(By.name("q")).sendKeys("Adidas Shoes");
//		driver.findElement(By.className("gNO89b")).submit();
		
		
		driver.findElement(By.linkText("Sign in")).submit();
		
		
		

	}

}
