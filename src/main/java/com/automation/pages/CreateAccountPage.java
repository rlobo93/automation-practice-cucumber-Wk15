package com.automation.pages;


import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());


    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement title;

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement name;

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement getlastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement getpassword;

    @CacheLookup
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement name1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement getLastname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement getaddress;

    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement getcity;

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement getstate;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement getpostcode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement getcountry;

    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement phone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement alisRef;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement reg;

    public void selectTitle() {
        log.info("Select Title : " + title.toString() + "<br>");
        clickOnElement(title);
    }

    public void enterFirstname(String Firstname) {
        log.info("Enter First Name : " + name.toString() + "<br>");
        sendTextToElement(name, Firstname);
    }

    public void enterLastName(String lastname) {
        log.info("Enter Last Name  : " + getlastName.toString() + "<br>");
        sendTextToElement(getlastName, lastname);
    }

    public void enterPassword(String password) {
        log.info("Enter Password : " + getpassword.toString() + "<br>");
        sendTextToElement(getpassword, password);
    }


    public void enterName1(String text) {
        log.info("Enter First Name : " + name1.toString() + "<br>");
        sendTextToElement(name1, text);
    }

    public void enaterLastname1(String text) {
        log.info("" + getLastname.toString() + "<br>");
        sendTextToElement(getLastname, text);
    }

    public void enterAddress(String address) {
        log.info("Enter Address : " + getaddress.toString() + "<br>");
        sendTextToElement(getaddress, address);
    }

    public void enterCity(String City) {
        log.info("Enter City : " + getcity.toString() + "<br>");
        sendTextToElement(getcity, City);
    }

    public void selectState(String State) {
        log.info("Select State  :  " + title.toString() + "<br>");
        selectByVisibleTextFromDropDown(getstate, State);
    }

    public void enterPostCode(String PostCode) {
        log.info("Enter PostCode :  " + getpostcode.toString() + "<br>");
        sendTextToElement(getpostcode, PostCode);
    }

    public void selectCountry(String country) {
        log.info("selectCountry  :  " + title.toString() + "<br>");
        selectByVisibleTextFromDropDown(getcountry, country);
    }

    public void enterPhoneNumber(String PhoneNumber) {
        log.info("Enter Phone Number  :  " + phone.toString() + "<br>");
        sendTextToElement(phone, PhoneNumber);
    }

    public void enterAliasAddress(String text) {
        log.info("Enter Alias Address  :  " + alisRef.toString() + "<br>");
        sendTextToElement(alisRef, text);
    }

    public void clickRegisterBtn() {
        log.info("click Register button  :  " + reg.toString() + "<br>");
        clickOnElement(reg);
    }


}
