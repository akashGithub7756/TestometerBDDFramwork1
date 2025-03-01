package locators;

import org.junit.Assert;
import org.openqa.selenium.By;

import Utilities.WebDriverActions;


public class LoginPageLocators extends WebDriverActions{
	
	private By userName = By.name("username");
	
	private By passWord = By.name("password");
	
	private By loginButton =By.xpath("//button[@type='submit']");
	
	private By loginuserName = By.xpath("//div[text()='Your account']");
     
	
	public void enterUsername(String username) {
		waitUntilVisibilityOfElementLocated(userName).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		waitUntilVisibilityOfElementLocated(passWord).sendKeys(password);
	}
	
	public void clickLoginButton() {
		waitUntilElementToBeClickable(loginButton).click();
	}
	public void verifyUserIsLoggedIn(String userName) {
		String loggedInUserName = waitUntilVisibilityOfElementLocated(loginuserName).getText();
		Assert.assertEquals(loggedInUserName, userName);
}
}