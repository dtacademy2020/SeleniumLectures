package june20;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
        //
        
       //1. Go to google.com
		driver.get("https://www.google.com/");
		
		//a[@class='Fx4vi'][@ping='/url?sa=t&rct=j&source=webhp&url=https://www.google.com/preferences%3Fhl%3Den&ved=0ahUKEwjyj5TexZHqAhV5knIEHWP-DMMQzq0CCBQ']
		
		driver.findElement
		(By.xpath("//a[@class='Fx4vi'][@ping='/url?sa=t&rct=j&source=webhp&url=https://www.google.com/preferences%3Fhl%3Den&ved=0ahUKEwjyj5TexZHqAhV5knIEHWP-DMMQzq0CCBQ']")).click();
		
		
		
		
		
		driver.findElement(By.name("searchfield")).click();
		
		driver.findElement(By.name("searchfield")).sendKeys(Keys.DELETE);
		
		
		driver.findElement(By.name("searchfield")).sendKeys("Fairfax");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
