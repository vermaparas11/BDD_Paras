package com.bdd.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverutils {
	public static WebDriver driver;
	public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		return driver;
	}

}
