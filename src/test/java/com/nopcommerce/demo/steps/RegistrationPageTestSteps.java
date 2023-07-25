package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegistrationPageTestSteps
{
    @And("I click on Register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("Verify {string} text")
    public void verifyText(String message) {
        Assert.assertEquals("Register page not displayed","Register", new RegisterPage().verifyTextRegister());
    }

    @When("I click on REGISTER button")
    public void iClickOnREGISTERButton() {
        new RegisterPage().clickOnRegisterButton();
    }


    @And("I verify the error message First name is required.")
    public void iVerifyTheErrorMessageFirstNameIsRequired() {
        Assert.assertEquals("First name text not found","First name is required.",new RegisterPage().verifyTextFirstName());
    }

    @And("I verify the error message Last name is required.")
    public void iVerifyTheErrorMessageLastNameIsRequired() {
        Assert.assertEquals("Last name required message not found","Last name is required.",new RegisterPage().verifyTextLastName());
    }

    @And("I verify the error message Email is required.")
    public void iVerifyTheErrorMessageEmailIsRequired() {
        Assert.assertEquals("Email required message not display","Email is required.",new RegisterPage().verifyTextEmail());
    }

    @And("I verify the error message Password is required.")
    public void iVerifyTheErrorMessagePasswordIsRequired() {
        Assert.assertEquals("Password required message not found","Password is required.",new RegisterPage().verifyTextPassword());
    }

    @Then("I verify the error message Confirm Password is required.")
    public void iVerifyTheErrorMessageConfirmPasswordIsRequired() {
        Assert.assertEquals("Confirm Password required message not found","Password is required.",new RegisterPage().verifyTextConfirmPassword());
    }

    @When("I select gender {string}")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGender(gender);
    }

    @And("I enter firstname {string}")
    public void iEnterFirstname(String fname) {
        new RegisterPage().enterFirstName(fname);
    }

    @And("I enter lastname {string}")
    public void iEnterLastname(String lname) {
        new RegisterPage().enterLastName(lname);
    }

    @And("I select day {string}")
    public void iSelectDay(String day) {
        new RegisterPage().selectDay(day);
    }

    @And("I select month {string}")
    public void iSelectMonth(String month) {
        new RegisterPage().selectMonth(month);
    }

    @And("I select year {string}")
    public void iSelectYear(String year) {
        new RegisterPage().selectYear(year);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }


    @Then("I verify message {string}")
    public void iVerifyMessage(String expectedMsg) {
        Assert.assertEquals("Your registration is not completed",expectedMsg,new RegisterPage().verifyRegisterTextCompleted());
    }


}
