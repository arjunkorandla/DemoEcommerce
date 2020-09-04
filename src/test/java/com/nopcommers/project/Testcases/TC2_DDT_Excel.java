package com.nopcommers.project.Testcases;

import com.commers.utilities.XLUtils;
import com.nopcommerce.projectObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TC2_DDT_Excel extends BaseClass {


    @Test(dataProvider = "LoginData")
    public void loginTest(String user, String pwd) throws IOException {
        driver.get(baseUrl);
        driver.manage().window().maximize();
        LoginPage lp = new LoginPage(driver);

        lp.setUserName(user);
        logger.info("User name has entered");

        lp.setPassword(pwd);
        logger.info("passord has entered");

        lp.loginbutton();
        logger.info("login was clicked");

        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        if (driver.getTitle().equalsIgnoreCase("Dashboard / nopCommerce administration")) {
            lp.logoutbutton();
            logger.info("log out as perfomed");
            Assert.assertTrue(true);
        } else {
            logger.info("title ate not same");
            Assert.assertTrue(false);
        }
    }

    @DataProvider(name = "LoginData")
    public Object[] getData() throws IOException {

        String path = System.getProperty(("user.dir") + "src/test/java/com/nopcommerce/TestData/LoginData.xlsx");

        int rownum = XLUtils.getRowCount(path, "Sheet1");
        int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

        String logindata[][] = new String[rownum][colcount];

        for (int i = 1; i <= rownum; i++) {
            for (int j = 0; j < colcount; j++) {
                logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet", i, j);
            }


        }
        return logindata;

    }
}

