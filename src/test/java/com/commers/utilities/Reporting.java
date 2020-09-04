package com.commers.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reporting extends TestListenerAdapter {
    public ExtentHtmlReporter htmlreporter;
    public ExtentReports extent;
    public ExtentTest logger;


    public void onStart(ITestContext testContext)
    {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.").format(new Date());
        String reportName = "Test-Report-" + timestamp+ ".html";
        htmlreporter= new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/"+reportName);

        extent = new ExtentReports();

        extent.attachReporter(htmlreporter);
        extent.setSystemInfo("HostName","local");
        extent.setSystemInfo("Environment","QA");
        extent.setSystemInfo("user","Arjun");

        htmlreporter.config().setDocumentTitle("nopCommers TEst Project");
        htmlreporter.config().setReportName("Functional Test Report");
        htmlreporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlreporter.config().setTheme(Theme.DARK);

    }
    public void onTestSuccess(ITestResult tr)
    {
        logger = extent.createTest(tr.getName());
        logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));

    }
    public void onTestFailure(ITestResult tr)
    {
        logger=extent.createTest(tr.getName()); // create new entry in th report
        logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED)); // send the passed information to the report with GREEN color highlighted

        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.").format(new Date());
        String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+ timestamp + ".png";

        File f = new File(screenshotPath);

        if(f.exists())
        {
            try {
                logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }

    public void onTestSkipped(ITestResult tr)
    {
        logger=extent.createTest(tr.getName()); // create new entry in th report
        logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
    }

    public void onFinish(ITestContext testContext)
    {
        extent.flush();
    }


}
