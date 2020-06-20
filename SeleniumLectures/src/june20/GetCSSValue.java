package june20;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Utility;

public class GetCSSValue {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// <input class="gLFyf gsfi" maxlength="2048" name="q" type="text" jsaction="paste:puy29d" aria-autocomplete="both" aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Search" value="" aria-label="Search" data-ved="0ahUKEwi3lMeUnJHqAhWVgnIEHcY8AkgQ39UDCAY">
		
		
        //
        
       //1. Go to google.com
		driver.get("https://www.google.com/");
		
		
		//Click on sign in
		
		driver.findElement(By.linkText("Sign in")).click();
		//Click on next
		
		driver.findElement(By.id("identifierNext")).click();
		//Verify the error message color is #632gvsg9
		
		String actual = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getCssValue("color");
		
		
		String expected = "rgba(217, 48, 37, 1)";
		
		Utility.assertEquals(expected, actual);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='o6cuMc']")).getCssValue("font-family"));
		
	}

}
