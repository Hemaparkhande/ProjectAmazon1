package amazon_project1.Project1_Amazon;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//Test if a new user can successfully register
import org.testng.annotations.Test;
@Listeners(TestListener.class)
public class TestCase1_NewUser_Registration extends LaunchQuit{
	@Test(retryAnalyzer= Retryalltests.class)
	public void NewUser_Registration() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin(driver);
		
		NewRegistrationPage newregistrationpage = new NewRegistrationPage(driver);
		newregistrationpage.newuseremailormobilenumber(driver);
		newregistrationpage.proceedtocreateanaccount();
		newregistrationpage.enteryourname();
		newregistrationpage.createpassword();
		newregistrationpage.verifymobilenumber();
		
		Thread.sleep(10);// to solve puzzle
		//		newregistrationpage.createaccountsubmit();
		/*		newregistrationpage.enterotp();
		
		LoginPage loginpage = new LoginPage(driver);

		loginpage.newpassword();;
		loginpage.signinbutton();*/
//		Assert.assertnotequal
	}

}
