package june26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
				
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				//implicit wait is implemented for the whole 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.get("https://markets.businessinsider.com/index/market-movers/dow_jones");
				
				List<WebElement> spans = driver.findElements(By.xpath("(//table[@class='table instruments'])[1]//tr//td[5]//span[2]"));
				
				
				
				List<Double> actualValues = new ArrayList<Double>();
				
				for (WebElement webElement : spans) {
					
				actualValues.add(Double.parseDouble(webElement.getText().replace("%", "")));
					
				}
				
				System.out.println(actualValues);
				
				List<Double> expectedValues = new ArrayList<Double>(actualValues);
				
				Collections.sort(expectedValues);
				
				System.out.println(expectedValues);
				
				Collections.reverse(expectedValues);
				
				if(expectedValues.equals(actualValues)) {
					System.out.println("PASS");
				}else
					System.out.println("FAIL");
				
				
				

	}

}
