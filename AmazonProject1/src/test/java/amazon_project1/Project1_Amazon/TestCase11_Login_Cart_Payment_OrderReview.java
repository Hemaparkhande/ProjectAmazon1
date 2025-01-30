package amazon_project1.Project1_Amazon;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
//Validate the entire checkout process, including address selection,
@Listeners(TestListener.class)
//payment method selection, and order review.
public class TestCase11_Login_Cart_Payment_OrderReview extends LaunchQuit {
	@Test(retryAnalyzer= Retryalltests.class)
	public void Login_Cart_Payment_OrderReview() throws InterruptedException, EncryptedDocumentException, IOException
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
		paymentpage.cod();
		Thread.sleep(3000);
//		paymentpage.usethispaymentmethod();
//		paymentpage.placeyourorder();
//		paymentpage.thankyou();
		
	}

}
