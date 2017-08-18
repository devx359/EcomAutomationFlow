package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Index_page extends BaseClass
{
	//initialize baseclass 
	public Index_page(WebDriver driverparam) {
		super(driverparam);
		
	}

	public static WebElement button_SignIn()
	{
		
		WebElement element = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		return element;
	}
}
