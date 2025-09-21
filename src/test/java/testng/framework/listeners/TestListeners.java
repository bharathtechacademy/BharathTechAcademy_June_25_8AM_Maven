package testng.framework.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		System.out.println("Starting execution of test: " + testName);
	}

	public void onTestSuccess(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		System.out.println("Test " + testName + " passed successfully.");
	}

	public void onTestFailure(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		System.out.println("Test " + testName + " failed.");
		System.out.println("Reason: " + result.getThrowable().getMessage());
	}

}
