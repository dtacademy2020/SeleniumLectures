package june22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredicateDemo {

	public static void main(String[] args) {
		//a[@href='quote/INDU:IND']//ancestor::tr
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test" + Keys.ENTER);
		

		
		System.out.println(driver.findElement(By.xpath("//tbody//tr[3]")).getText());
		
		//using the whole xpath expression -> (//a[@class='product_img_link'])[2]
	}

}
