package matrixomini.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ominivox_pageobjects {
    public WebDriver ldriver;

    public ominivox_pageobjects(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//input[@id ='Identifiant']")
    WebElement txtCollageId;
    @FindBy(xpath = "//input[@id ='Password' ]")
    WebElement txtPassword;
    @FindBy(xpath = "//button[@type ='submit' ]//span")
    WebElement clickloginbutton;

    @FindBy(xpath = "//a[@class ='raccourci id-service_CVIE   code-groupe_lea' ]")
    WebElement clickonLioButton;
    @FindBy(partialLinkText = "Your current grade")
    WebElement clickOnGrade;
    @FindBy(partialLinkText = "Quit")
    WebElement clickLogout;

    public void setUserId(String CId)
    {
    txtCollageId.sendKeys(CId);
    }
    public void setPassord(String pwd)
    {
        txtPassword.sendKeys(pwd);
    }
    public void loginbutton()
    {
        clickloginbutton.click();
    }
    public void Liobutton()
    {
        clickonLioButton.click();
    }
    public void grades()
    {
        clickOnGrade.click();
    }
    public void Quit()
    {
        clickLogout.click();
    }



}