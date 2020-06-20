package june17;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bankApp.Account;
import bankApp.Checking;

public class SeleniumBasic {

	public static void main(String[] args) {
		
		
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.duotech.io/");
		
		String expectedURL = "https://www.duotech.io/";
		String actualURL = driver.getCurrentUrl();
		
		
		String expectedTitle = "Duotech Aacademy | QA Automation Engineer | IT school";

		String actualTitle = driver.getTitle();
		
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("PASS: ");
		}else {
			System.err.println("FAIL\n"
					+ "Expected: " + expectedTitle + "\n"+
					  "Actual: "  + actualTitle);
		}
		
		
		driver.close();
		
		
		
		
		

	}

}
