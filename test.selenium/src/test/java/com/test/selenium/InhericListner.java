package com.test.selenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class InhericListner implements ITestListener, IRetryAnalyzer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed");
	}

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
	}

	public boolean retry(ITestResult result) {
		
		return false;
	}

}
