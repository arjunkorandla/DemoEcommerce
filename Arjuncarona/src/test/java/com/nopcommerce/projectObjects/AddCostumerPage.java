package com.nopcommerce.projectObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCostumerPage {
    public WebDriver ldriver;

    public AddCostumerPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    By lnkCostumer_menu = By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
    By lnkCostumer_menuItem = By.xpath("//span[@class='menu-item-title' ][contains(text(),'Customers')]");

    By btnAddNew = By.xpath("//a[@class='btn bg-blue']");
    By txtEmail = By.xpath("//input[@name = 'Email']");
    By txtPassword = By.xpath("//input[@name = 'Password']");

    By txtcustomerRoles = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");

    By lstitemAdministrators = By.xpath("//li[contains(text(),'Administrators')]");
    By lstitemRegistered = By.xpath("//li[contains(text(),'Registered')]");
    By lstitemGuests = By.xpath("//li[contains(text(),'Guests')]");
    By lstitemVendors = By.xpath("//li[contains(text(),'Vendors')]");


    By drpmgrOfVendor = By.xpath("//*[@id='VendorId']");
    By rdMaleGender = By.id("Gender_Male");
    By rdFeMaleGender = By.id("Gender_Female");

    By txtFirstName = By.xpath("//input[@id='FirstName']");
    By txtLastName = By.xpath("//input[@id='LastName']");

    By txtDob = By.xpath("//input[@id='DateOfBirth']");

    By txtCompanyName = By.xpath("//input[@id='Company']");

    By txtAdminContent = By.xpath("//textarea[@id='AdminComment']");

    By btnSave = By.xpath("//button[@name='save']");
    By customerEmail = By.xpath("//input[@id='SearchEmail']");
    By txtSearchFirstName = By.xpath("//input[@id='SearchFirstName']");
    By txtSearchLastName = By.xpath("//input[@id='SearchLastName']");
    By buttonSearch = By.xpath("//button[@id='search-customers']");
    By selectBox1 = By.xpath("//input[@value='1']");
    By selectBox2 = By.xpath("//input[@value='2']");
    By selectBox3 = By.xpath("//input[@value='3']");
    By selectBox4 = By.xpath("//input[@value='4']");
    By selectAllBox = By.xpath("//input[@type='checkbox']");
    By exportDrpdwn = By.xpath("//button[@data-toggle='dropdown']");
    By selectedAllXml = By.xpath("//button[@name='exportxml-all']");
    By selectedXml = By.xpath("//button[@id='exportxml-selected']");
    By selectedAllExcell = By.xpath("//button[@name='exportexcel-all']");
    By selectedExcell = By.xpath("//button[@id='exportexcel-selected']");
    By editCostumer = By.xpath("//*[@id=\'customers-grid\']/tbody/tr[1]/td[9]/a");
    By editTxtFirstName = By.xpath("//input[@id='FirstName']");
    By editTxtLastName = By.xpath("//input[@id='LastName']");
    By editRedioBtnMale = By.xpath("//input[@id='Gender_Male']");
    By editRedioBthFemale = By.xpath("//input[@id='Gender_Female']");
    By editTxtDob = By.xpath("//input[@id = 'DateOfBirth']");
    By editTxtCompanyName = By.xpath("//input[@id = 'Company']");
    By editCheckboxIsTaxExmp = By.xpath("//input[@id = 'IsTaxExempt']");

    By edittxtcustomerRoles = By.xpath("//div[@class= 'k-multiselect-wrap k-floatwrap']");

    By editlstitemAdministrators = By.xpath("//li[contains(text(),'Administrators')]");
    By editlstitemRegistered = By.xpath("//li[contains(text(),'Registered')]");
    By editlstitemGuests = By.xpath("//li[contains(text(),'Guests')]");
    By editlstitemVendors = By.xpath("//li[contains(text(),'Vendors')]");
    By editdrpmgrOfVendor = By.xpath("//*[@id='VendorId']");
    By editActive = By.xpath("//input[@id='Active']");
    By editTxtEnter = By.xpath("//textarea[@id='AdminComment']");
    By editButtonSave = By.xpath("//button[@name='save']");


    public void clickOnCostumerMenu() {
        ldriver.findElement(lnkCostumer_menu).click();

    }

    public void clickOnCostumerListMenu() {
        ldriver.findElement(lnkCostumer_menuItem).click();

    }

    public void clickOnAddNew() {
        ldriver.findElement(btnAddNew).click();

    }

    public void setEmail(String email) {
        ldriver.findElement(txtEmail).sendKeys(email);
    }

    public void setPassword(String password) {
        ldriver.findElement(txtPassword).sendKeys(password);
    }

    public void setCostumerRole(String role) {
        ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]"));
        ldriver.findElement(txtcustomerRoles).click();
        WebElement listitem;

        if ("Administrators".equals(role)) {
            listitem = ldriver.findElement(lstitemAdministrators);
        } else if ("Guests".equals(role)) {
            listitem = ldriver.findElement(lstitemGuests);
        } else if ("Registered".equals(role)) {
            listitem = ldriver.findElement(lstitemRegistered);
        } else if ("Vendors".equals(role)) {
            listitem = ldriver.findElement(lstitemVendors);
        } else {
            listitem = ldriver.findElement(lstitemGuests);
        }

        JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].click();", listitem);

    }

    public void setManagerofendor(String value) {
        Select drpdwn = new Select(ldriver.findElement(drpmgrOfVendor));
        drpdwn.selectByVisibleText(value);
    }

    public void setGender(String gender) {
        if (gender.equals("Male")) {
            ldriver.findElement(rdFeMaleGender);
        } else if (gender.equals("Female")) {
            ldriver.findElement(rdFeMaleGender);
        } else {
            ldriver.findElement(rdMaleGender);
        }

    }

    public void setFirstName(String fname) {
        ldriver.findElement(txtFirstName).sendKeys(fname);
    }

    public void setLastName(String lname) {
        ldriver.findElement(txtLastName).sendKeys(lname);
    }

    public void setDob(String dob) {
        ldriver.findElement(txtDob).sendKeys(dob);
    }

    public void setCompanyName(String comname) {
        ldriver.findElement(txtCompanyName).sendKeys(comname);
    }

    public void setAdminContent(String content) {
        ldriver.findElement(txtAdminContent).sendKeys(content);
    }

    public void clickOnSave() {
        ldriver.findElement(btnSave).click();
    }

    public void txtsearchBYEmail(String email) {
        ldriver.findElement(customerEmail).sendKeys(email);
    }

    public void clearCustEmailField() {
        ldriver.findElement(customerEmail).clear();
    }

    public void clearCostumerFirstNameField() {
        ldriver.findElement(txtSearchFirstName).clear();
    }

    public void txtsearchByFirstName(String fName) {
        ldriver.findElement(txtSearchFirstName).sendKeys(fName);
    }

    public void txtsearchByLastName(String lName) {
        ldriver.findElement(txtSearchLastName).sendKeys(lName);
    }

    public void buttonSearchCostumer() {
        ldriver.findElement(buttonSearch).click();

    }

    public void exportDropDown() {
        ldriver.findElement(exportDrpdwn).click();
    }

    public void selectallBoxes() {
        ldriver.findElement(selectAllBox).click();
    }

    public void SelectAllXml() {
        ldriver.findElement(selectedAllXml).click();
    }

    public void selectCheckBoxe1() throws InterruptedException {
        ldriver.findElement(selectBox1).click();
        Thread.sleep(2000);
    }

    public void selectCheckBoxe2() throws InterruptedException {
        ldriver.findElement(selectBox2).click();
        Thread.sleep(2000);
    }

    public void selectCheckBoxe3() throws InterruptedException {
        ldriver.findElement(selectBox3).click();
        Thread.sleep(2000);
    }

    public void selectCheckBoxe4() throws InterruptedException {
        ldriver.findElement(selectBox4).click();
        Thread.sleep(2000);
    }

    public void selectedXmlFile() {
        ldriver.findElement(selectedXml).click();
    }

    public void selectallExcellCostumer() {
        ldriver.findElement(selectedAllExcell).click();
    }

    public void selectSelectedExcellCostumer() {
        ldriver.findElement(selectedExcell).click();
    }
    //Costumer Edit PageObjects

    public void costumerDetailsEdit() {
        ldriver.findElement(editCostumer).click();
    }

    public void seteditCostumerFirstName(String editFname) {
        ldriver.findElement(editTxtFirstName).sendKeys(editFname);
    }

    public void seteditCostomerLastName(String editLname) {
        ldriver.findElement(editTxtLastName).sendKeys(editLname);
    }

    public void seteditCostomerGender(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            ldriver.findElement(editRedioBtnMale);
        }
        if (gender.equalsIgnoreCase("Female")) {
            ldriver.findElement(editRedioBthFemale);
        }
    }

    public void seteditCostomerDob(String Dob) {
        ldriver.findElement(editTxtDob).sendKeys(Dob);
    }

    public void seteditCostomerCompany(String CompName) {
        ldriver.findElement(editTxtCompanyName).sendKeys(CompName);
    }

    public void seteditCostomerTaxExmp() {
        ldriver.findElement(editCheckboxIsTaxExmp).click();
    }

    public void seteditCostomerRole(String role) {
        ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]"));
        ldriver.findElement(edittxtcustomerRoles).click();
        WebElement listitem;

        if ("Administrators".equals(role)) {
            listitem = ldriver.findElement(editlstitemAdministrators);
        } else if ("Guests".equals(role)) {
            listitem = ldriver.findElement(editlstitemGuests);
        } else if ("Registered".equals(role)) {
            listitem = ldriver.findElement(editlstitemRegistered);
        } else if ("Vendors".equals(role)) {
            listitem = ldriver.findElement(editlstitemVendors);
        } else {
            listitem = ldriver.findElement(editlstitemGuests);
        }

        JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].click();", listitem);
    }

    public void seteditCostomerVendor(String value) {
        Select editDrpDwn = new Select(ldriver.findElement(editdrpmgrOfVendor));
        editDrpDwn.selectByVisibleText(value);
    }

    public void editBtnCostomerActive() {
        ldriver.findElement(editActive).click();
    }

    public void editCostomer(String text) {
        ldriver.findElement(editTxtEnter).sendKeys(text);
    }
    public void seteditSaveBtn()
    {
        ldriver.findElement(editButtonSave).click();
    }

}
