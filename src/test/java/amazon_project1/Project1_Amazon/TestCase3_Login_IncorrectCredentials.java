package amazon_project1.Project1_Amazon;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//Ensure login fails with incorrect email or password.
import org.testng.annotations.Test;

public class TestCase3_Login_IncorrectCredentials extends LaunchQuit
{
@Test(retryAnalyzer= Retryalltests.class)
public void Login_IncorrectCredentials() throws InterruptedException, EncryptedDocumentException, IOException
{
	HomePage homepage = new HomePage(driver);
	homepage.accountandlist(driver);
	homepage.signin(driver);
	
	LoginPage loginpage = new LoginPage(driver);
	loginpage.user2();
	loginpage.cntbutton();
	loginpage.newpassword();
}
}
