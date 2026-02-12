package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer{
int intialCount =0;
int retryCount=2;

	@Override
	public boolean retry(ITestResult result) {
		if(intialCount<retryCount) {
			intialCount++;
			return true;
		}
		return false;
	}
	
	

}
