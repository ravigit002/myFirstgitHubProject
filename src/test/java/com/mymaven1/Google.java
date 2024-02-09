package com.mymaven1;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
@Test
	public  void googlesearch() {
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     //WebDriverManager.edgedriver().setup();
    // WebDriverManager.firefoxdriver().setup();
    // WebDriverManager.safaridriver().setup();
    // WebDriver driver = new EdgeDriver();
    // WebDriver driver = new FirefoxDriver();
     //WebDriver driver = new SafariDriver();
     driver.get("https://www.google.com/");
     driver.findElement(By.id("APjFqb")).sendKeys("maven repository",Keys.ENTER);
     
	}

}
