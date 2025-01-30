package amazon_project1.Project1_Amazon;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
@Listeners(TestListener.class)

//Go to orders page and click on your last ordered product and give 5star ratings
public class TestCase14_Orders_Review extends LaunchQuit {
	@Test(retryAnalyzer= Retryalltests.class)
	public void Orders_Review() throws InterruptedException, EncryptedDocumentException, IOException
	{
		HomePage homepage = new HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin(driver);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.user();
		loginpage.cntbutton();
		loginpage.password();
		loginpage.signinbutton();
		
		OrdersPage orderspage = new OrdersPage(driver);
		orderspage.returnsandordershoverover_button(driver);
		orderspage.returnsandordersclick();
		orderspage.writeproductreview(driver);
		orderspage.star();
		
	}

}
