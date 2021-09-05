package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.ITest;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ReportConfiguration implements ITestListener {

    ExtentReports extentReports;
    ExtentTest extentTest;

    public void onTestStart(ITestResult result) {



    }

    public void onTestSuccess(ITestResult result) {

        extentTest.log(LogStatus.PASS,result.getName(),"success message");

    }
    int retry=0;
    public void onTestFailure(ITestResult result) {

        extentTest.log(LogStatus.FAIL, result.getName(),"failure message");

    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
        extentReports= new ExtentReports("D:\\GIT\\demo.project\\src\\test\\java\\testoutputs\\aa.html",true);
        extentTest= extentReports.startTest("testName here");
    }

    public void onFinish(ITestContext context) {

        extentReports.endTest(extentTest);
        extentReports.flush();
    }


}
