package matrixomini.testcases;

import matrixomini.pageobjects.ominivox_pageobjects;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_Ominivox extends BaseClass {

    @Test
    public void login()throws InterruptedException
    {
        driver.get(baseUrl);
        //logger.info("URL is Passed");
        ominivox_pageobjects lp = new ominivox_pageobjects(driver);
        lp.setUserId(userName);
        lp.setPassord(password);
        lp.loginbutton();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        lp.Liobutton();
        lp.grades();
        lp.Quit();

    }

}
