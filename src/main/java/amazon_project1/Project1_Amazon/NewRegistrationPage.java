package amazon_project1.Project1_Amazon;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewRegistrationPage {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@FindBy(xpath="//a[.='Start here.']")
	WebElement newcustomerstarthere_button;
	
	@FindBy(id="ap_email_login")
	WebElement newuseremailormobilenumber_button;
	
	@FindBy(id="continue")
	WebElement continueuser_button;
	
	@FindBy(id="intention-submit-button")
	WebElement proceedtocreateanaccount_button;
	
	@FindBy(id="ap_customer_name")
	WebElement enteryourname_button;
	
	@FindBy(id="ap_password")
	WebElement createpassword_button;
	
	@FindBy(id="continue")
	WebElement verifymobilenumber_button;
	
	@FindBy(id="createAccountSubmit")
	WebElement createaccountsubmit_button;
	
	@FindBy(id="auth-pv-enter-code")
	WebElement enterotp_button;
	
	public void newcustomerstarthere()
	{
		newcustomerstarthere_button.click();
	}
	
	public void newuseremailormobilenumber(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(newuseremailormobilenumber_button));
															newuseremailormobilenumber_button.sendKeys("+410765220387");
		newuseremailormobilenumber_button.sendKeys(Keys.ENTER);
	}
	
	public void continueuser()
	{
		continueuser_button.click();
	}
	public void proceedtocreateanaccount()
	{
		proceedtocreateanaccount_button.click();
	}
	public void enteryourname()
	{
		enteryourname_button.sendKeys("Hema Parkhande");
		enteryourname_button.sendKeys(Keys.ENTER);
	}
	public void createpassword()
	{
																																																																				createpassword_button.sendKeys("Hema@123");
		createpassword_button.sendKeys(Keys.ENTER);
	}
	public void verifymobilenumber() throws InterruptedException
	{
		verifymobilenumber_button.click();
		Thread.sleep(20000);
	}
	public void createaccountsubmit() throws InterruptedException
	{
		createaccountsubmit_button.click();
		Thread.sleep(20000);
	}
	public void enterotp() throws InterruptedException
	{
		//You will get otp on the phone
		
	}
	
	
	public NewRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
