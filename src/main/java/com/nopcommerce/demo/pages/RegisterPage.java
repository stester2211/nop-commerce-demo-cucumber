package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends Utility
{
    //6.RegisterPage - Register Text, male female radio, Firstname, lastname, Date of Birth drop downs, email,
    //  Password, Confirm Password, Register Button, "First name is required.","Last name is required.",
    //  "Email is required.","Password is required.", "Password is required." error message,
    //  "Your registration completed" message, "CONTINUE" button
    //  Locators and it's actions
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement actualTextRegister;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement clickRegisterButton;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement actualFirstNameText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement actualLastNameText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement actualEmailText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement actualPasswordText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement actualConfirmPasswordText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='gender']")
    List<WebElement> selectGender;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement enterFirstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement enterLastName;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement selectDay;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement selectMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement selectYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement enterEmail;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement enterPassword;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement enterConfirmPassword;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement verifyRegisterCompleteText;

    public String verifyTextRegister()
    {
        //Verify "Register" text
        return getTextFromElement(actualTextRegister);
    }
    public void clickOnRegisterButton()
    {
        //Click on "REGISTER" button
        clickOnElement(clickRegisterButton);
    }
    public String verifyTextFirstName()
    {
        //Verify the error message "First name is required."
        String fname= getTextFromElement(actualFirstNameText);
        log.info("Verify first name text required"+ actualFirstNameText.toString());
        return fname;
    }
    public String verifyTextLastName()
    {
        //Verify the error message "Last name is required."
       String lname= getTextFromElement(actualLastNameText);
       log.info("Verify last name text required"+ actualLastNameText.toString());
       return lname;
    }
    public String verifyTextEmail()
    {
        //Verify the error message "Email is required."
        String email= getTextFromElement(actualEmailText);
        log.info("Verify email text required"+ actualEmailText.toString());
        return email;
    }
    public String verifyTextPassword()
    {
        //Verify the error message "Password is required."
        String password= getTextFromElement(actualPasswordText);
        log.info("Verify password text required"+ actualPasswordText.toString());
        return password;
    }
    public String verifyTextConfirmPassword()
    {
        //Verify the error message "Password is required."
        String cpassword= getTextFromElement(actualConfirmPasswordText);
        log.info("Verify confirm password text required"+ actualConfirmPasswordText.toString());
        return cpassword;
    }
    public void selectGender(String gender)
    {
        //Select gender "Female"
        for (WebElement genderElement : selectGender) {
            if (genderElement.getText().contains(gender)) {
                clickOnElement(genderElement);
                break;
            }
        }
        log.info("select gender"+ selectGender.toString());
    }
    public void enterFirstName(String fName)
    {
        //Enter firstname
        sendTextToElement(enterFirstName,fName);
        log.info("enter firstname"+ enterFirstName.toString());
    }
    public void enterLastName(String lName)
    {
        //Enter lastname
        sendTextToElement(enterLastName,lName);
        log.info("enter lastname"+ enterLastName.toString());
    }
    public void selectDay(String day)
    {
        //Select day
        selectByVisibleTextFromDropDown(selectDay,day);
        log.info("select day"+ selectDay.toString());
    }
    public void selectMonth(String month)
    {
        //Select month
        selectByVisibleTextFromDropDown(selectMonth,month);
        log.info("select month"+ selectMonth.toString());
    }
    public void selectYear(String year)
    {
        //Select year
        selectByVisibleTextFromDropDown(selectYear,year);
        log.info("select year"+ selectYear.toString());
    }
    public void enterEmail(String email)
    {
        //Enter email
        sendTextToElement(enterEmail,email);
        log.info("enter email"+ enterEmail.toString());
    }
    public void enterPassword(String password)
    {
        //Enter password
        sendTextToElement(enterPassword,password);
        log.info("enter password"+ enterPassword.toString());
    }
    public void enterConfirmPassword(String confirmPassword)
    {
        //Enter Confirm Password
        sendTextToElement(enterConfirmPassword,confirmPassword);
        log.info("enter confirm password"+ enterConfirmPassword.toString());
    }
    public String verifyRegisterTextCompleted()
    {
        //Verify "Register" text
        String verifyRegister= getTextFromElement(verifyRegisterCompleteText);
        log.info("Verify register text"+ verifyRegisterCompleteText.toString());
        return verifyRegister;
    }

}
