package matrixomini.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import matrixomini.utilities.ReadConfigOminiVox;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.logging.Logger;

public class BaseClass {

    ReadConfigOminiVox readConfig = new ReadConfigOminiVox();

    public String baseUrl = readConfig.getOminiURL();
    public String userName = readConfig.getUsername();
    public String password = readConfig.getPassword();
    public static WebDriver driver;

    public static Logger logger;

    @BeforeClass
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        logger = Logger.getLogger("Omini");
        PropertyConfigurator.configure("log4j.properties");
    }

    @AfterClass
    public void tearDown()
    {
        driver.close();
    }

}
