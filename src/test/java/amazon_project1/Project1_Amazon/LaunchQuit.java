package amazon_project1.Project1_Amazon;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
@Listeners(value=TestListener.class)
public class LaunchQuit 
{
	public WebDriver driver;
@Parameters("browser")
@BeforeMethod
public void launch(@Optional("chrome")String browsername)
{
	
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized","--window-size=2560,1440", "--ignore-certificate-errors",
                "--disable-extensions", "--disable-dev-shm-usage", "--log-level=3","--headless"
        );//, //options.addArguments("--disable-http2");
        
    
	if(browsername.equals("firefox"))
	{
		driver=new FirefoxDriver();		
	}
	else if (browsername.equals("chrome"))
	{
		driver=new ChromeDriver(options);
	}
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		// Clear cookies
        driver.manage().deleteAllCookies();
        //# Clear local storage
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.localStorage.clear();");
        js.executeScript("window.sessionStorage.clear();");

        // driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
/*public void Launch()
{
	driver = new FirefoxDriver();
	
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}*/
@AfterMethod
public void quit() throws InterruptedException
{
	Thread.sleep(3000);
	driver.quit();
}
}
