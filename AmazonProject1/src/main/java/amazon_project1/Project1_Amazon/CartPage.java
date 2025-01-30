package amazon_project1.Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	@FindBy(xpath="//button[@data-action='a-stepper-increment']")
	WebElement quantityplus_button;
	
	@FindBy(xpath="(//input[@data-feature-id='item-delete-button'])[1]")
	WebElement delete_button;
	
	public void quantityplus_button() throws InterruptedException 
	{
		Thread.sleep(2000);
		int count=1;
		while(count<4)
		{
			Thread.sleep(4000);
			quantityplus_button.click();
			count++;
			Thread.sleep(2000);
		}	
System.out.println("count added");
	}
	public void delete_button() 
	{
		
		delete_button.click();
		System.out.println("count deleted");
	}
	
public CartPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	

}
