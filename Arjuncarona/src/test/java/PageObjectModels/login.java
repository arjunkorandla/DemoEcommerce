package PageObjectModels;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class login {


        WebDriver driver;

        @BeforeClass
        void setup()
        {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.get("http://newtours.demoaut.com/");
        }

        void login()
        {
            logintest lp = new logintest(driver);
            lp.setUserName("mercury");
            lp.setPassword("mercury");
            lp.clickSubmit();
        }


        }





