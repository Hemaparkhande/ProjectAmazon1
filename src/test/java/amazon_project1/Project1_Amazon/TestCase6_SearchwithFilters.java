package amazon_project1.Project1_Amazon;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

//Verify that searching with filters (e.g., category, price range) yields accurate results.
public class TestCase6_SearchwithFilters extends LaunchQuit {
	@Test(retryAnalyzer= Retryalltests.class)
	public void SearchwithFilters() throws InterruptedException, EncryptedDocumentException, IOException
	{
		HomePage homepage = new HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin(driver);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.user();
		loginpage.cntbutton();
		loginpage.password();
		loginpage.signinbutton();
		homepage.search(driver);
		
Thread.sleep(3000);
		homepage.category();
		homepage.allprime();

		
	}

}
