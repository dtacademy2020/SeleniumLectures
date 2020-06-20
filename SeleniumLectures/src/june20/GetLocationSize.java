package june20;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationSize {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
        //
        
       //1. Go to google.com
		driver.get("https://www.google.com/");
		
		Point location = driver.findElement(By.name("q")).getLocation();
		
		System.out.println(location);
		
		Dimension size = driver.findElement(By.name("q")).getSize();
		
		System.out.println(size);
		
		String tagName = driver.findElement(By.name("q")).getTagName();
		
		System.out.println(tagName);

	}

}
