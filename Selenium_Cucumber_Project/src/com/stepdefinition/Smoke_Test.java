package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Smoke_Test {
	
	WebDriver driver;
	
	@Given("^Open Firefox and start application$")
	public void Open_Firefox_and_start_application() throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\Selenium\\Browser_Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	   
	}

	@When("^I enter valid username and password$")
	public void I_enter_valid_username_and_password() throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys("aadhavan");
		
		driver.findElement(By.id("pass")).sendKeys("aadhavan");
		
		Actions act = new Actions(driver);
		
		Select slt = new Select(driver.findElement(By.id("pass")));
	    
		WebElement ele =driver.findElement(By.id(""));
		
		List <WebElement> li = driver.findElements(By.tagName("td"));
		
		driver.switchTo().frame(0);
	}

	@Then("^user should be able to login sucessully$")
	public void user_should_be_able_to_login_sucessully() throws Throwable {
		
		driver.findElement(By.id("u_0_2")).click();
	    
	}

}
