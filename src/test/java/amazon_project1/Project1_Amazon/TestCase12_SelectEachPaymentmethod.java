package amazon_project1.Project1_Amazon;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
@Listeners(TestListener.class)
//Check if user is able to select each payment method
public class TestCase12_SelectEachPaymentmethod extends LaunchQuit {
	@Test(retryAnalyzer= Retryalltests.class)
	public void SelectEachPaymentmethod() throws InterruptedException, EncryptedDocumentException, IOException
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
		SearchResultPage searchresultpage = new SearchResultPage(driver);
		searchresultpage.searchresultproduct1();
		
		Product1Page product1page = new Product1Page(driver);
		product1page.addtocart(driver);
		product1page.gotocart_button();
		
		PaymentPage paymentpage = new PaymentPage(driver);
		paymentpage.proceedtobuy();
		paymentpage.usethisaddress_button(driver);
		paymentpage.allpaymentbuttons();
		paymentpage.cod();	
		
	}

}
