package june26;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//implicit wait is implemented for the whole 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test" + Keys.ENTER);
		
		//Retrieve the contents of the header 
		WebElement headerRow = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[1]"));
		//System.out.println(headerRow.getText());
		
		List<WebElement> headerCells = headerRow.findElements(By.tagName("th"));
		
		for (WebElement cell : headerCells) {
			System.out.print(cell.getText() + " ");
		}
		
		
		//Retrieve the contents of the table (table rows, table data)
		
		// Find the row and columns size
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr"));
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//th"));
		System.out.println(rows.size());
		System.out.println(cols.size());
		
		
		for (int i = 1; i < rows.size(); i++) {
			
			
			for (int j = 0; j < cols.size(); j++) {
				System.out.print(rows.get(i).findElements(By.tagName("td")).get(j).getText() + "\t");
			}
			
			System.out.println();
		}
		
		
		
	}

}
