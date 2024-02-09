package com.mymaven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication_Pop_Up {

	public static void main(String[] args) {
    
		//WebDriverManager.edgedriver().setup();
	    // WebDriverManager.firefoxdriver().setup();
	    // WebDriverManager.safaridriver().setup();
	    // WebDriver driver = new EdgeDriver();
	    // WebDriver driver = new FirefoxDriver();
	     //WebDriver driver = new SafariDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
		
	} 

}
