package seleniumWEBDriver;

import XLUTILS.XLUTILS;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EXCELWEBDRIVER {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
        driver.manage().window().maximize();
        String path = "C://Users//koran//Desktop//java//selinium//DDT_EXCEL/caldata.xlsx";
        XLUTILS.setExcelFile(path,"Sheet1");
        int rowcount = XLUTILS.getRowCount(path,"Sheet1");
        for (int i =1; i<=rowcount;i++)
        {
            int principle_amount = Integer.parseInt(XLUTILS.getCellData(path,"Sheet1",i,0));
            Double RateOfIntrest = Double.parseDouble(XLUTILS.getCellData(path,"Sheet1",i,1));
            int Period = Integer.parseInt(XLUTILS.getCellData(path,"Sheet1",i,2));
            String Frequency = XLUTILS.getCellData(path,"Sheet1",3);
            double exp_mvalue=Double.parseDouble(XLUTILS.getCellData(path,"Sheet1",i,4));


            driver.findElement(By.id("principal")).sendKeys(String.valueOf(principle_amount));
            driver.findElement(By.id("interest")).sendKeys(String.valueOf(RateOfIntrest));
            driver.findElement(By.id("tenure")).sendKeys(String.valueOf(Period));
            Select optiondrop = new Select(driver.findElement(By.id("tenurePeriod")));
            optiondrop.selectByVisibleText("year(s)");
            Select FreqDropdown = new Select(driver.findElement(By.id("frequency")));
            FreqDropdown.selectByVisibleText("Simple Interest");
            driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
            String act_mvalue =driver.findElement(By.xpath("//*[@id='resp_matval']/strong")).getText();
            //*[@id="resp_matval"]/strong
            if (exp_mvalue == Double.parseDouble(act_mvalue ))
            {
                System.out.println("test pass");
            }
            else
            {
                System.out.println("Test failed");
            }

            driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[2]/img")).click(); // clear button

            Thread.sleep(3000);




        }

    }
}
