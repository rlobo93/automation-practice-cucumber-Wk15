package com.automation.pages;


import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womenLink;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dressLink;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement tShirtLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement singinLink;



    public void clickWomenLink(){
        log.info("click Women Link : " + womenLink.toString() + "<br>");
        clickOnElement(womenLink);
    }

    public void clickDresseslink(){
        log.info("click Dresses Link : " + dressLink.toString() + "<br>");
        clickOnElement(dressLink);
    }

    public void clickTShirtLink(){
        log.info("click TShirt Link : " + tShirtLink.toString() + "<br>");
        clickOnElement(tShirtLink);
    }

    public void clickSignInLink(){
        log.info("click SignIn Link : " + singinLink.toString() + "<br>");
        clickOnElement(singinLink);
    }

            public String verifySignInLink(){
        String message = getTextFromElement(singinLink);
        log.info("Verify SignIn Link : " + singinLink.toString() + "<br>");
        return message;
    }



    // and logo locatores and create appropriate methods for it


}
