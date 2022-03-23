package Academy.E2EProject;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateTitle extends base{
	
	public WebDriver driver;
	@BeforeTest
	public void launch() throws IOException {
         driver= initializeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://qaclickacademy.com");
		
	}
	
	
	@Test
	public void Validate() throws IOException {
		
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		LandingPage l = new LandingPage(driver);
		l.cancel();
		Assert.assertTrue(l.NavigationBar().isDisplayed());
	
	}

	@AfterTest
	public void close() {
		driver.close();
	}
	
		
	
		
		
	}
	


