package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
	
	
	String url = "https://google.in/";
	
	WebDriver driver ;
	
	@Given("Open the url")
	public void open_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	    
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Selenium_jars\\chromedriver.exe");
    driver = new ChromeDriver();
						
		driver.manage().window().maximize();
		
		
		
		
	}

	@When("Navigate to google")
	public void navigate_to_google() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
	}

	@Then("search")
	public void search() {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.findElement(By.name("q")).sendKeys("selenium hq");
	}

	@Then("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.quit();
	}


}
