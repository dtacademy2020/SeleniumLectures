package june26;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyNewOrderInfo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//2. Go to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
		

		//3. Login using username Tester and password test

		

		//4.Click on Order link
		

		//5. Enter a random quantity between 1 and 100
		
		//6. Enter Customer Name:
		

		//7. Enter street: 8607 Westwood Center Dr
		

		//8. Enter City: Vienna
		
		//9. Enter State: Virginia
		

		//10. Enter a random 5 digit number to the zip code field
		
		//11. Select any card type. Every time your code should select a different type.
		

		//13. Enter a valid expiration date 
		

		

		//14. Click on Process
		

		//15. Verify that the page contains text “New order has been successfully added”.
		

		// Verify the card number of new order that was added
		
		driver.findElement(By.linkText("View all orders")).click();
		
		List<String> actualList = new ArrayList<>();
		for (int i = 1; i < 11; i++) {  // i < 11 -> rows.size() is a better approach
			actualList.add (driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr["+ i +"]//td[11]")).getText());
		}
		
		System.out.println(actualList);
		
		
//		if(actualList.contains(visaNumber+"")) {
//			System.out.println("PASS");
//		}else
//			System.out.println("FAIL");

		
	}

}
