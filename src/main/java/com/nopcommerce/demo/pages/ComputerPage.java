package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility
{
    //3.ComputerPage - Comuters text, DesktopsLink, NotebooksLink, SoftwareLink Locators
    //  and create appropriate methods for it.
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement actualTextComputer;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement clickOnDesktopLink;
    public String verifyTextComputer()
    {
        //Verify "Computer" text
        String result= getTextFromElement(actualTextComputer);
        log.info("Verify text computer"+ actualTextComputer.toString());
        return result;
    }
    public void clickOnDesktopLink()
    {
        //Click on Desktops link
        clickOnElement(clickOnDesktopLink);
        log.info("Click on desktop link"+ clickOnDesktopLink.toString());
    }
}
