package com.nopcommerce.projectObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver ldriver;

    public LoginPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//input[@type='email']")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(xpath = "//input[@type='password']")
    @CacheLookup
    WebElement pwdtxt;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement buttonclick;

    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement logoutbttn;

    public void setUserName(String uname)
    {
        txtEmail.sendKeys(uname);
    }
    public void setPassword(String pwd)
    {
        pwdtxt.sendKeys(pwd);
    }
    public void loginbutton()

    {
        buttonclick.click();
    }
    public void logoutbutton()
    {
        logoutbttn.click();
    }


}
