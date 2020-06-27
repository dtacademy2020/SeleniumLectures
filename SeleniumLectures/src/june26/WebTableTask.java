package june26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//implicit wait is implemented for the whole 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test" + Keys.ENTER);
		
		
		
		// Retrieve all the names in the orders table
		// Verify the list with the list of expected names
		
		List<String> expectedNames = Arrays.asList("Paul Brown",
											"Mark Smith",
											"Steve Johns",	
											"Charles Dodgeson",
											"Susan McLaren",	
											"Bob Feather",
											"Samuel Clemens",	
											"Clare Jefferson");
		
		List<WebElement> namesColumn = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[2]"));
		
		List<String> actualNames = new ArrayList<String>();
		
		for (WebElement webElement : namesColumn) {
			actualNames.add(webElement.getText());
		}
		
		System.out.println(actualNames);
		System.out.println(expectedNames);
		
		if(expectedNames.equals(actualNames)) {
			System.out.println("PASS");
		}else
			System.out.println("FAIL");
		
		
		
		
		// Using Dynamic xpath to retrieve elements
		
		for (int i = 2; i < 10; i++) {
			
			System.out.println(driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr["+ i +"]//td[2]")).getText());
		}
		
		
		
	}

}
