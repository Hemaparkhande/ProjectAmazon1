package amazon_project1.Project1_Amazon;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//Test searching for products using its name like shoe
import org.testng.annotations.Test;

public class TestCase5_Search_Products_shoe extends LaunchQuit{
	@Test(retryAnalyzer= Retryalltests.class)
	public void Search_Products_shoe() throws InterruptedException, EncryptedDocumentException, IOException
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
		
		
		
	}

}
