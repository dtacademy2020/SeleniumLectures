package june27;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class ExplicitWaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://duotech.io");
      
        WebElement h3 = driver.findElement(By.xpath("//span[.='Become SQAE']"));
        
        System.out.println(driver.findElement(By.xpath("//span[.='Become SQAE']")).getText());
        
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        
        wait.until(ExpectedConditions.textToBePresentInElement(h3, "Become SQAE"));
        
        System.out.println(driver.findElement(By.xpath("//span[.='Become SQAE']")).getText());
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //Fluent waits
        
        Wait<WebDriver> fluent = new FluentWait<WebDriver>(driver).pollingEvery(Duration.ofSeconds(2))
        															.withTimeout(Duration.ofSeconds(10))
        															.ignoring(NoSuchElementException.class);
        		
        
       
        
        
        
        
	}

}
