package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComputerPageTestPage {
    @And("I click on Computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputerTab();
    }


    @When("Verify Computer text")
    public void verifyComputerText() {
        Assert.assertEquals("Computer text not found", "Computers", new ComputerPage().verifyTextComputer());
    }

    @When("I click on Desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopLink();
    }

    @Then("I verify Desktops text")
    public void iVerifyDesktopsText() {
        Assert.assertEquals("Desktop text not found","Desktops",new DesktopsPage().verifyTextDesktop());
    }

    @And("I click on product name {string}")
    public void iClickOnProductName(String productName) {
        new DesktopsPage().selectProductFromList(productName);
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHdd(hdd);
    }

    @And("I select OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("I select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("I verify message added to cart {string}")
    public void iVerifyMessageAddedToCart(String expectedMsg) {
        Assert.assertEquals("Product not added to cart",expectedMsg,new BuildYourOwnComputerPage().verifyProductAddedToCart());
    }
}
