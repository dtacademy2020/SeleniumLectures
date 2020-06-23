package june22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test" + Keys.ENTER);
		
		WebElement findElement = driver.findElement(By.cssSelector("input[name='ctl00$MainContent$orderGrid$ctl02$OrderSelector']"));
		
		findElement.click();
		
		
		
//		if(!findElement.isSelected())
//		driver.findElement(By.cssSelector("input[name='ctl00$MainContent$orderGrid$ctl02$OrderSelector']")).click();

	}

}
