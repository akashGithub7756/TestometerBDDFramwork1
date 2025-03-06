package locators;

import org.openqa.selenium.By;

import Utilities.WebDriverActions;

public class BankLoginPageLocaters extends WebDriverActions {


	private By UserName = By.xpath("//input[@name='username']");
	private By Password = By.xpath("//input[@name='password']");
	private By loginButton =By.xpath("//input[@class='button']");

	public void EnterUsername() {
	    waitUntilVisibilityOfElementLocated(UserName).sendKeys("akash7756#");
	}

	public void EnterPassWord() {
	    waitUntilVisibilityOfElementLocated(Password).sendKeys("akash7756@");
	}



	public void clickLoginButton() {
		waitUntilElementToBeClickable(loginButton).click();
	}
}
