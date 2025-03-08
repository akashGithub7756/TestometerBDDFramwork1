package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import locators.ParaBankLocator;


public class ParaBankLocatorStepDefination {
	
	ParaBankLocator paraBank= new ParaBankLocator();

	@Given("^I click on message box$")
	public void Clickmessagebox() {
		paraBank.Clickmessegebox();
	}
	@And("^I enter customer name$")
	public void CustomerName() {
		paraBank.entername();
	}
	
	
	@And("^I enter customer Emailid$")
	public void mailid() {
		paraBank.entermail();
	}
	
	
	@And("^I enter customer Phone no$")
	public void phoneno() {
		paraBank.enterphoneno();
	}
	
	
	@And("^I Write message to customercare$")
	public void message() {
		paraBank.entermessage();
	}
	
	
	@And("^I click on sent to customercare button$")
	public void clickSendButton() {
		paraBank.clicksendmassagebutton();
	}
	
	@Then("^I should be send massege succesfully$")
	public void i_should_be_send_message_successfully() {

		System.out.println("Login Successful");
	}
	

}
