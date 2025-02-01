package amazon_project1.Project1_Amazon;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	//step1
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist_hoverover;//use twice for manage profile

	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signin_home;
//	(//a[.='Start here.'])[1]
	@FindBy(id="twotabsearchtextbox")
	WebElement search_textfield;

	@FindBy(xpath="//span[.='Sign Out']")
	WebElement logout_button;

	@FindBy(id="ap_email_login")//for new account
	WebElement username;
	
	@FindBy(xpath="//button[.='Manage Profiles']")
	WebElement manageprofile_button;
	
	@FindBy(xpath="(//div[@class='sc-feUZmu jVsNcO'])[1]")
	WebElement viewaccountholder_button;
	
	
	@FindBy(xpath="//a[.='View']")
	WebElement view_button;
	
	
	@FindBy(xpath="//button[@class='edit-pencil-icon-button']")
	WebElement editprofilename_button;
	
	@FindBy(id="editProfileNameInputId")
	WebElement editProfileNameInputId_button;
	
	@FindBy(xpath="//span[.='Continue']")//(//input[@class='a-button-input'])[3]
	WebElement Continue_Button;
	
	@FindBy(id="nav-link-accountList")
	WebElement accountandlist2_button;
	
	@FindBy(linkText="Women's Casual Shoes")
	WebElement category_button;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[1]")
	WebElement allprime_button;
	
	//step2
	public void accountandlist(WebDriver driver)
	{
	Actions a1 = new Actions(driver);
	a1.moveToElement(accountandlist_hoverover).perform();
	}
	public void signin(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(4000);
//		wait.until(ExpectedConditions.elementToBeClickable(signin_home));
		signin_home.click();
		Thread.sleep(2000);
	}
	public void search(WebDriver driver) 
	{
		search_textfield.sendKeys("shoe");
		search_textfield.sendKeys(Keys.ENTER);
	}
	public void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		logout_button.click();
//		Assert.assertEquals(username.isDisplayed(), true, "Username is available on Homepage");
	}

	public void manageprofile(WebDriver driver) 
	{
		wait.until(ExpectedConditions.visibilityOf(manageprofile_button));
		manageprofile_button.click();
	}
	
	public void editprofilename(WebDriver driver) 
	{
		editprofilename_button.click();
	}
	public void editProfileNameInputId(WebDriver driver) 
	{
		editProfileNameInputId_button.clear();
		editProfileNameInputId_button.sendKeys("Sandy");
		editProfileNameInputId_button.sendKeys(Keys.ENTER);
	}
	public void Continue(WebDriver driver) 
	{
		Continue_Button.click();
	}
	public void viewaccountholder_button(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(4000);
//		wait.until(ExpectedConditions.elementToBeClickable(viewaccountholder_button));
		viewaccountholder_button.click();
	}
	public void view(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		Actions a2 = new Actions(driver);
		a2.moveToElement(accountandlist2_button).perform();
		wait.until(ExpectedConditions.visibilityOf(manageprofile_button));
		manageprofile_button.click();
		wait.until(ExpectedConditions.visibilityOf(view_button));
		Thread.sleep(3000);
		view_button.click();
	}
	public void category()
	{
		category_button.click();
	}
	public void allprime()
	{
		allprime_button.click();
	}
	
	//step3
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
