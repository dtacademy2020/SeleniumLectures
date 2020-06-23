package june22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentAndSibling {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bloomberg.com/markets/stocks");
		
		System.out.println(driver.findElement(By.xpath("//a[@href='quote/INDU:IND']//ancestor::tr")).getText());
		
		driver.get("https://www.bloomberg.com/markets/sectors");
		
		
		
		System.out.println(driver.findElement(By.xpath("//a[@href='markets/sectors/materials']//parent::div//following-sibling::div")).getText());
		
		System.out.println(driver.findElement(By.xpath("//div[@style='background-color:#21bb6f;']//preceding-sibling::div[1]")).getText());

	
	}

}
