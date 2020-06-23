package june20;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByText {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
        //
        
       //1. Go to google.com
		driver.get("https://www.duotech.io/");
		
		String text = driver.findElement(By.xpath("//span[contains(text(), 'WHAT WE DO') ]")).getText();
		
		
	
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		

	}

}
