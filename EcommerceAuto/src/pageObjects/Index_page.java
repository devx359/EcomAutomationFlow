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

	public static WebElement link_SignIn()
	{
		
		WebElement element = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		return element;
	}
	
	public static WebElement link_SignOut()
	{
		WebElement element = driver.findElement(By.xpath("//a[@title='Log me out']"));
		return element;
	}
	
	public static WebElement link_CustomerAccount()
	{
		WebElement element = driver.findElement(By.xpath("//a[@title='View my customer account']"));
		return element;
	}
	
	public static WebElement link_OrderHistyoryAndDetails()
	{
		WebElement element = driver.findElement(By.xpath("//a[@title='Orders']"));
		return element;
	}
	
	public static WebElement link_MyCreditSlips()
	{
		return driver.findElement(By.xpath("//a[@title='Credit slips']"));		
	}
	
	public static WebElement link_MyAddresses()
	{
		return driver.findElement(By.xpath("//a[@title='Addresses']"));		
	}
	
	public static WebElement link_MyPersonalInformation()
	{
		return driver.findElement(By.xpath("//a[@title='Information']"));		
	}
	
	public static WebElement link_MyWishLists()
	{
		return driver.findElement(By.xpath("//a[@title='My wishlists']"));		
	}
	
	public static WebElement link_Home()
	{
		return driver.findElement(By.xpath("//a[@title='Home']"));		
	}
	
	public static WebElement link_Cart()
	{
		return driver.findElement(By.xpath("//a[@title='View my shopping cart']"));		
	}
	
	public static WebElement txtbox_Search()
	{
		return driver.findElement(By.id("search_query_top"));		
	}
	
	public static WebElement button_SearchSubmit()
	{
		return driver.findElement(By.xpath("//button[@name='submit_search']"));		
	}
	
	 	 
}
