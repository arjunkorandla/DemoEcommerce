package PageObjectModels;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class RegistrationLogInTest {
    WebDriver driver;
    Logger logger;

    @BeforeClass
    void setup() {
        logger = Logger.getLogger("RegistrationLogInTest");
        PropertyConfigurator.configure("Log4j.properties");
        logger.info("Setting driver properties");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Set uo drivers and assigned URL");
        driver.get("http://newtours.demoaut.com/");
        logger.info("url is opened");

    }

    @Test
    void LoginPage() {

        logger.info("Clicking on registration link");
        RegistrationLogPage REGPGE = new RegistrationLogPage(driver);
        REGPGE.SetLink();
        logger.info("Entering fname");
        REGPGE.Setfirstname("Arjun");
        logger.info("Enterig last name");
        REGPGE.SetLastname("Korandla");
        logger.info("Enterig phone num ");
        REGPGE.SetPhone("+5145688679");
        logger.info("Enterig mailid");
        REGPGE.SetEmail("arjunorandla@gmail.com");
        logger.info("Enterig Address");
        REGPGE.SetAddress("15615-fksuhfsoihuf");
        logger.info("Enterig city");
        REGPGE.SetCity("MOn");
        logger.info("Enterig state");
        REGPGE.SetState("qc");
        logger.info("Enterig postal code ");
        REGPGE.setPostal("h2n1e25");
        logger.info("Enterig Entering Country");
        REGPGE.setCounrty("Canada");
        logger.info("Enterig the username");
        logger.info("Enterig password ");
        REGPGE.SetUsername("arjunkorandla");
        logger.info("Enterig Password");
        REGPGE.SetPwd("@rjunreddy060791");
        logger.info("Conform the passsword");
        REGPGE.SetConfrmpwd("@rjunreddy060791");
        logger.info("Clicking on Submit button");
        REGPGE.Setclick();

        // Validation

        if (driver.getPageSource().contains("Thank you for registering")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }


    }


}
