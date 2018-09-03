package extentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listernersPractice implements ITestListener {

	public void onFinish(ITestContext arg0) {
		
		
	}

	public void onStart(ITestContext arg0) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	
		
	}

	public void onTestFailure(ITestResult Result) {
		System.out.println("The test got failed"+ Result.getName());
		
	}

	public void onTestSkipped(ITestResult Result) {
		System.out.println("The test got skipped" + Result.getName());
		
	}

	public void onTestStart(ITestResult Result) {
		System.out.println("The test got started"+Result.getName());
		
	}

	public void onTestSuccess(ITestResult Result) {
		System.out.println("The test got passed"+ Result.getName());
		
	}

	
	
}
