package listenersreport;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerDemo extends TestListenerAdapter {
    public void onTestStart(ITestResult tr)
    {
        System.out.println("The test has started");
    }
    public void onTestSuccess(ITestResult tr)
    {
        System.out.println("The test has Passed");
    }
    public void onTestFailed(ITestResult tr)
    {
        System.out.println("The test has Failed");
    }


}
