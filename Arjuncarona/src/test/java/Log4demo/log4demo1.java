package Log4demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.logging.Logger;
public class log4demo1 {
    static Logger logger;
    WebDriver driver;
    @Test(priority = 1)
    public void setup()
    {
        logger = Logger.getLogger("log4demo1");
        PropertyConfigurator.configure("Log4j.properties");
        logger.info("ready to start");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Driver was setup");

    }
    @Test(priority=2)
    public void login()
    {
        logger.info("Loging url");
        driver.get("http://www.seleniumeasy.com/test/table-pagination-demo.html");
        logger.info("the web page is lodding");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[1]/div/a")).click();
        logger.info("clicked on demo home page");


        driver.findElement(By.id("btn_basic_example")).click();
        logger.info("Clicked on practice demo");
        driver.findElement(By.id("basic_example"));
        logger.info("clicked on basic");
    }

    @Test(priority=3)
    public void logout()
    {
        //Write webdriver code
        System.out.println(" This is logout test");
        logger.info("logout is completed");
    }


}
