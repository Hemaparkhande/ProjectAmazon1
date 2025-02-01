package amazon_project1.Project1_Amazon;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//Verify login is successful with correct email and password.
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class TestCase2_Login_CorrectCredentials extends LaunchQuit
{@Test(retryAnalyzer= Retryalltests.class)
public void Login_CorrectCredentials() throws InterruptedException, EncryptedDocumentException, IOException
{
	HomePage homepage = new HomePage(driver);
	homepage.accountandlist(driver);
	homepage.signin(driver);
	
	LoginPage loginpage = new LoginPage(driver);
	loginpage.user();
	loginpage.cntbutton();
	loginpage.password();
	loginpage.signinbutton();
}
}
