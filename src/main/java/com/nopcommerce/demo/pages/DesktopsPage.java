package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DesktopsPage extends Utility
{
    //4.DesktopsPage - Desktops text, Sortby, Display, selectProductList Locators and it's actions
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement actualTextDesktop;
    @CacheLookup
    //@FindBy(xpath = "//h2[@class='product-title']")
    @FindBy(xpath = "//div[@class='product-item']")
    List<WebElement> selectProduct;
    public String  verifyTextDesktop()
    {
        //Verify "Desktops" text
        String result= getTextFromElement(actualTextDesktop);
        log.info("Verify text Desktop"+ actualTextDesktop.toString());
        return result;
    }
    public void selectProductFromList(String product)
    {
        //Click on product name "Build your own computer"
        for (WebElement productElement : selectProduct) {
            if (productElement.getText().contains(product)) {
                clickOnElement(productElement);
                break;
            }
        }
        log.info("Select products from list "+ selectProduct.toString());
    }

}
