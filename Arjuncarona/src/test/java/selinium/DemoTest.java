package selinium;

import com.nopcommerce.projectObjects.AddCostumerPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class DemoTest extends AddCostumerPage {
    public DemoTest(WebDriver rdriver) {
        super(rdriver);
    }

    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://admin-demo.nopcommerce.com");

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@yourstore.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        //driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//a[@href='#']//span[contains(text(),'Customers')]")).click();
        driver.findElement(By.xpath("//span[@class='menu-item-title' ][contains(text(),'Customers')]")).click();
        /*driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        //Select drpdwn = new Select(driver.findElement(By.xpath("//button[@data-toggle='dropdown']")));
        driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).click();
        driver.findElement(By.xpath("//button[@name = 'exportexcel-all']")).click();
        driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).click();*/
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\'customers-grid\']/tbody/tr[1]/td[9]/a")).click();

      /* AddCostumerPage obj = new AddCostumerPage(driver);
       obj.selectCheckBoxe1();
       obj.selectCheckBoxe2();
       obj.selectCheckBoxe3();
       obj.selectCheckBoxe4();
       obj.exportDropDown();
       obj.selectedXmlFile();
        Thread.sleep(5000);
        obj.selectallBoxes();
        obj.selectallExcellCostumer();*/
        //drpdwn.selectByVisibleText("Export to Excel (all found)";



    }


}
