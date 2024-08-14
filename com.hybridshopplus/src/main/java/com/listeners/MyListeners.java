package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.utilities.DriverUtils;

public class MyListeners extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
    test= report.createTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	test.log(Status.PASS, "Test case passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test case failed");
		String path= DriverUtils.getScreenshot(result.getName());
		test.addScreenCaptureFromBase64String(path);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test case skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	@Override
	public void onStart(ITestContext context) {
	
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush(); //To Save All data
		
	}

}
