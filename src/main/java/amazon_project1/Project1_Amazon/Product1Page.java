package amazon_project1.Project1_Amazon;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Product1Page {
WebDriver driver;
WebDriverWait wait;
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement addtowishlist_button;
	
	@FindBy(id="continue-shopping")
	WebElement continue_button;
	
	@FindBy(id="add-to-cart-button")//span[.='Add to Cart']
	WebElement addtocart_button;
	
	@FindBy(id="sw-gtc")//for Testcase5
	WebElement gotocart_button;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
	WebElement price_button;
	
	@FindBy(xpath="//*[@id=\"averageCustomerReviews_feature_div\"]")
	WebElement reviews_button;
	
	@FindBy(xpath="//h3[contains(text(), 'About this item')]")
	WebElement aboutthisitem_button;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[32]/div/div[1]/h3[1]")
	WebElement productdetails_button;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-addon newCouponBadge aok-align-center']")
	WebElement coupon_button; //not writing method for this
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[1]")
	WebElement couponcheckbox_button;
	
	public void addtowishlist(WebDriver driver) 
	{
		Set<String> pcid= driver.getWindowHandles();
		Iterator<String> pciditr = pcid.iterator();
		String parentid=pciditr.next();
		String childid= pciditr.next();
		driver.switchTo().window(childid);
//		Thread.sleep(6000);
		addtowishlist_button.click();
//		Thread.sleep(5000);
	}
	public void continuebutton() throws InterruptedException
	{
		Thread.sleep(2000);
		continue_button.click();
	}
	public void clickCouponCheckbox(WebDriver driver) {
	    try {
	        couponcheckbox_button.click();
	        System.out.println("Coupon checkbox selected successfully.");
	    } catch (NoSuchElementException e) {
	        System.out.println("Coupon checkbox is not available for this item.");
	    }
	}
	public void addtocart(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(4000);
		Set<String>pcid=driver.getWindowHandles();
		Iterator<String>pciditerator=pcid.iterator();
		String parentid= pciditerator.next();
		String chiildid= pciditerator.next();
		driver.switchTo().window(chiildid);
		Thread.sleep(4000);
		addtocart_button.click();
		Assert.assertEquals(gotocart_button.isDisplayed(), true);
	}
	public void gotocart_button()
	{
		gotocart_button.click();
	}
	public void verifyitem()
	{
Assert.assertEquals(price_button.isDisplayed(), true);
//Assert.assertEquals(productdetails_button.isDisplayed(), true);
//Assert.assertEquals(reviews_button.isDisplayed(), true);
//Assert.assertEquals(aboutthisitem_button.isDisplayed(), true);
	}
		public Product1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
