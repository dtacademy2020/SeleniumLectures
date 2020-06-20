package june19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetvsNavigate {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		//driver.navigate().to("https://www.google.com/");
		
		
//		driver.get("https://www.duotech.io/");
//		driver.get("https://www.duotech.io/enroll");
//		driver.get("https://www.duotech.io/event");
		
		driver.navigate().to("https://www.duotech.io/");
		driver.navigate().to("https://www.duotech.io/enroll");
		driver.navigate().to("https://www.duotech.io/event");
		
		driver.navigate().back();
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		

		String pageSource = driver.getPageSource();
		
		
		System.out.println(pageSource);



		

	}

}
