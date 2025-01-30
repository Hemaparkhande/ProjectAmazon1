package amazon_project1.Project1_Amazon;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
//Check if a user can successfully edit their profile information.
import org.testng.annotations.Test;
public class TestCase4_Login_EditProfileInformation extends LaunchQuit{
	@Test(retryAnalyzer= Retryalltests.class)
	public void Login_EditProfileInformation() throws InterruptedException, EncryptedDocumentException, IOException
	{
			HomePage homepage = new HomePage(driver);
			homepage.accountandlist(driver);
			homepage.signin(driver);
			
			LoginPage loginpage = new LoginPage(driver);
			loginpage.user();
			loginpage.cntbutton();
			loginpage.password();
			
			loginpage.signinbutton();
			
//			homepage.accountandlist(driver);
//			homepage.manageprofile(driver);
//			homepage.viewaccountholder_button(driver);
			homepage.view(driver);
			

			homepage.editprofilename(driver);
			homepage.editProfileNameInputId(driver);
			homepage.Continue(driver);
			
		

	}

}
