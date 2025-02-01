package amazon_project1.Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	WebDriver driver;
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement searchresultproduct1;
	
/*	@FindBy(xpath="//div[@data-asin='B0BSHF4BWP']")
	WebElement searchresultproduct2;
	public void searchresultproduct2()
	{
		searchresultproduct2.click();
	}
	*/
	public void searchresultproduct1()
	{
		searchresultproduct1.click();
	}

	
	public SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
