package listenersreport;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class listnerlogin {
    public WebDriver driver;
    @BeforeClass
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @Test(priority = 1)
    public void loginTest()
    {
        driver.get("https://matrixcollege.omnivox.ca/Login/Account/Login?ReturnUrl=%2fintr%2f");
        driver.findElement(By.name("NoDA")).sendKeys("1913510");
        driver.findElement(By.name("PasswordEtu")).sendKeys("arjunreddy060791");

        driver.findElement(By.xpath("//*[@id=\"formLogin\"]/div[4]/div/button/span")).click();

        Assert.assertEquals(driver.getTitle(), "Omnivox - Matrix College");

    }



    @Test(priority = 2)
    public void insideomini() throws InterruptedException {

        driver.findElement(By.id("ctl00_partOffreServices_offreV2_Intr_Accueil")).click();
        //Assert.assertEquals(driver.getTitle()," Omnivox - Léa, the Omnivox Classroom");
    Thread.sleep(5000);
    }
    @Test(priority = 3)
    public void indisemio()
    {
    driver.findElement(By.id("qdn-sans-bouton-wrapper")).click();

    }


    @AfterClass
    void closeBrowser()
    {
        driver.close();
    }

}
