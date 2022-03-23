package Academy.E2EProject;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class Home extends base{
	
	public WebDriver driver;
	@BeforeTest

	public void launch() throws IOException {
         driver= initializeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@Test(dataProvider= "getData")
	public void HomePageNavi(String Username, String password) throws IOException {
         
		driver.get("http://qaclickacademy.com");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		LandingPage l = new LandingPage(driver);
	        l.cancel().click();
		    l.getLogin().click();
		    LoginPage lp= new LoginPage(driver);
			lp.EmailId().sendKeys(Username);
			lp.Password().sendKeys(password);
			lp.LogIn().click();
			
	}

	
	@AfterTest
	public void close() {
		driver.close();
	}
		
	
	@DataProvider
	public Object[][] getData()
	{
		Object data[][]= new Object[2][2];
		data [0][0]= "hello";
		data [0][1]= "hel";
		data [1][0]= "hedckl";
		data [1][1]= "heejl";
		
		return data;
		
		
		
	}
	

}
