package amazon_project1.Project1_Amazon;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
//Ensure that the product detail page displays all necessary information (price, reviews, description).
public class TestCase7_ProductDetails extends LaunchQuit {
@Test(retryAnalyzer= Retryalltests.class)
public void ProductDetails () throws InterruptedException, EncryptedDocumentException, IOException
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
	
	SearchResultPage searchresultpage= new SearchResultPage(driver);
	searchresultpage.searchresultproduct1();
	
	Product1Page product1page = new Product1Page(driver);
	product1page.verifyitem();
}
}
