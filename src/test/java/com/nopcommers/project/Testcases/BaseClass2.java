package com.nopcommers.project.Testcases;

import com.commers.utilities.ReadConfig;
import com.nopcommerce.projectObjects.LoginPage;
import com.nopcommerce.projectObjects.catalog_pageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseClass2 {
    ReadConfig readconfig=new ReadConfig();

    public String baseURL=readconfig.getBaseURL();
    public String username=readconfig.getUsername();
    public String password=readconfig.getPassword();
    public static WebDriver driver;

    public static Logger logger; //Added logger
    @Parameters("browser")
    @BeforeClass
    public void setup()throws AWTException
    {
    	
       
    	
    	
        logger = Logger.getLogger("nopCommerce2");
        PropertyConfigurator.configure("log4j.properties");


        // Global implicit Wait
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        logger.info("username is given");
        lp.setPassword(password);
        logger.info("password is provided");
        lp.loginbutton();
        logger.info("login is performed");
    }

   /* public void login()
    {
        driver.get(baseURL);
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        logger.info("username is given");
        lp.setPassword(password);
        logger.info("password is provided");
        lp.loginbutton();
        logger.info("login is performed");
    }*/

    public void catalogPageobject() throws AWTException {
        catalog_pageObjects catalog = new catalog_pageObjects(driver);
        logger.info("imported catalog Page Objects");

        catalog.setclickOnCatalog();
        catalog.setclickOnCatalogProducts();
        catalog.setProductSearchByName("Apple iCam");
        catalog.setSelect_productCatagory("Electronics >> Camera & photo");
        catalog.setclicksubCatagories();
        catalog.setSearchManufactures("Apple");
        catalog.setSeatchVendor("All");
        catalog.setSearchWhwrehouse("All");
        catalog.setSearchProducttype("Simple");
        catalog.setSearchPublish("Published only");
        catalog.setTxtSearchSKU("APPLE_CAM");
        catalog.clickOnSearchSKU();
        //catalog.clickOnSearchProduct();




       // catalog.setclickONProductInfo();
        catalog.setProductName("Mikeju");
        catalog.setProductDiscription("Thisproduct is just designed to test the automation testing");
        catalog.setclick_FIle();
        catalog.setclick_NewDocument();
        catalog.setclick_Insert();
        catalog.setclick_SelectDate();
        catalog.setselected_date();
        catalog.setclick_View();
        catalog.setSelectPreview();
        catalog.setPreviewClose();
        catalog.setFormat();
        catalog.setSelectFormetBold();
        catalog.settableData();
        catalog.setInsertTable();
        catalog.setTableClmn();
        catalog.setselectTool();
        catalog.setSourceCode();
        catalog.settextAreaInSidePopup();
        catalog.settxtStyleleft();
        catalog.settxtStyleRight();
        catalog.settxtBold();
        catalog.settxtformet();
        catalog.settxtHedder();
        catalog.settxtHeaderSize();
        catalog.settxtStyle();
        catalog.settxtStyleFormet();
        catalog.setfontSizeBtn();
        catalog.setfontSize();
        catalog.setColourSelect();
        catalog.setColour();
        catalog.settxtBulletlist();
        catalog.setlinkEdit();
        catalog.setlinkURL("https://stackoverflow.com/questions/45544023/how-to-resolve-can-inject-only-one-of-itestcontext-xmltest-into-a-beforetest");
        catalog.setlinkTxtDiscription("fliufhilhfkkfskuhfukdsfidsfbdsfbdsbfyydsbbdsbdbdbyds");
        catalog.setimagelink();
        catalog.setimageSource("https://www.google.co.in/url?sa=i&url=https%3A%2F%2Fwww.deccanchronicle.com%2Fnation%2Fcurrent-affairs%2F210519%2Fvijaywada-goli-soda-loses-its-fizz-in-the-era-of-soft-drinks.html&psig=AOvVaw2i_Ukrhw04oGjbFW0qcVj_&ust=1587697030850000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNiRy7_G_egCFQAAAAAdAAAAABAD");
        catalog.setimageDiscription("cdknckdsnckdsncsdcdnkzdvuzuviluzds");
        catalog.setimageDimensions1("25");
        catalog.setimageDimensions2("30");
        catalog.settxtInsideFrame("kcdssdncusdusdilsfsjbsbvjsdb fcnsfcsnfhslnifa fh");
        catalog.settxtBoxDrag();
        catalog.settxtSku("Mike_cam_tupas");
        //catalog.settxtselectCatagories("Apparel >> Accessories");
        catalog.settxtSelectManufacture();
        catalog.setcheckboxPublished();
        //catalog.settxtProductTags("This is Demo Tags");
        catalog.settxtGTIN("235a85d62s");
        catalog.settxtManufacturePartNum("A2522S663dscc");
        catalog.setcheckBox_ShowHomePage();
        catalog.setSelectProduct_Type("Simple");
        catalog.setcheckBoxVisibleIndividually();
        catalog.setselectCostumerRoles("Guests");
        //catalog.settxtLimitedStores();
        //catalog.seSelectVendors("Vendor 2");
        catalog.setcheckBoxRequireAnotherProduct();
        catalog.setcheckBoxCostomerReview();
        catalog.settxtStertDate("22/6/2020");
        catalog.settxt_EndDate("15/07/2020");
        catalog.setcheckBoxMarkAsNew();
        catalog.settxtAdminComment("usiufssfsfcfcsffffzbjmvbdukvvbjszbvsbvjysbyvbsyjvbjsbvyrvirbvyirilvbr,bvirbvierirbiluerbkurbugkbr,jvbzudkvbukrvjybv,rbvkudbvilubzuivb");

        catalog.setbtnSaveandContinue();
        catalog.buttonSave();










        /*  //popupAccapt
        driver.switchTo().alert().accept();

        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
*/
    }

    @AfterClass
    public void tearDown()
    {
        //driver.close();
    }


    public void captureScreen(WebDriver driver, String tname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");
    }

}
