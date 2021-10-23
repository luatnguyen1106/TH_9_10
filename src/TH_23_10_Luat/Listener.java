package TH_23_10_Luat;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	@Override
	public void onFinish (ITestContext arg0) {
		System.out.print("Finish");
	}
	
	@Override
	public void onStart (ITestContext arg0) {
		System.out.print("Bắt Đầu:");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage (ITestResult arg0) {
		System.out.print("onTestFailedButWithinSuccessPercentage:");
	}
	
	@Override
	public void onTestFailure (ITestResult arg0) {
		System.out.print("onTestFailure:");
	}
	
	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.print("onTestSkipped:");
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.print("Bắt Đầu Test");
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test tiếp theo:");
	}
}
