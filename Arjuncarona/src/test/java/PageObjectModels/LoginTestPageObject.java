package PageObjectModels;

import TestNG.BeforClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class LoginTestPageObject {
    WebDriver driver;
    Logger logger;


    @BeforClass
    @Test(priority = 1)
    public void setup() {
        logger = Logger.getLogger("LoginTestPageObject");
        PropertyConfigurator.configure("Log4j.properties");
        logger.info("Driver are setup");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Successfully drivers installed");
        driver.get("http://newtours.demoaut.com/");
        logger.info("Url Connected");
    }

    void LoginPage()

    {
        LoginPageObject lp = new LoginPageObject(driver);
        //logintest lp = new logintest(driver);
        lp.setUserName("mercury");
        lp.setPassword("mercury");
        lp.clickSubmit();


    }

}

