package amazon_project1.Project1_Amazon;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
//Reach till cart page without login in amazon application
import org.testng.annotations.Test;

public class TestCase15_Cart_WithoutLogin extends LaunchQuit {
	@Test(retryAnalyzer= Retryalltests.class)
	public void Cart_WithoutLogin() throws InterruptedException
	{		
		HomePage homepage = new HomePage(driver);
		homepage.search(driver);
		SearchResultPage searchresultpage = new SearchResultPage(driver);
		searchresultpage.searchresultproduct1();
		
		Product1Page product1page = new Product1Page(driver);
		product1page.addtocart(driver);
		product1page.gotocart_button();
		
		
	}

}
