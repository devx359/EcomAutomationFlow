package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver driver;
	public static WebDriver getDriver(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			try
			{
				Log.debug("Loading Chrome browser driver ");
				System.setProperty("webdriver.chrome.driver", "E:\\softwares\\selenium\\chromedriver.exe");
				driver=new ChromeDriver();
				Log.debug("Loaded Chrome browser driver ");
				driver.manage().window().maximize();
				return driver;
			}
			catch(Exception e)
			{
				System.out.println("Faile to initialize Chrome Driver "+e);
				return null;
			}
			
			
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			try{
			System.setProperty("webdriver.gecko.driver", "E:\\softwares\\selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			Log.debug("Loaded FireFox browser driver ");
			driver.manage().window().maximize();
			return driver ;
			}
			catch(Exception e)
			{
				System.out.println("Faile to initialize FireFox Driver "+e);
				return null;
			}
		}
		else
		{
			Log.error("Failed to Initiate Driver : Unsupported browser");
			return null;
		}
		
			
		
	}
}
