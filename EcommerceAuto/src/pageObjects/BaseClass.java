/**
 * 
 */
package pageObjects;

import org.openqa.selenium.WebDriver;

/**
 * @author debo
 *
 *
 */
public class BaseClass {

	public static WebDriver driver;
	
	public BaseClass(WebDriver driverparam)
	{
		driver=driverparam;
	}
}
