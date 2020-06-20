package june19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
        driver.get("https://www.duotech.io/");
        //comp-k05huz6ulabel
        
//       By enrollButton =  By.id("comp-k0433fp8link");
//        
//        WebElement enrollBut = driver.findElement(enrollButton);
//        
//        enrollBut.click();
       
       
        driver.findElement(By.id("comp-k0433fp8lin")).click();
        
//		
		
		

		



		

	}

}
