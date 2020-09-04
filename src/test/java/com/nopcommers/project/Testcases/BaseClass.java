package com.nopcommers.project.Testcases;

import com.commers.utilities.ReadConfig;
import com.nopcommerce.projectObjects.AddCostumerPage;
import com.nopcommerce.projectObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseClass {

    ReadConfig readConfig = new ReadConfig();

    public String baseUrl = readConfig.getBaseURL();
    public String userName = readConfig.getUsername();
    public String password = readConfig.getPassword();
    public static WebDriver driver;

    //AddCostumerPage customerPage = new AddCostumerPage(driver);

    public static Logger logger;
    String actualEmail;


    @Parameters("browser")
    @BeforeClass
    public void setup() throws AWTException {

    	
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    	

        logger = Logger.getLogger("nopCommerce");
        PropertyConfigurator.configure("log4j.properties");

        driver.get(baseUrl);
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(userName);
        logger.info("username is given");
        lp.setPassword(password);
        logger.info("password is provided");
        Robot robot = new Robot();
        //robot.keyPress(KeyEvent.VK_ENTER);
        lp.loginbutton();
        //logger.info("login is performed");

    }

 @Test(enabled = false)
    public void login()
    {
        driver.get(baseUrl);
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(userName);
        logger.info("username is given");
        lp.setPassword(password);
        logger.info("password is provided");
        lp.loginbutton();
        logger.info("login is performed");
    }

  /*  @AfterMethod
    public void logout()
    {
        LoginPage lp = new LoginPage(driver);
        lp.logoutbutton();
    }*/

    @AfterClass
    public void tearDown()
    {
        driver.close();
    }

    public void customerPageomer(String firstName, String lastName,String gender, String vendor, String dob, String email) throws IOException
    {
        AddCostumerPage customerPage = new AddCostumerPage(driver);
        logger.info("providing customer details....");
        

        customerPage.clickOnCostumerMenu();
        customerPage.clickOnCostumerListMenu();

        customerPage.clickOnAddNew();

        String em = email  +randomestring()+ "@gmail.com";
        customerPage.setEmail(em);

        String pwd = randomestring();
        customerPage.setPassword(pwd);

        //Registered - default
        //The customer cannot be in both 'Guests' and 'Registered' customer roles
        //Add the customer to 'Guests' or 'Registered' customer role
        //customerPage.setCostumerRole("");

        customerPage.setManagerofendor(vendor);

        customerPage.setGender(gender);

        customerPage.setFirstName(firstName);
        customerPage.setLastName(lastName);

        customerPage.setDob(dob); // Format: D/MM/YYY

        String companyName = randomestring();
        customerPage.setCompanyName(companyName);

        String adminContent = randomestring();
        customerPage.setAdminContent(adminContent);

        customerPage.clickOnSave();

        logger.info("validation started....");

        //String msg=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']")).getText();

        String msg = driver.findElement(By.tagName("body")).getText();


        if(msg.contains("The new customer has been added successfully"))
        {
            Assert.assertTrue(true);
            logger.info("test case passed....");
        }
        else
        {
            captureScreen(driver,"addNewCustomer");
            Assert.assertTrue(false);
        }
       /* customerPage.selectallBoxes();
        customerPage.exportDropDown();
        customerPage.selectallExcellCostumer();
        customerPage.exportDropDown();
        customerPage.selectCheckBoxes();
        customerPage.selectSelectedExcellCostumer();*/
    }


        public void getSelectedAllExcellCostumers() throws InterruptedException {
            Thread.sleep(5000);
            AddCostumerPage selecttype = new AddCostumerPage(driver);
            selecttype.selectallBoxes();
            selecttype.exportDropDown();
            selecttype.selectallExcellCostumer();
            Thread.sleep(5000);

        }
        public void getSelectedCostumersExcel() throws InterruptedException {
            AddCostumerPage selectLimited = new AddCostumerPage(driver);
            selectLimited.selectCheckBoxe1();
            selectLimited.selectCheckBoxe2();
            selectLimited.selectCheckBoxe3();
            selectLimited.selectCheckBoxe4();
            selectLimited.exportDropDown();
            selectLimited.selectSelectedExcellCostumer();
            Thread.sleep(5000);
        }
        public void getAllXml() throws InterruptedException {
            AddCostumerPage selectAllXml = new AddCostumerPage(driver);
            selectAllXml.selectallBoxes();
            selectAllXml.exportDropDown();
            selectAllXml.SelectAllXml();
            Thread.sleep(5000);
        }
        public void getSelectedXml() throws InterruptedException {
            AddCostumerPage selectedXml = new AddCostumerPage(driver);
            selectedXml.selectCheckBoxe1();
            selectedXml.selectCheckBoxe2();
            selectedXml.selectCheckBoxe3();
            selectedXml.selectCheckBoxe4();
            selectedXml.exportDropDown();
            selectedXml.selectedXmlFile();
            Thread.sleep(5000);

        }

    public void searchEmail(String eMailSearch) throws InterruptedException {
        AddCostumerPage customerPage = new AddCostumerPage(driver);
        customerPage.txtsearchBYEmail(eMailSearch);
        customerPage.buttonSearchCostumer();
        Thread.sleep(5000);
    }


    public void searchFirstname(String FnameSearch) throws InterruptedException {
        AddCostumerPage customerPage = new AddCostumerPage(driver);
        customerPage.clearCustEmailField();
        customerPage.txtsearchByFirstName(FnameSearch);
        customerPage.buttonSearchCostumer();
        Thread.sleep(5000);
    }


    public void searchLastname(String LnameSearchc) throws InterruptedException {
        AddCostumerPage srchLname = new AddCostumerPage(driver);
        srchLname.clearCostumerFirstNameField();
        srchLname.txtsearchByLastName(LnameSearchc);
        srchLname.buttonSearchCostumer();
        Thread.sleep(5000);
    }
    public void editCostumerButton()
    {
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        AddCostumerPage editCust = new AddCostumerPage(driver);
        editCust.costumerDetailsEdit();
        editCust.seteditCostumerFirstName("ArjunReddy");
        editCust.seteditCostomerLastName("Korandla");
        editCust.seteditCostomerGender("male");
        editCust.seteditCostomerDob("06/07/1992");
        editCust.seteditCostomerCompany("lfuhsdfiuhsdlvu");
        editCust.seteditCostomerTaxExmp();
        editCust.seteditCostomerRole("Vendors");
        editCust.seteditCostomerVendor("Vendor 2");
        editCust.editBtnCostomerActive();
        editCust.editCostomer("I'm editing the Costumer details By Automation ");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
        editCust.seteditSaveBtn();

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
    }



    public void captureScreen(WebDriver driver, String tname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");
    }


    public static String randomestring() {
        String generatedString1 = RandomStringUtils.randomAlphabetic(5);
        return (generatedString1);
    }

    public static String randomeNum() {
        String generatedString2 = RandomStringUtils.randomNumeric(4);
        return (generatedString2);
    }



}
