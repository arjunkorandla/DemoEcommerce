package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Disability {

    WebDriver driver;
    @Test(priority=1)
    void openURL() throws InterruptedException {
        System.out.println("URL opened");
        WebDriverManager.chromedriver().setup();


         driver = new ChromeDriver();

        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);

    }

    @Test(priority=2)
    void login()
    {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

    }

    @Test(priority=3)
    void search()
    {
        WebElement admin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
        WebElement user_mngmnt = driver.findElement(By.id("menu_admin_UserManagement"));
        WebElement user = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));

        Actions mouseAction = new Actions(driver);

        mouseAction.moveToElement(admin).moveToElement(user_mngmnt).moveToElement(user).build().perform();
        System.out.println("still in progress............");

    }

    @Test(priority=4,enabled=false)
    void advancedsearch()
    {
        System.out.println("still in progress..............");

    }

    @Test(priority=5)
    void logout()
    {
        System.out.println("loogout test");
        Assert.assertTrue(true);
    }

}
