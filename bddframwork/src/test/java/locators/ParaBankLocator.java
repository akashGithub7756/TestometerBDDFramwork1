package locators;

import org.openqa.selenium.By;

import Utilities.WebDriverActions;

public class ParaBankLocator extends WebDriverActions {




	private By MessegeBox = By.xpath("//li[contains(@class, 'contact')]");
	private By EnterName =By.xpath("//input[@name='name']");
	private By EnterMail =By.xpath("//input[@name='email']");
	private By EnterPhonNo =By.xpath("//input[@id='phone']");
	private By EnterMessage =By.xpath("//textarea[@name='message']");
	private By ClickSendMassageButton =By.xpath("//input[@type='submit']");
	
	public void Clickmessegebox() {
		waitUntilVisibilityOfElementLocated(MessegeBox).click();
	
	}

	public void entername() {
		waitUntilVisibilityOfElementLocated(EnterName).sendKeys("Akash Shinde");
	}

	public void entermail() {
		waitUntilVisibilityOfElementLocated(EnterMail).sendKeys("akashshinde99994@gmail.com");
	}

	public void enterphoneno() {
		waitUntilVisibilityOfElementLocated(EnterPhonNo).sendKeys("7756998819");
	}


	public void entermessage() {
		waitUntilVisibilityOfElementLocated(EnterMessage).sendKeys("HELP ME PARABANK");
	}


	public void clicksendmassagebutton() {
		waitUntilVisibilityOfElementLocated(ClickSendMassageButton).click();
	}


}
