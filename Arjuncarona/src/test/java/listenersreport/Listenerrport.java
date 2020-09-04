package listenersreport;

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

import java.io.IOException;

public class Listenerrport extends TestListenerAdapter
{
    public ExtentHtmlReporter ExtentReport;
    public ExtentTest logger;
    public ExtentReports extent;


    public void onStart(ITestContext tr)
    {
        ExtentReport = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/mysecondreport.html");
        ExtentReport.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");

        extent = new ExtentReports();

        extent.attachReporter(ExtentReport);
        extent.setSystemInfo("user","Arjun");
        extent.setSystemInfo("host","localhost");
        extent.setSystemInfo("system","personal");
        extent.setSystemInfo("environment","windows");
        extent.setSystemInfo("browser","chrome");

        ExtentReport.config().setDocumentTitle("This is my first report");
        ExtentReport.config().setReportName("This is the report done by ArjunREddy ");
        ExtentReport.config().setTestViewChartLocation(ChartLocation.TOP);
        ExtentReport.config().setTheme(Theme.DARK);

    }

    public void onTestSuccess(ITestResult tr)
    {
        logger=extent.createTest(tr.getName()); // create new entry in the report
        logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN)); // send the passed information to the report with GREEN color highlighted

    }

    public void onTestFailure(ITestResult tr)
    {
        logger = extent.createTest((tr.getName()));
        logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
        String screenshotPath=System.getProperty("user.dir")+"/Screenshots/"+tr.getName()+".png";
        try {
            logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult tr)
    {
        logger=extent.createTest(tr.getName()); // create new entry in the report
        logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE)); // send the passed information to the report with GREEN color highlighted

    }


    public void onFinish(ITestContext tr)
    {
        extent.flush();
    }
}
