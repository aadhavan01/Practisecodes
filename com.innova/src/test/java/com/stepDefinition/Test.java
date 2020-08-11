package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
	
	WebDriver driver;
	
	String url = "https://google.in/";
	
	@Given("Open the url")
	public void open_the_url() {
	    
		System.setProperty("webdriver.chrome.driver", ".browsersexe\\chromedriver.exe");
	    driver = new ChromeDriver();
							
			driver.manage().window().maximize();
	}

	@When("Navigate to google")
	public void navigate_to_google() {
		
		driver.get(url);
	    
	}

	@Then("search")
	public void search() {
		driver.findElement(By.name("q")).sendKeys("selenium hq");
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.quit();
	    
	    System.out.println("Closed the browser");
	}


}
