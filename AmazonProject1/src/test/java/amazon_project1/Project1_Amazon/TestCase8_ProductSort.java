package amazon_project1.Project1_Amazon;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
//Check if products can be sorted by relevance, price, rating, etc.
public class TestCase8_ProductSort extends LaunchQuit {
@Test(retryAnalyzer= Retryalltests.class)
public void ProductSort() throws InterruptedException, EncryptedDocumentException, IOException
{
	HomePage homepage = new HomePage(driver);
	homepage.accountandlist(driver);
	homepage.signin(driver);
//	run only in chrome
	LoginPage loginpage = new LoginPage(driver);
	loginpage.user();
	loginpage.cntbutton();
	loginpage.password();
	loginpage.signinbutton();
	
	homepage.search(driver);
	ProductSortPage productsortpage = new ProductSortPage(driver);
	productsortpage.sortbyfeatured(driver);
}
}
