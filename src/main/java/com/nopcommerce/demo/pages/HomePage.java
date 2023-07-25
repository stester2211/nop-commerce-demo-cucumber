package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility
{
    //2.HomePage - All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, My account link and LogOut link locatores
    //  and create appropriate methods for it.

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement actualLogoutLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement clickLogoutBtn;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement actualTextLoginLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement clickRegisterLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement clickOnComputerTab;
    public void clickOnLoginLink()
    {
        //Click on login link
        clickOnElement(loginLink);
        log.info("Click on login link"+ loginLink.toString());
    }
    public String verifyLogoutLinkText()
    {
        //Verify that LogOut link is display
        String result= getTextFromElement(actualLogoutLink);
        log.info("Verify text Logout"+ actualLogoutLink.toString());
        return result;
    }
    public void clickOnLogoutLink()
    {
        //Click on LogOut Link
        clickOnElement(clickLogoutBtn);
        log.info("Click on logout link"+ clickLogoutBtn.toString());
    }
    public String verifyLoginLinkText()
    {
        //Verify that LogIn Link Display
        String result= getTextFromElement(actualTextLoginLink);
        log.info("Verify text Login link"+ actualTextLoginLink.toString());
        return result;
    }
    public void clickOnRegisterLink()
    {
        //Click on Register Link
        clickOnElement(clickRegisterLink);
        log.info("Click on register link"+ clickRegisterLink.toString());
    }
    public void clickOnComputerTab()
    {
        //Click on Computer tab
        clickOnElement(clickOnComputerTab);
        log.info("Click on computer tab"+ clickOnComputerTab.toString());
    }
}
