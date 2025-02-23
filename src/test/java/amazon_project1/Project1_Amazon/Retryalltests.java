package amazon_project1.Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryalltests implements IRetryAnalyzer{
	int initialcount =0;
	public static int retrycount =2;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (initialcount<retrycount)
		{
			initialcount ++;
			return true;
		}
		
		return false;
	}
	
}
