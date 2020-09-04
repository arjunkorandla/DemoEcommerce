/*
package com.nopcommers.project.Testcases;


import com.nopcommerce.projectObjects.AddCostumerPage;
import com.nopcommerce.projectObjects.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;



public class TC_AddCustomerTest_003 extends BaseClass2
{

    @Test
    public void addNewCustomer() throws IOException, InterruptedException
    {
        driver.get(baseURL);

        LoginPage lp=new LoginPage(driver);
        lp.setUserName(username);
        logger.info("User name is provided");

        lp.setPassword(password);
        logger.info("password is provided");

        lp.loginbutton();

        logger.info("providing customer details....");

        AddCostumerPage addcust=new AddCostumerPage(driver);

        addcust.clickOnCostumerMenu();
        addcust.clickOnCostumerListMenu();

        addcust.clickOnAddNew();

        String email = randomestring()  + "@gmail.com";
        addcust.setEmail(email);

        addcust.setPassword("test123");

        //Registered - default
        //The customer cannot be in both 'Guests' and 'Registered' customer roles
        //Add the customer to 'Guests' or 'Registered' customer role
        addcust.setCostumerRole("Guest");

        addcust.setManagerofendor("Vendor 2");

        addcust.setGender("Male");

        addcust.setFirstName("Arjun");
        addcust.setLastName("Korandla");

        addcust.setDob("6/07/1992"); // Format: D/MM/YYY

        addcust.setCompanyName("busyQA");
        addcust.setAdminContent("This is for testing.........");

        addcust.clickOnSave();

        logger.info("validation started....");

        //String msg=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']")).getText();

        String msg = driver.findElement(By.tagName("body")).getText();


        if(msg.contains("The new customer has been added successfully"))
        {
            Assert.assertTrue(true);
            logger.info("test case passed....");
        }
        else
        {
            captureScreen(driver,"addNewCustomer");
            Assert.assertTrue(false);
        }

    }



}

*/
