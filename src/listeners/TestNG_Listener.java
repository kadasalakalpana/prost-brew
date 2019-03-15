package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCases Starts and TestCases are :==========" + result.getName() + "==========");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases Success and TestCases are :==========" + result.getName() + "==========");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases failed and TestCases are :==========" + result.getName() + "==========");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCases skipped and TestCases are :==========" + result.getName() + "==========");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
