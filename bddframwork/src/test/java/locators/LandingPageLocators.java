package locators;

import org.openqa.selenium.By;

import Utilities.WebDriverActions;

public class LandingPageLocators extends WebDriverActions {
	// home page locator 
	
	private By logInButton = By.xpath("//a[@aria-label='Sign in']");

	
	
	public void clickLoginButton() {
		waitUntilElementToBeClickable(logInButton).click();
	}

	
}
