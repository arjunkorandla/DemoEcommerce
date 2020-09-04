package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationLogPage {
    WebDriver driverl;

    RegistrationLogPage(WebDriver driverr) {
        driverl = driverr;
        PageFactory.initElements(driverr, this);
    }

    @FindBy(linkText = "REGISTER")
    @CacheLookup
    WebElement Register;
    @FindBy(name = "firstName")
    @CacheLookup
    WebElement Firstname;
    @FindBy(name = "lastName")
    @CacheLookup
    WebElement Lastname;

    @FindBy(name = "phone")
    @CacheLookup
    WebElement Phone;

    @FindBy(name = "userName")
    @CacheLookup
    WebElement Email;

    @FindBy(name = "address1")
    @CacheLookup
    WebElement Address;

    @FindBy(name = "city")
    @CacheLookup
    WebElement City;

    @FindBy(name = "state")
    @CacheLookup
    WebElement State;

    @FindBy(name = "postalCode")
    @CacheLookup
    WebElement pin;

    @FindBy(name = "country")
    @CacheLookup
    WebElement Country;

    @FindBy(name = "email")
    @CacheLookup
    WebElement Uname;

    @FindBy(name = "password")
    @CacheLookup
    WebElement pwd;

    @FindBy(name = "confirmPassword")
    @CacheLookup
    WebElement Cpwd;

    @FindBy(name = "register")
    @CacheLookup
    WebElement Button;

    public void SetLink() {
        Register.click();
    }

    public void Setfirstname(String fname) {
        Firstname.sendKeys(fname);
    }

    public void SetLastname(String lname) {
        Lastname.sendKeys(lname);
    }

    public void SetPhone(String phn) {
        Phone.sendKeys(phn);
    }

    public void SetEmail(String mail) {
        Email.sendKeys(mail);
    }

    public void SetAddress(String adres) {
        Address.sendKeys(adres);
    }

    public void SetCity(String cty) {
        City.sendKeys(cty);
    }

    public void SetState(String st) {
        State.sendKeys(st);
    }

    public void setPostal(String pcode) {
        pin.sendKeys(pcode);
    }

    public void setCounrty(String conry) {
        Country.sendKeys(conry);
    }

    public void SetUsername(String username) {
        Uname.sendKeys(username);
    }

    public void SetPwd(String password) {
        pwd.sendKeys(password);
    }

    public void SetConfrmpwd(String conpwd) {
        Cpwd.sendKeys(conpwd);
    }


    public void Setclick() {
        Button.click();
    }


}
