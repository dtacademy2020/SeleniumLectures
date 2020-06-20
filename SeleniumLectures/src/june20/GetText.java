package june20;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
        //
        
       //1. Go to google.com
		driver.get("https://www.google.com/");
		
		System.out.println(driver.findElement
				(By.xpath("//a[@href='https://www.google.com/imghp?hl=en&tab=wi&ogbl']")).getText());
		
		System.out.println(driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input")).getAttribute("value"));
		
		

	}

}
