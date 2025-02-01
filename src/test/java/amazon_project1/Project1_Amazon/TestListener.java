package amazon_project1.Project1_Amazon;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListener implements ITestListener{
WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		Reporter.log("Test start - Listener");
		System.out.println("Test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test is passed - Listener");
	/*	TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/hemag.gade/eclipse-workspace/Project1_Amazon/listeners_screenshots/PassTestCases/passed.png");
			try {
				FileHandler.copy(source, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test is failed - Listener");
/*		WebDriver t1 = driver;
		File source = ((TakesScreenshot) t1).getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/hemag.gade/eclipse-workspace/Project1_Amazon/listeners_screenshots/FailTestCases/failed.png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
