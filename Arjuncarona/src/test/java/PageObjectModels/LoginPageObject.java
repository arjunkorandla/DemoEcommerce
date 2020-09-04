package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

    WebDriver driverl;

    LoginPageObject(WebDriver driverr)
    {
        driverl = driverr;
        PageFactory.initElements(driverr, this);

    }

    @FindBy(name = "userName")
    WebElement usertext;

    @FindBy(name = "password")
    WebElement txtpassword;


    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")
    WebElement btnsignin;

    public void setUserName(String uname)
    {
        usertext.sendKeys(uname);
    }

    public void setPassword(String pwd)
    {
        txtpassword.sendKeys(pwd);
    }

    public void clickSubmit()
    {
        btnsignin.click();
    }



}
