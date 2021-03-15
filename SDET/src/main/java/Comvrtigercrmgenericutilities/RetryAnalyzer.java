package Comvrtigercrmgenericutilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
int counter=0;
int retrycount=4;
public boolean retry(ITestResult result)
{
	while(counter<retrycount){
		counter++;
		return true;	
	}
	return false;
}
}
