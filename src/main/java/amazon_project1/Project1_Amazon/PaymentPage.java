package amazon_project1.Project1_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PaymentPage {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	@FindBy(name = "proceedToRetailCheckout")
	WebElement proceedtobuy;

	@FindBy(xpath = "(//a[@class='a-link-normal expand-panel-button celwidget'])[1]")
	WebElement changeaddress_button;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-radio'])[1]")
	WebElement deliveryaddress_radiobutton;

	@FindBy(xpath = "(//input[@class='a-button-input'])[2]")
	WebElement usethisaddress_button;

	@FindBy(xpath = "(//a[@class='a-link-normal expand-panel-button celwidget'])[2]")
	WebElement changepaymentmethod_button;

	@FindBy(xpath = "(//span[.='Cash on Delivery/Pay on Delivery'])[3]")
	WebElement cod;

	@FindBy(xpath = "//span[@id='checkout-secondary-continue-button-id-announce']")
	WebElement usethispaymentmethod;
	
	
	@FindBy(id = "placeOrder")
	WebElement placeyourorder_button;

	@FindBy(xpath = "//div[@class='a-box-inner a-alert-container']")
	WebElement thankyou_button;
	
	@FindBy(xpath = "//span[@class='pmts-instrument-selector pmts-apb-radio-button']")
	WebElement amazonpaybalance_button;
	
	@FindBy(xpath="//span[.='ICICI Bank Credit Card']")
	WebElement ibankcreditcardaccount_button;
	
	@FindBy(xpath="//span[.='Amazon Pay']")
	WebElement amazonpay_button;
	
	@FindBy(xpath="//span[.='CREDIT & DEBIT CARDS']")
	WebElement creditdebitcardaccount_button;
	
	@FindBy(xpath="(//span[.='Net Banking'])[4]")
	WebElement netbanking_button;
		
	@FindBy(xpath="//span[.='Other UPI Apps']")
	WebElement otherupiapps_button;
	
	@FindBy(xpath="(//span[.='EMI'])[4]")
	WebElement emi_button;
	
	@FindBy(xpath="(//span[@class='pmts-use-balance-value-descriptor'])[2]")
	WebElement promotionappliedcheckbox_button;
	
	
	public void proceedtobuy() {
		proceedtobuy.click();
	}
	
	public void usethisaddress_button(WebDriver driver) {
		wait.until(ExpectedConditions.elementToBeClickable(usethisaddress_button));
		usethisaddress_button.click();
//		Assert.assertEquals(promotionappliedcheckbox_button.isSelected(), true);
	}

	public void changepaymentmethod() 
	{
		wait.until(ExpectedConditions.elementToBeClickable(changepaymentmethod_button));
		changepaymentmethod_button.click();
//		System.out.println("changepaymentmethod clicked");
	}
	public void cod() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(cod));
		cod.click();
		System.out.println("cod selected");
	}
	public void usethispaymentmethod() {
		wait.until(ExpectedConditions.elementToBeClickable(usethispaymentmethod));
		usethispaymentmethod.click();
		System.out.println("used payment method");
	}
	public void allpaymentbuttons() throws InterruptedException {

		Thread.sleep(3000);
		ibankcreditcardaccount_button.click();
		creditdebitcardaccount_button.click();
		Thread.sleep(3000);
//		netbanking_button.click();
		Thread.sleep(3000);
		otherupiapps_button.click();
		Thread.sleep(3000);
		emi_button.click();
		Thread.sleep(3000);
	}
	public void placeyourorder() throws InterruptedException {
		Thread.sleep(3000);
		placeyourorder_button.click();
	}
	public void thankyou() {
		thankyou_button.click();
	}
	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
