package Com.Utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;

public class TestListener implements ITestListener {

	public final static Logger logger = Logger.getLogger(TestListener.class);

	public void onTestFailure(ITestResult result) {
		logger.error("***** Error " + result.getMethod().getMethodName() + " failed!");
	}

	public void onTestStart(ITestResult result) {
		logger.info("***** Message " + result.getMethod().getMethodName() + " Started!");

	}

	public void onTestSuccess(ITestResult result) {
		logger.info("***** Message " + result.getMethod().getMethodName() + " Pass!");
	}

	public void onTestSkipped(ITestResult result) {
		logger.error("***** Message " + result.getMethod().getMethodName() + " Skipped!");

	}

	public void onStart(ITestContext context) {
		logger.info("***** Execution of " + context.getSuite() + " started on " + context.getHost());

	}

	public void onFinish(ITestContext context) {
		logger.info("Execution of " + context.getSuite() + " finished on " + context.getHost());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Implementation

	}

}
