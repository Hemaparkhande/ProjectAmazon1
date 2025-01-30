package amazon_project1.Project1_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSortPage {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	@FindBy(xpath="//select[@data-action='a-dropdown-select']")
	WebElement sortbyfeatured_button;
	
	public void sortbyfeatured(WebDriver driver) throws InterruptedException
	{
//		wait.until(ExpectedConditions.elementToBeClickable(sortbyfeatured_button)).click();;
		Select sort = new Select(sortbyfeatured_button);
		sort.selectByIndex(2);	
		Thread.sleep(3000);
		sort.selectByVisibleText("Avg. Customer Review");
	}
	
	public ProductSortPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
