package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	By Email= By.id("user_email");
	By pass= By.id("user_password");
	By submit= By.cssSelector("input[value='Log In']");
	
public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
public WebElement EmailId() {
	return driver.findElement(Email);
	
}
public WebElement Password() {
	
	return driver.findElement(pass);
}
public WebElement LogIn() {
	
	return driver.findElement(submit);
}
}
