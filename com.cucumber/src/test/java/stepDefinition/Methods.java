package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Methods {
	
	WebDriver driver;
	 String url = "https://www.facebook.com/";
	 
	 ExtentHtmlReporter reporter;
	 ExtentReports report;
	 ExtentTest logger;
	
	
	@Given("Open the fb sign in page")
	public void open_the_fb_sign_in_page() {
		
         reporter = new ExtentHtmlReporter("./Reports/Extent.html");
		
		 report = new ExtentReports ();
		
		report.attachReporter(reporter);
				
		 logger = report.createTest("launching browser");
		
				
		System.setProperty("webdriver.chrome.driver", "./browserexe/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		logger.log(Status.INFO, "Browser launched");
		
		report.flush();
		
	}

	

	@When("enter credentials {string} and {string}")
	public void enter_credentials_and(String uname, String pass) throws InterruptedException {
		
		logger.log(Status.INFO, "Opening with url");
	    
		driver.get(url);
		
		if(driver.getTitle().contains("book")) {
		
		logger.log(Status.PASS, "opened correct url");
		
		}
		
		else logger.log(Status.FAIL, "incorrect url");
		
		logger.log(Status.INFO, "Entering credentials");
	    
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
		Thread.sleep(3000);
		
		report.flush();
		
	}

	@Then("validate the login and close browser")
	public void validate_the_login_and_close_the_browser() {
		
		logger.log(Status.INFO, "Closing the browser");
		
		driver.quit();
		
		report.flush();
		
	}
	
	

}
