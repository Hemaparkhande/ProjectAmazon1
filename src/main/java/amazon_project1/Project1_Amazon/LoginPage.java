package amazon_project1.Project1_Amazon;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage 
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

	@FindBy(xpath="//input[contains(@id,'ap_email')]")
	WebElement username;

	@FindBy(id="continue")//use also for new account
	WebElement cnt_button;

	@FindBy(name="password")
	WebElement pwd;

	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	@FindBy(id="nav-cart-count")
	WebElement cart_button;
	
	@FindBy(name="cvf_captcha_input")
	WebElement puzzle_button;
	
	@FindBy(id="//h4[.='There was a problem']")
	WebElement signinerror_button;
	
	
	public void user() throws InterruptedException, EncryptedDocumentException, IOException 
	{
//		wait.until(ExpectedConditions.elementToBeClickable(username));
		Thread.sleep(4000);
		FileInputStream f1 = new FileInputStream("/Users/hemag.gade/eclipse-workspace/Project1_Amazon/DDT/ExcelSheet.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String un = w1.getSheet("detailslogin").getRow(1).getCell(0).getStringCellValue();
		username.sendKeys(un);
	}
	public void user2() throws InterruptedException, EncryptedDocumentException, IOException 
	{//for wrong credentials login
//		wait.until(ExpectedConditions.elementToBeClickable(username));
		Thread.sleep(4000);
		FileInputStream f1 = new FileInputStream("/Users/hemag.gade/eclipse-workspace/Project1_Amazon/DDT/ExcelSheet.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String un = w1.getSheet("detailslogin").getRow(1).getCell(0).getStringCellValue();
		username.sendKeys(un);
	}
	public void cntbutton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(cnt_button));

		cnt_button.click();
	}
	public void password() throws EncryptedDocumentException, IOException
	{
		wait.until(ExpectedConditions.elementToBeClickable(pwd));
		FileInputStream f1 = new FileInputStream("/Users/hemag.gade/eclipse-workspace/Project1_Amazon/DDT/ExcelSheet.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String pswd = w1.getSheet("detailslogin").getRow(1).getCell(1).getStringCellValue();
		pwd.sendKeys(pswd);
	}
	public void newpassword()//for wrong credentials login
	{
		pwd.sendKeys("Hema");
		signin_button.click();
		if(puzzle_button.isDisplayed())
		{
			puzzle_button.click();
		}
		else
		{
			signinerror_button.click();
		}
				
	}
	
	public void signinbutton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(signin_button));

		signin_button.click();
	}
	
	public void cart()
	{
		cart_button.click();
	}
//	step3
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}










/*

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	

	@FindBy(xpath="//input[contains(@id,'ap_email')]")
	WebElement username;

	@FindBy(id="continue")//use also for new account
	WebElement cnt_button;

	@FindBy(name="password")
	WebElement pwd;

	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	@FindBy(id="nav-cart-count")
	WebElement cart_button;
	
	public void user() throws InterruptedException, EncryptedDocumentException, IOException 
	{
//		wait.until(ExpectedConditions.elementToBeClickable(username));
		Thread.sleep(1000);
		FileInputStream f1 = new FileInputStream("/Users/hemag.gade/eclipse-workspace/Project1_Amazon/DDT/ExcelSheet.xlsx");
		Workbook w1= WorkbookFactory.create(f1);
		String un = w1.getSheet("detailslogin").getRow(1).getCell(0).getStringCellValue();
		username.sendKeys(un);
				
	}
	public void user2() throws InterruptedException 
	{	//user2 is used for testcase3 login with wrong credentials
//		wait.until(ExpectedConditions.elementToBeClickable(username));
		Thread.sleep(4000);
		username.sendKeys("sandeep@gl.com");
	}

	public void cntbutton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(cnt_button));

		cnt_button.click();
	}
	public void password() throws InterruptedException
	{
		Thread.sleep(3000);
		pwd.sendKeys("Amazon@1503");																																																																									pwd.sendKeys("Amazon@1503");
	}
/*	public void newpassword()
	{
																						pwd.sendKeys("Hema@123");
	}
	
	public void signinbutton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(signin_button));

		signin_button.click();
	}
	
	public void cart()
	{
		cart_button.click();
	}
	
//	step3
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
*/