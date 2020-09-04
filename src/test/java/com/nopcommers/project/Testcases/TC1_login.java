package com.nopcommers.project.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;



public class TC1_login extends BaseClass
{




    @Test(priority = 1)
    public void titleHomepage() {
        Assert.assertEquals(driver.getTitle(),"Dashboard / nopCommerce administration");

        logger.info("Assertion passed");
    }

    @Test(priority = 2)
    public void addCustomers() throws IOException, InterruptedException {
        customerPageomer("Araejun", "Krawenadla", "Male", "Vendor 2", "06/07/1991", "arjunkreeandla91");
    }

    @Test(priority = 3)
    public void searchByEmail() throws InterruptedException {
        searchEmail("admin@yourStore.com");
        String actualEmail = driver.findElement(By.xpath("//tr[@role='row']/td[2]")).getText();
        String expectedEmail = "admin@yourStore.com";
        Assert.assertEquals(actualEmail, expectedEmail);
        logger.info("test case  search passed....");

    }

    @Test(priority = 4)
    public void searchByFirstName() throws InterruptedException {
        searchFirstname("Victoria");
        String actualFirstname = driver.findElement(By.xpath("//tr[@role='row']/td[3]")).getText();
        Assert.assertTrue(actualFirstname.contains("Victoria"));
        logger.info("First name search is passed" );
    }

    @Test(priority = 5)
    public void searchByLastName() throws InterruptedException {
        searchLastname("Gates");
       // String actualLastname = driver.findElement(By.xpath("//tr[@role='row']/td[3]")).getText();
        WebElement actualLastname = driver.findElement(By.xpath("//tr[@role='row']/td[3]"));

        Assert.assertTrue(actualLastname.getText().contains("Gates"));
        //Assert.assertEquals(actualLastname.getText().contains("Gates"), "Gates");
        logger.info("Last name search is passed");

    }
   /* @Test(priority = 6)
    public void DemoTest() throws InterruptedException {
        getSelectedAllExcellCostumers();
        getSelectedCostumersExcel();
        getAllXml();
        getSelectedXml();
    }*/
    @Test(priority = 6)
    public void EditCostumerDetails1()
    {
        editCostumerButton();

    }




}
