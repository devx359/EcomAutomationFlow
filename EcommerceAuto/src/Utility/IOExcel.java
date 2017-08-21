/**
 * EcommerceAuto 2017
 * 
 */
package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author debo
 * Aug 20, 2017
 * 
 */
public class IOExcel {
	
	private static XSSFWorkbook wbook,wbookop;
	private static XSSFSheet sheet;
	private static File source;
	private static FileInputStream input;
	private static FileOutputStream output;
	private static XSSFCell cell;
	private static XSSFRow crow;
	private static String excelfilepath;
	
	public static void  excelSetup(String filePath)
	{
		 try {
			 excelfilepath=filePath;
			 input = new FileInputStream(filePath);			 		
			 wbook=new XSSFWorkbook(input);			
			// sheet=wbook.getSheet(sheetname);
			
		} catch (Exception e) {
			Log.error("File Initialization constructor failed due to : "+e);
		}
		 
	}
	
	public static String getExcelData(int row,int col,String sheetname)
	{
		String cellvalue=null;
		
		try {
			sheet=wbook.getSheet(sheetname);
	//		sheet.setSelected(true);
			cellvalue=sheet.getRow(row).getCell(col).getStringCellValue();
		} catch (Exception e) {						
			Log.error("Excel file data problem: "+e);
			e.printStackTrace();
		}
		return cellvalue;
	}
	

	
	public static void setExcelData( int row,int columnIndex,String stringValue,String sheetname)
	{
			
		try {
			sheet=wbook.getSheet(sheetname);
		//	sheet.setSelected(true);
			crow = sheet.getRow(row);
			cell = crow.getCell(columnIndex, MissingCellPolicy.RETURN_NULL_AND_BLANK);
			if(cell==null)
			{
				crow.createCell(columnIndex).setCellValue(stringValue);
			}
			else {
				cell.setCellValue(stringValue);
			}
			
			output=new FileOutputStream(excelfilepath);
			wbook.write(output);
			output.flush();
			output.close();
		
		} 
		catch (Exception e) {
			Log.error("Excel write problem : "+e);
			e.printStackTrace();
		}
		
	}
	
	

}
