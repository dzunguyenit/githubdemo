package selenium_api;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Topic_00_TestcaseTemplate {
	// khởi tạo driver
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver ();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}

	@Test
	public void TC_01(){
		driver.get("");
		
	
	}

	@Test
	public void TC_02(){
		driver.get("");
		
	
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
