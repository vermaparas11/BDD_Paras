package com.bdd.steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.bdd.utils.WebDriverutils.*;

import java.util.concurrent.TimeUnit;

public class Demo1Steps {
	
	WebDriver cdriver;
	
	@Given("User navigates to the application")
	public void user_navigates_to_the_application() {
	    //Code
		cdriver = getDriver();
		cdriver.get("https://www.facebook.com/");
	}
	@When("user enters Login Username {string} and Password {string}")
	public void user_clicks_on_register(String Usrname,String PWD) {
	    // Write code here that turns the phrase above into concrete actions
	    cdriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(Usrname);
	    cdriver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(PWD);
	    cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    cdriver.findElement(By.xpath("//button[@name ='login' ]")).click();
	    cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	}
	@Then("verify the Home Page is displayed correctly")
	public void verify_the_title_is_displayed_correctly() {
	    // Write code here that turns the phrase above into concrete actions
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");*/
		
		//driver.switchTo().alert().dismiss();
		
	   String title = cdriver.getTitle();
	   Assert.assertEquals(title,"Facebook – log in or sign up");
	}

}
