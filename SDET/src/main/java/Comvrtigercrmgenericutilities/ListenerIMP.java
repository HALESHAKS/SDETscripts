package Comvrtigercrmgenericutilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerIMP implements ITestListener {
	public ExtentReports report;
	public ExtentTest test;
	
	public void onFinish(ITestContext context){
report.flush();
}
	public void onStart(ITestContext context){
ExtentSparkReporter htmlreporter = new ExtentSparkReporter("./ExtentReporter.html");
htmlreporter.config().setTheme(Theme.DARK);
htmlreporter.config().setDocumentTitle("vTiger App");
report=new ExtentReports();
report.attachReporter(htmlreporter);
report.setSystemInfo("Platform", "windows");
report.setSystemInfo("OS","windows pro");
report.setSystemInfo("Environment", "Testing Environment");
report.setSystemInfo("Reporter","jhili" );

	}
	public void onTestFailedButwithinSuccessPercentage(ITestResult result){
		//ToDo Auto-generated method stub	 
		}
	public void onTestFailure(ITestResult result){
test.log(Status.FAIL,result.getMethod().getMethodName()+"is failes");
test.log(Status.FAIL,result.getThrowable());
		WebDriverUtility wutiles=new WebDriverUtility();
		try{
			 String path = wutiles.takeScreenShot(BaseClass.staticDriver,result.getMethod().getMethodName());		
			test.addScreenCaptureFromPath(path);
		}catch(IOException e)
		{
				e.printStackTrace();
	
		}
	}
	public void onTestSkipped(ITestResult result)
	{

	}
	public void onTestStart(ITestResult result)
	{
test=report.createTest(result.getMethod().getMethodName());
	}
	public void onTestSuccess(ITestResult result)
	{
test.log(Status.PASS,result.getMethod().getMethodName()+" is passes");
	}
}