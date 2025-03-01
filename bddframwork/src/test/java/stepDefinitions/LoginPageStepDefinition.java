package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import locators.LandingPageLocators;
import locators.LoginPageLocators;

public class LoginPageStepDefinition {
	LoginPageLocators  resister = new LoginPageLocators();
LandingPageLocators landingpage= new LandingPageLocators();


@Given("^i click Login$")
public void ClickMyAccount() {
	landingpage.clickLoginButton();
}
@And("^I enter username as (.*)$")
public void enteruserName(String username) {
	resister.enterUsername(username);
	resister.clickLoginButton();
}
@And("^I enter password as (.*)$")
public void enterPassword(String password) {
	resister.enterPassword(password);
	resister.clickLoginButton();
}
@And("^I click on login button$")
public void clickLoginButon() {
	resister.clickLoginButton();
}
@Then("^I see (.*) is displayed$")
public void verifyDashboardPage(String username) {
	resister.verifyUserIsLoggedIn(username);
}


}