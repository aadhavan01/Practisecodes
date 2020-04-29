package selenium_concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Events {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_81.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://www.facebook.com");
		
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		act.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("WebDriver")
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("65365763343")
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("gdghsdc")
		.build().perform();
		
		driver.quit();


	}

}
