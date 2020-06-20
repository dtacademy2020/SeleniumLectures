package june20;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// <input class="gLFyf gsfi" maxlength="2048" name="q" type="text" jsaction="paste:puy29d" aria-autocomplete="both" aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Search" value="" aria-label="Search" data-ved="0ahUKEwi3lMeUnJHqAhWVgnIEHcY8AkgQ39UDCAY">
		
		
        //
        
       //1. Go to google.com
		driver.get("https://www.google.com/");
		
		WebElement inputBox = driver.findElement(By.name("q"));
		
		System.out.println(inputBox.getAttribute("maxlength"));
        


		
		
		//Retrieve all the links
		List<String> urls = new ArrayList<String>();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement webElement : links) {
			
			urls.add(webElement.getAttribute("href"));
		}
		
		
		//Print out the links
		
		System.out.println(urls);

	}

}
