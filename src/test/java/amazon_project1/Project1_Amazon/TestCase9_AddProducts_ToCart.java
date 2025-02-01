package amazon_project1.Project1_Amazon;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//Verify that items can be added to the shopping cart from product pages.
import org.testng.annotations.Test;
public class TestCase9_AddProducts_ToCart extends LaunchQuit{
	@Test(retryAnalyzer= Retryalltests.class)
	public void AddProducts_ToCart() throws InterruptedException, EncryptedDocumentException, IOException
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

	}
	

}
