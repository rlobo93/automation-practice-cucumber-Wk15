package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.MyAccountPage;
import com.automation.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignSteps {
    @Given("^I am on the Homepage$")
    public void iAmOnTheHomepage() {
    }

    @When("^I click on sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickSignInLink();
    }

    @Then("^I verify text <\"([^\"]*)\">$")
    public void iVerifyText(String AUTHENTICATION)  {
        Assert.assertEquals("AUTHENTICATION Text Not Displayed",AUTHENTICATION,new SignInPage().verifyAutenticationText());
    }


    @And("^I Enter username \"([^\"]*)\"$")
    public void iEnterUsername(String email)  {
        new SignInPage().enterEmail(email);

    }

    @And("^I Enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new SignInPage().enterPassword(password);

    }

    @And("^I Click on Sign in Button$")
    public void iClickOnSignInButton() {
        new SignInPage().clickSignIn();
    }

    @Then("^I Verify the Error message \"([^\"]*)\"$")
    public void iVerifyTheErrorMessage(String Message)  {
        Assert.assertEquals("Error Text Not Displayed", Message, new SignInPage().errorMessage(Message));
    }



    @And("^I Click on Sign Button$")
    public void iClickOnSignButton() {
        new SignInPage().clickSignIn();
    }

    @And("^I Verify that Sign out link is displayed$")
    public void iVerifyThatSignOutLinkIsDisplayed() {
        new MyAccountPage().verifySignOut();
    }


    @And("^I Enter EmailId <\"([^\"]*)\">$")
    public void iEnterEmailId(String email)   {
        new SignInPage().enterEmail(email);
    }

    @And("^I enter password in passwordfield <\"([^\"]*)\">$")
    public void iEnterPasswordInPasswordfield(String r123456)  {
        new SignInPage().enterPassword(r123456);
    }


    @And("^I Click on Sign out Link$")
    public void iClickOnSignOutLink() {
        new MyAccountPage().clickSignOut();
    }

    @And("^I Verify that Sign In Link displayed$")
    public void iVerifyThatSignInLinkDisplayed() {
        new SignInPage().verifyCreateAccountText();

    }




}
