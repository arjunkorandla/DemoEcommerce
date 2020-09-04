package listenersreport;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class LoginSCreenshot {
    static WebDriver driver;

    @BeforeClass
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test
    public void loginTest()
    {
        driver.get("http://newtours.demoaut.com/");
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");


        driver.findElement(By.name("login")).click();


        Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
    }
    //@Test (dataProvider = "users")
    /*public void loginTest2(String username,String pwd) throws InterruptedException {
        driver.get("http://newtours.demoaut.com/");
        driver.findElement(By.name("userName")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(pwd);
        driver.findElement(By.name("login")).click();
    Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
    }*/

   /* @DataProvider(name="users")
    Object[][] logindata()
   {
       String data[][] = {"mercury","mercury"};
       return data;

    }
*/
    @AfterClass
    public void closeBrowser()
    {
        driver.quit();
    }

    @AfterMethod
    public void captureScreen(ITestResult result) throws IOException
    {
        if (result.getStatus() == ITestResult.FAILURE)
        {
            TakesScreenshot ts = (TakesScreenshot) driver;

            File source = ts.getScreenshotAs(OutputType.FILE); // capture the screenshot file
            File target = new File(System.getProperty("user.dir") + "/Screenshots/" + result.getName() + ".png");
            FileUtils.copyFile(source, target);
            System.out.println("screenshot catured");
        }
    }
}
