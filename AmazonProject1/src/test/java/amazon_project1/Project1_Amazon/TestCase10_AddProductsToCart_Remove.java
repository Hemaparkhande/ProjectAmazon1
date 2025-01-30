package amazon_project1.Project1_Amazon;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

//Test updating item quantities and removing items from the cart.
@Listeners(TestListener.class)
public class TestCase10_AddProductsToCart_Remove extends LaunchQuit {
	@Test(retryAnalyzer= Retryalltests.class)
	public void AddProductsToCart_Remove() throws InterruptedException, EncryptedDocumentException, IOException
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
		
		CartPage cartpage = new CartPage(driver);
		cartpage.quantityplus_button();
		cartpage.delete_button();
		
		
	}

}
