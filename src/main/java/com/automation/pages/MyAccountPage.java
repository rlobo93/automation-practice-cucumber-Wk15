package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement signout;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myacc;


    public String verifySignOut(){
        String message = getTextFromElement(signout);
        log.info("Verify Sign Out Text  :  " + signout.toString() + "<br>");
        return message;
    }

    public void clickSignOut(){
        log.info("click SignOut button  :  " + signout.toString() + "<br>");
        clickOnElement(signout);
    }


    public String verifyMyAccountText(){
        String message = getTextFromElement(myacc);
        log.info("Verify My Account Text  :  " + myacc.toString() + "<br>");
        return message;
    }




}
