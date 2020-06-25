package june24;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

import utility.Utility;

public class WarmUpAutomationTask {

	public static void main(String[] args) {
		/*
		 * Warm up:


				1. Go to http://automationpractice.com/index.php
				
				2. Click on Sign In
				
				3. Click on "Create account" by entering a new email
				
				4. Fill out the form using Selenium methods, and Select class for dropdowns
				
				5. Click on Register
				
				6. Verify the page title contains "My Account"
				
				7. Verify that page contains "Welcome to your account. Here you can manage all of your personal information and orders."
				
				8. Verify that customer name is the same as the entered name.
				
				9.Click on Sign Out and verify that you are successfully signed out by verifying the page title.
		 */
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//implicit wait is implemented for the whole 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		
		driver.findElement(By.linkText("Sign in")).click();
		
//		
		
		
		driver.findElement(By.id("email_create")).sendKeys( randomName(5)+ "@buzzfeed.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Anabella");
		driver.findElement(By.id("customer_lastname")).sendKeys("Ros");
		driver.findElement(By.id("passwd")).sendKeys("dt123");
		
		Select s = new Select(driver.findElement(By.id("days")));
		
		s.selectByValue("10");
		
		
		new Select(driver.findElement(By.id("months"))).selectByVisibleText("June ");
		new Select(driver.findElement(By.id("years"))).selectByVisibleText("1982  ");

		if(!driver.findElement(By.id("newsletter")).isSelected())
				driver.findElement(By.id("newsletter")).click();
		
		if(!driver.findElement(By.id("optin")).isSelected())

				driver.findElement(By.id("optin")).click();
		
		
		driver.findElement(By.id("company")).sendKeys("Duotech");
		
		driver.findElement(By.id("address1")).sendKeys("8609 Westwood Center Drive");
		
		driver.findElement(By.id("city")).sendKeys("Vienna");
		
		new Select(driver.findElement(By.id("id_state"))).selectByIndex(49);
		
		driver.findElement(By.id("postcode")).sendKeys("22150");
		
		
		driver.findElement(By.id("other")).sendKeys("Some additionnal info");

		driver.findElement(By.id("phone_mobile")).sendKeys("2021234567");
		
		driver.findElement(By.id("submitAccount")).click();
		
		
		Utility.assertContains("My account", driver.getTitle());
		
		String expectedGreeting = "Welcome to your account. Here you can manage all of your personal information and orders.";
		System.out.println(driver.getPageSource().contains(expectedGreeting));
		
		String expectedNAme = "Anabella Ros";
		
		String actualName = driver.findElement(By.cssSelector("a[title='View my customer account'] > span")).getText();

		Utility.assertEquals(expectedNAme, actualName);


		
 


		
		

		

		

		
		
//		
		
		
		

	}
	
	
	public static String randomName(int a) {
		//Will generate "a" number of lower case letters plus 1 random UPPERCASE
		Random random = new Random();
        char rand1stLetter = (char)(65 + random.nextInt(27));
        String genString="";
			for (int i=0; i<a; i++) {
				char randLetter = (char)(97 + random.nextInt(26));
				genString += randLetter;}
		return rand1stLetter+genString;
	}

}
