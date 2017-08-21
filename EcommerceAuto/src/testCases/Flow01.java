package testCases;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.BaseClass;
import Utility.Browser;
import Utility.ExtentManager;
import Utility.IOExcel;
import Utility.Log;
import Utility.Screenshot;

public class Flow01 {
	String testCaseName;
	ExtentReports reports;
	ExtentTest test;
	IOExcel excelob;
	
	@BeforeSuite
	public void startup()
	{
		WebDriver	driver = Browser.getDriver("chrome");
		new BaseClass(driver);
		reports = ExtentManager.GetExtent();
		IOExcel.excelSetup("E:\\testdata\\data4.xlsx");
		
	}
	@BeforeMethod
	public void init(Method method)
	{
		testCaseName =method.getName();
		Log.startLogForThisCase(testCaseName);
		if(reports!=null)
		{
		test=reports.createTest(testCaseName);
		}
		else System.out.println("reports obj is null");
		
		
	}
  @Test
  public void fuck1() {
	 // excelob = new IOExcel("E:\\testdata\\data4.xlsx");
	  
	 /* BaseClass.driver.get("http://google.co.in");
	  String path=Screenshot.screenShot(BaseClass.driver,"fuck1login" );
	  try {
		test.addScreenCaptureFromPath(path);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  */
	  System.out.println("Excel data: "+IOExcel.getExcelStringData( 1, 1, "Sheet1"));
	  IOExcel.setExcelStringData( 1, 15, "xxxxxlueeee set fuckeeers", "Sheet1");
	  Log.info("Written to sheet 1");
	 /* Log.info("Inside "+testCaseName);
	  Log.debug("inside debug 1");
	  test.debug("Inside "+testCaseName);*/
	  test.pass("Passed with flying colors");
	  
  }
  @Test
  public void fuck2() {
	  //IOExcel.excelSetup("E:\\testdata\\data4.xlsx", 0);
	 /* BaseClass.driver.get("http://facebook.com");
	  String path=Screenshot.screenShot(BaseClass.driver,"fuck2login" );
	  try {
		test.addScreenCaptureFromPath(path);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	 
	  System.out.println("Excel data: "+IOExcel.getExcelStringData( 2, 1, "Sheet1"));
	  IOExcel.setExcelStringData(16, 5, "kkkStuff is working", "Sheet2");
	  Log.info("Written to sheet 1");
	  IOExcel.setExcelIntData(8,5, 77777, "Sheet2");
	  Log.info("Written to sheet 2");
	  System.out.println(IOExcel.getExcelIntData(2, 2, "Sheet2"));
	  
	  /* Log.info("Inside "+testCaseName);
	  Log.debug("inside debug 2");
	  test.debug("Inside "+testCaseName);*/
	  test.pass("Passed with flying colors");
	  
  }
  @AfterMethod
  public void exit()
  {
	  Log.endLoggForThisCase();
	//  excelob.teardown();
	 
  }
  @AfterSuite
  public void teardown()
  {
	  reports.flush();
	  
	  BaseClass.driver.quit();
  }
}
