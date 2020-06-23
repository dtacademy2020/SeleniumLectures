package june20;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Utility;

public class Submit {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
		
		
		
		
		
		driver.get("https://duotech.io");
		
		String actual = driver.findElement(By.xpath("//div[@id='comp-k05i54p9']//span[@style='font-weight:bold;']")).getText();
		
		String expected = "WHY QA?";
		
		Utility.assertEquals(expected, actual);
		
		

	}

}
