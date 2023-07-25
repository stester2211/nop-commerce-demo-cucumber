package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageTestSteps
{
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @And("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I verify that {string} message display")
    public void iVerifyThatWelcomePleaseSignInMessageDisplay(String message) {
        Assert.assertEquals("Welcome text not found","Welcome, Please Sign In!",new LoginPage().verifyWelcomeMessage());
    }


    @When("I enter EmailId {string}")
    public void iEnterEmailId(String email) {
        new LoginPage().enterEmail(email);
    }

    @And("I enter Password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickLoginButton();
    }

    @Then("I Verify that the Error message is display")
    public void iVerifyThatTheErrorMessageIsDisplay() {
        Assert.assertEquals("Error message not found","Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found",new LoginPage().verifyErrorMessageText());
    }

    @Then("I verify that LogOut link is display")
    public void iVerifyThatLogOutLinkIsDisplay() {
        Assert.assertEquals("Logout link text is not displayed","Log out",new HomePage().verifyLogoutLinkText());
    }

    @Then("I click on LogOut Link")
    public void iClickOnLogOutLink() {
        new HomePage().clickOnLogoutLink();
    }

    @And("I verify that LogIn Link Display")
    public void iVerifyThatLogInLinkDisplay() {
        Assert.assertEquals("Login link not displayed","Log in",new HomePage().verifyLoginLinkText());
    }
}
