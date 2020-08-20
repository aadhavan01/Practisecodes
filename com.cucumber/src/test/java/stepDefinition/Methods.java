package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;

public class Methods  {
	
     WebDriver driver;
	
	 String url = "http://book.theautomatedtester.co.uk/";
	 ExtentHtmlReporter reporter;
	 ExtentReports report;
	 ExtentTest logger;
	 String browserpath = "./browserexe/chromedriver.exe";
	 
	
	 
	 	
@Before(order=1)
public void initialize() {
	
	 reporter = new ExtentHtmlReporter("./Reports/Extent.html");
	
	 report = new ExtentReports ();
	
	 report.attachReporter(reporter);
			
	 logger = report.createTest("Browser Starting up");

	
	 System.setProperty("webdriver.chrome.driver",browserpath );
	
	 driver = new ChromeDriver();
	
	 driver.manage().window().maximize();
	 driver.get(url);
	
	 logger.log(Status.INFO, "Browser launched");
	
	 
}

@After
public void tear_down() {
	
	
	
	driver.quit();
	
	logger.log(Status.INFO, "Browser Closed");
}
	
	
	@Given("Open the fb sign in page")
	public void open_the_fb_sign_in_page() {
		
          if(driver.getTitle().contains("book")){
        	  
          logger.log(Status.PASS, "Correct url launched");
          }
          
          else {
        	  logger.log(Status.FAIL, "Incorrect url");
                }
          
          HomePage home = PageFactory.initElements(driver, HomePage.class);
          
          home.firstpage();
		
	}

	

	@When("enter credentials {string} and {string}")
	public void enter_credentials_and(String uname, String pass) throws InterruptedException {
		
		
		
	}

	@Then("validate the login and close browser")
	public void validate_the_login_and_close_the_browser() {
		
		 System.out.println("Then");
		
				
		 report.flush();	
		
		
	}
	
	
	@Given("Open the url")
	public void open_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	
	@When("Click the radio buttons")
	public void click_the_radio_buttons() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("validate and close the browser")
	public void validate_and_close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	

}
