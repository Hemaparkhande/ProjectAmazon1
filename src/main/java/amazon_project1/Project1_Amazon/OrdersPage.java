package amazon_project1.Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage {
	WebDriver driver;
	
	@FindBy(id="nav-orders")
	WebElement returnsandordershoverover_button;
	
	@FindBy(xpath="//span[.='Returns']")
	WebElement returnsandordersclick_button;
	
	
	@FindBy(id="a-autoid-13-announce")
	WebElement writeproductreview_button;
	
	@FindBy(xpath="(//button[@class='ryp__star__button'])[4]")
	WebElement star_button;
	
	public void writeproductreview(WebDriver driver)
	{
		/*Actions a1= new Actions(driver);
		a1.moveToElement(returnsandordershoverover_button).perform();*/
		writeproductreview_button.click();	
	}
	
	public void returnsandordershoverover_button(WebDriver driver) throws InterruptedException
	{
		Actions a1= new Actions(driver);
		a1.moveToElement(returnsandordershoverover_button).perform();
		Thread.sleep(4000);

	}
	public void returnsandordersclick()
	{
		returnsandordersclick_button.click();	
	}	
	public void star()
	{
		star_button.click();	
	}
	public OrdersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
