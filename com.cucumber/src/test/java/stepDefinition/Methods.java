package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Methods {
	
	WebDriver driver;
	 String url = "https://www.facebook.com/";
	
	
	@Given("Open the fb sign in page")
	public void open_the_fb_sign_in_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_jars\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}

	

	@When("enter credentials {string} and {string}")
	public void enter_credentials_and(String uname, String pass) throws InterruptedException {
	    
		driver.get(url);
	    
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
		Thread.sleep(3000);
	}

	@Then("validate the login and close browser")
	public void validate_the_login_and_close_the_browser() {
		
		driver.quit();
	    
	}
	
	

}
