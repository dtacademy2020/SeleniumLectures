package june22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {

	public static void main(String[] args) {
		//a[@href='quote/INDU:IND']//ancestor::tr
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
//		driver.findElement(By.cssSelector(".product-image-container"));
//		//driver.findElement(By.className("product-image-container"));
//		
//		driver.findElement(By.cssSelector("#layer_cart"));
		//driver.findElement(By.id("layer_cart"));
		
		//XPATH - //a[@title='View my shopping cart']
		//CSS - a[title='View my shopping cart'] -> driver.findElement(By.cssSelector("a[title='View my shopping cart']"));
		
		
		driver.findElement(By.cssSelector("div.cart-prices-line.first-line"));
		
		driver.findElement(By.id("block_top_menu"));
		driver.findElement(By.cssSelector("div#block_top_menu"));
		driver.findElement(By.cssSelector("div[id='block_top_menu'"));
		//input[id^='__w2'][id$='20_email']
		
		
	
	}

}
