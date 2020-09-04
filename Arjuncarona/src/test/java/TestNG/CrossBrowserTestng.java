package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowserTestng {

    WebDriver driver;

    @Parameters("browser")
    @Test(priority = 1)
    public void launchbrowser(String br) {


        if (br.equals("chrome")) {
            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
        }
           /* else if(br.equals("firefox"))
            {
               WebDriverManager.firefoxdriver();
                driver=new FirefoxDriver();
            }*/
        else if (br.equals("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }

        driver.get("http://newtours.demoaut.com/");

    }

    @Test(priority = 2)
    public void verifyTitle() {

        Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours");


    }

    @Test(priority = 3)
    public void registration() {

        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
        driver.findElement(By.name("firstName")).sendKeys("arjun");
        driver.findElement(By.name("lastName")).sendKeys("korandla");
        driver.findElement(By.name("phone")).sendKeys("1234567898");
        driver.findElement(By.name("userName")).sendKeys("korandla@yamil.com");
        driver.findElement(By.name("address1")).sendKeys("jhhbsnfuislfislifsiufeinffpfw");
        driver.findElement(By.name("city")).sendKeys("montreal");
        driver.findElement(By.name("state")).sendKeys("qc");
        driver.findElement(By.name("postalCode")).sendKeys("h1p2v1");
        Select dropdown = new Select(driver.findElement(By.name("country")));
        dropdown.selectByVisibleText("CANADA ");
        driver.findElement(By.name("email")).sendKeys("arjun@gamil.com");
        driver.findElement(By.name("password")).sendKeys("arjunreddy");
        driver.findElement(By.name("confirmPassword")).sendKeys("arjunreddy");
        driver.findElement(By.name("register")).click();

        //write code for registratio process
    }

    @Test(priority = 4)
    public void closeBrowser() {

        driver.close();
    }

}



