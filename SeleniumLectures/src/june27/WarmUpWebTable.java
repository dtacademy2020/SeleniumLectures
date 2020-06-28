package june27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Utility;

public class WarmUpWebTable {

	public static void main(String[] args) {
		/*
		 *  1. Login and navigate to View All Products page
			2. Verify that Product names are MyMoney, FamilyAlbum, ScreenSaver
			3. Verify that price and discount are correct for each product. Ex: MyMoney -> $100, 8%
																				FamilyAlbum -> $80, 15%
																				ScreenSaver -> $20, 10%
					 */
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//implicit wait is implemented for the whole 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test" + Keys.ENTER);
		
		driver.findElement(By.partialLinkText("products")).click();
		
		
		List<String> expectedProducts = Arrays.asList("MyMoney", "FamilyAlbum", "ScreenSaver");
		
		List<String> actualProducts = new ArrayList<String>();
		
		List<WebElement> productsList = driver.findElements(By.xpath("//table[@class='ProductsTable']//tr//td[1]"));
		
		for (WebElement webElement : productsList) {
			actualProducts.add(webElement.getText());
		}
		
		if(actualProducts.equals(expectedProducts)) {
			System.out.println("PASS");
		}else
			System.out.println("FAIL");
		
		List<String> productInfo = new ArrayList<String>();
		for (int i = 2; i < 5; i++) {
			productInfo.add(driver.findElement(By.xpath("//table[@class='ProductsTable']//tr["+i+"]")).getText());
		}
		
		System.out.println(productInfo);
		
		List<String[]> finalList = new ArrayList<String[]>();
		for (String string : productInfo) {
			finalList.add( string.split(" "));
		}
		
		for (String[] strings : finalList) {
			if(strings[0].equals("MyMoney")){
				Utility.assertEquals("$100", strings[1]);
				Utility.assertEquals("8%", strings[2]);
			}else if(strings[0].equals("FamilyAlbum")){
				Utility.assertEquals("$80", strings[1]);
				Utility.assertEquals("15%", strings[2]);
			}else if(strings[0].equals("ScreenSaver")){
				Utility.assertEquals("$20", strings[1]);
				Utility.assertEquals("10%", strings[2]);
			}
		}
		

	}

}
