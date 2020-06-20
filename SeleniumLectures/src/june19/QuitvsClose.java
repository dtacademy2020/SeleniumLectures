package june19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitvsClose {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
        driver.get("https://www.duotech.io/");
        
       
        driver.findElement(By.id("comp-k043kr8ilabel")).click();
        
        Thread.sleep(2000);
        
     //  driver.close(); // Closes the current window, quitting the browser if it's the last window currently open.
        
        
        driver.quit();  //Quits this driver, closing every associated window.
        
        
        
//		
		
		

		



		

	}

}
