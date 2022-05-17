package com.automation.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.MyAccountPage;
import com.automation.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class CreateAccountSteps {


    @And("^Enter email address \"([^\"]*)\"$")
    public void enterEmailAddress(String email)  {
        new SignInPage().enterEmailAddress(email);
    }

    @And("^Click on Create an account button$")
    public void clickOnCreateAnAccountButton() {
        new SignInPage().clickCreateAccount();
    }

    @And("^I enter First Name \"([^\"]*)\"$")
    public void iEnterFirstName(String Firstname)  {
        new CreateAccountPage().enterFirstname(Firstname);
    }



    @And("^I enter Last Name \"([^\"]*)\"$")
    public void iEnterLastName(String lastname)  {
        new CreateAccountPage().enterLastName(lastname);
    }



    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new CreateAccountPage().enterPassword(password);
    }



    @And("^I enter Address \"([^\"]*)\"$")
    public void iEnterAddress(String address)  {
        new CreateAccountPage().enterAddress(address);
    }


    @And("^I enter City \"([^\"]*)\"$")
    public void iEnterCity(String City)  {
        new CreateAccountPage().enterCity(City);
    }


    @And("^I enter State \"([^\"]*)\"$")
    public void iEnterState(String State)  {
        new CreateAccountPage().selectState(State);
    }

    @And("^I enter PostCode \"([^\"]*)\"$")
    public void iEnterPostCode(String PostCode)  {
        new CreateAccountPage().enterPostCode(PostCode);
    }


    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String PhoneNumber)  {
        new CreateAccountPage().enterPhoneNumber(PhoneNumber);

    }



    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickRegisterBtn();
    }



    @And("^Verify message My Account \"([^\"]*)\"$")
    public void verifyMessageMyAccount(String Message)  {
        new MyAccountPage().verifyMyAccountText();
    }







}

