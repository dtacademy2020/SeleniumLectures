package june22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utility.Utility;

public class DropdownDemo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.carmax.com/");
		
		WebElement selectElemnet = driver.findElement(By.cssSelector("#credit-rating-select"));
		
		Select sel = new Select(selectElemnet);
		
		//sel.selectByVisibleText("Challenged (< 580 FICO® Score)");
		//sel.selectByValue("20");
		//sel.selectByIndex(4); // indexes are zero-based for this method
		
		//System.out.println(sel.getFirstSelectedOption().getText());
		List<WebElement> options = sel.getOptions();
		List<String> actual = new ArrayList<String>();
		
		
		
		List<String> expected = Arrays.asList("Excellent (800+ FICO® Score)",
												"Very Good (740-799 FICO® Score)",
												"Good (670-739 FICO® Score)",
												"Fair (580-669 FICO® Score)",
												"Challenged (< 580 FICO® Score)")
												;


		for (WebElement webElement : options) {
			
			actual.add(webElement.getText());
			
		}
		
		System.out.println(expected.equals(actual));
		
		
//		Thread.sleep(2000);
//		
//		
//		
//		double expected = 13225;
//		String actualValue = driver.findElement(By.cssSelector(".budget-search-price")).getText().replace("$", "").replace(",", "");
//		double actual  = Double.parseDouble(actualValue);
		
	//	Utility.assertEquals(expected+"", actual+"");

	}

}
