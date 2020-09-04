package seleniumWEBDriver;

import XLUTILS.XLUTILSSIMPLEINTREST;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class simpleintrestExcel {

        public static void main(String[] args) throws Exception {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.easycalculation.com/simple-interest.php");
            driver.manage().window().maximize();
            String path = "C://Users//koran//Desktop//java//selinium//DDT_EXCEL/SIdata.xlsx";
            XLUTILSSIMPLEINTREST.setExcelFile(path,"Sheet1");
           int rows = XLUTILSSIMPLEINTREST.getRowCount(path,"Sheet1");
            for (int i =1; i<= rows;i++)
            {
                int Principle_AMT = Integer.parseInt(XLUTILSSIMPLEINTREST.getCellData(path,"Sheet1",i,0));
                int RateOfIntrest = Integer.parseInt(XLUTILSSIMPLEINTREST.getCellData(path,"Sheet1",i,1));
                int Duration = Integer.parseInt(XLUTILSSIMPLEINTREST.getCellData(path,"Sheet1",i,2));
                Double Simple_Intrest = Double.parseDouble(XLUTILSSIMPLEINTREST.getCellData(path,"Sheet1",i,3));
                Double Final_AMOUNT  = Double.parseDouble(XLUTILSSIMPLEINTREST.getCellData(path,"Sheet1",i,4));

                Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"dispCalcConts\"]/div[1]/select")));
                dropdown.selectByVisibleText("Simple Interest (SI)");
                Thread.sleep(3000);
                driver.findElement(By.name("res1")).sendKeys(String.valueOf(Principle_AMT));
                driver.findElement(By.name("res2")).sendKeys(String.valueOf(RateOfIntrest));
                driver.findElement(By.name("res3")).sendKeys(String.valueOf(Duration));
                Select timeDrp = new Select(driver.findElement(By.name("time")));
                timeDrp.selectByVisibleText("Years");
                Thread.sleep(3000);

                String act_si=driver.findElement(By.name("res4")).getAttribute("value"); //capture Simple Interest value

                if (Simple_Intrest == Double.parseDouble(act_si )&& Final_AMOUNT == Principle_AMT+Double.parseDouble(act_si))
                {
                    System.out.println("Test is passes");
                    XLUTILSSIMPLEINTREST.setCellData(path,"Sheet1",i,5,"Passed");
                }
                else
                {
                    System.out.println("Test is failed");
                    XLUTILSSIMPLEINTREST.setCellData(path,"Sheet1",i,5,"failed");
                }
                driver.findElement(By.xpath("//*[@id='dispCalcConts']/input[2]")).click(); //reset button
                Thread.sleep(3000);











            }

        }
    }


