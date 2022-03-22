package StepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class Login extends base {

    @Given("^Navigate to website \"([^\"]*)\"$")
    public void navigate_to_website_something(String strArg1) throws Throwable {
    	driver= initializeDriver();
    	  
    			driver.get("http://qaclickacademy.com");
    			driver.manage().window().fullscreen();
    			driver.manage().deleteAllCookies();
    			LandingPage l = new LandingPage(driver);
    			if (l.getpopup().size()>0) {
    	        l.cancel().click();
    			}
    }
    @And("^Click on login button$")
    public void click_on_login_button() throws Throwable {
    	LandingPage l = new LandingPage(driver);
    	l.getLogin().click();
    }

    @When("^User gives \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_gives_something_and_something(String strArg1, String strArg2) throws Throwable {
    	LoginPage lp= new LoginPage(driver);
		lp.EmailId().sendKeys(strArg1);
		lp.Password().sendKeys(strArg2);
		lp.LogIn().click();
    }

    @Then("^Home page opens$")
    public void home_page_opens() throws Throwable {
      System.out.println("home page is opened");
    }




}
