package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	

    WebDriver driver;
	
	// this is new commit from Mukesh
	public HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	
	@FindBy(name="username") WebElement uname;
	
	@FindBy(name="password") WebElement pass;
	
	@FindBy(xpath="//*[contains(text(),'Chapter1')]") WebElement Chapter1;
	
	
	public void firstpage() {
		
		Chapter1.click();
	}


	

}
