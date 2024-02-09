package com.mymaven1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNGDemo {
	@Test
	public void verifyPageTitle() {
	//  Launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	//  Open URL
		driver.get("https://www.google.com/");
		String expectedTitle = "Google";
	     String actualTitle = driver.getTitle();
	     Assert.assertEquals(actualTitle, expectedTitle);
	     driver.quit();
	}  
}
 