package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility
{
    //5.BuildYourOwnComputerPage - Build your own computer Text, Processor Drop Down, Ram drop down,
    //  HDD radios, os radio, software check boxes, Add To Card button, "The product has been added to your shopping cart"
    //  message locators and it's actions
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//select[@name='product_attribute_1']")
    WebElement selectProcessor;
    @CacheLookup
    @FindBy(css ="#product_attribute_2")
    WebElement selectRam;
    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_3']")
    WebElement selectHdd;
    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_4']")
    WebElement selectOs;
    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_5']")
    WebElement selectSoftware;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement clickAddToCart;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement actualTextProductAdded;

    public void selectProcessor(String chooseProcessor)
    {
        //Select processor "processor"
        selectByVisibleTextFromDropDown(selectProcessor,chooseProcessor);
        log.info("Select Processor"+ selectProcessor.toString());
    }
    public void selectRam(String chooseRam)
    {
        //Select RAM "ram"
        selectByVisibleTextFromDropDown(selectRam,chooseRam);
        log.info("Select Ram"+ selectRam.toString());
    }
    public void selectHdd(String hdd)
    {
        mouseHoverToElementAndClick(selectHdd);
        log.info("Select Hdd"+ selectHdd.toString());
    }
    public void selectOs(String os)
    {
        mouseHoverToElementAndClick(selectOs);
        log.info("Select Os"+ selectOs.toString());
    }
    public void selectSoftware(String software)
    {
      //  selectSoftware.clear();
       mouseHoverToElementAndClick(selectSoftware);
       log.info("Select software"+ selectSoftware.toString());
    }
    public void clickOnAddToCartButton()
    {
        //Click on "ADD TO CART" Button
        clickOnElement(clickAddToCart);
        log.info("Click On add to cart button"+ clickAddToCart.toString());
    }
    public String verifyProductAddedToCart()
    {
        //Verify message "The product has been added to your shopping cart"
        String result= getTextFromElement(actualTextProductAdded).replace("x"," ");
        log.info("Verify text product added to cart"+ actualTextProductAdded.toString());
        return result;
    }
}
