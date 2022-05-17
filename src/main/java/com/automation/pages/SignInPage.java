package com.automation.pages;


import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    //Email address,
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement eamiladdress;

    // Password,
    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordfield;

    // Sign In Button,
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signin;

    // error message
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger']//ol")
    WebElement error;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailcreat;

    // Create an account button and
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createAccount;

    //"AUTHENTICATION" text,
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement autentication;




    public void enterEmail(String email) {
        log.info("Enter Email :  " + eamiladdress.toString() + "<br>");
        sendTextToElement(eamiladdress, email);
    }

    public void enterPassword(String password) {
        log.info("Enter Password :  " + passwordfield.toString() + "<br>");
        sendTextToElement(passwordfield, password);
    }

    public void clickSignIn() {
        log.info("click SignIn :  " + signin.toString() + "<br>");
        clickOnElement(signin);
    }

    public String errorMessage(String Message) {
        String message = getTextFromElement(error);
        log.info("Verify Error Message  :  " + error.toString() + "<br>");
        return message;
    }

    public void enterEmailAddress (String email) {
        log.info("Enter Email Address  :  " + emailcreat.toString() + "<br>");
        sendTextToElement(emailcreat, email);
    }

    public void clickCreateAccount() {
        log.info("Click Create Account  :  " + createAccount.toString() + "<br>");
             clickOnElement(createAccount);
    }

    public String verifyAutenticationText() {
        String message =getTextFromElement(autentication);
        log.info("Verify AUTHENTICATION text :  " + autentication.toString() + "<br>");
        return message;
    }

    // "CREATE AN ACCOUNT" text
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement getCreateAccount;

    public String verifyCreateAccountText() {
        String message = getTextFromElement(getCreateAccount);
        log.info("verify Create Account Text :  " + getCreateAccount.toString() + "<br>");
        return message;
    }



}
