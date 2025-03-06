package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import locators.BankLoginPageLocaters;

public class BankLoginStepDefination {
	BankLoginPageLocaters bankLogin = new BankLoginPageLocaters();

	@Given("^I enter the parabank username$")
	public void enterusername() {
		bankLogin.EnterUsername();

	}
	@And("^I enter the parabank password$")
	public void enterpassword() {
		bankLogin.EnterPassWord();

	}
	@And("^I click the login button$")
	public void ClickLoginButton() {
		bankLogin.clickLoginButton();

	}
	@Then("^I should be logged in successfully$")
	public void i_should_be_logged_in_successfully() {

		System.out.println("Login Successful");
	}

}
