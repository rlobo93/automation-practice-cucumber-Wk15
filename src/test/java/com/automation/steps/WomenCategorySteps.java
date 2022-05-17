package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class WomenCategorySteps {
    @And("^I Click on WOMEN tab$")
    public void iClickOnWOMENTab() {
        new HomePage().clickWomenLink();
    }

    @Then("^I Verify \"([^\"]*)\" text$")
    public void iVerifyText()  {
        new WomenCategoryPage().verifyWomenText();
    }


    @And("^I Click on the product \"([^\"]*)\"$")
    public void iClickOnTheProduct(String product)  {
       new WomenCategoryPage().clickProduct(product);

    }

    @And("^I Change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qty)  {
        new WomenCategoryPage().enterQty(qty);

    }

    @And("^I Select size \"([^\"]*)\"$")
    public void iSelectSize(String size)  {
        new WomenCategoryPage().enterSize(size);

    }

    @And("^I Select colour \"([^\"]*)\"$")
    public void iSelectColour(String colour)  {
        new WomenCategoryPage().selectColour(colour);

    }

    @And("^I Click on Add To Cart Button$")
    public void iClickOnAddToCartButton() {
        new WomenCategoryPage().clickaddTocart();
    }

    @And("^I Verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String arg0)  {
        new WomenCategoryPage().verifySuccessfullyAdded();

    }

    @And("^I Click on X button and close the popup$")
    public void iClickOnXButtonAndCloseThePopup() {
        new WomenCategoryPage().clickXBtn();
    }
}
