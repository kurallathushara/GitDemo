package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	By signIn= By.cssSelector("a[href*='sign_in']");
	By noThanks= By.xpath("//button[normalize-space()='NO THANKS']");
	By popup=By.xpath("//button[normalize-space()='NO THANKS']");
	By text= By.xpath("//section[@id='content']//div[@class='text-center']");
	By bar= By.xpath("//nav[@class='navbar-collapse collapse']");
public LandingPage(WebDriver driver) {
		this.driver= driver;
	}
public WebElement cancel() {
	return driver.findElement(noThanks);
	
}
public List<WebElement> getpopup() {
	return driver.findElements(popup);
	
}
public WebElement getLogin() {
	
	return driver.findElement(signIn);
}
public WebElement Name() {
	return driver.findElement(text);
}
public WebElement NavigationBar() {
	return driver.findElement(bar);
}




}
