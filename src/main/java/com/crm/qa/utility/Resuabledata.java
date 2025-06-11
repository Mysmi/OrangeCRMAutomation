package com.crm.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.BaseClass;

public class Resuabledata extends BaseClass {
	
//	public static void main(String [] argrm) {
//		
//		getdata(Data);
//	}
	static int count =1;
	
	public static String Testdata_sheet_path="C:/Users/aaa/Javaspace/OrangeCRMFramework/src/main"
			+"/java/com/crm/qa/test/testdata/Bank SPOC details as on Feb 12th, 2025.xlsx";
	
	static Workbook book;
	static  Sheet sheet;
	
	public static void Screnshot()  {
		
		TakesScreenshot sc =(TakesScreenshot)driver;
				File sr=sc.getScreenshotAs(OutputType.FILE);
				String currentDir = System.getProperty("user.dir");
				 try {
			            FileUtils.copyFile(sr, new File(currentDir+"./Screenshots/"+ "Screenshot ="+ count+".png"));
			        } catch (java.io.IOException e) {
			            e.printStackTrace();
			        }
				 count++;
				 }
	
	
	public static Object[][] getdata(String sheetName){
		
		FileInputStream file=null;
		try {
			file=new FileInputStream(Testdata_sheet_path);
		}
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			book=WorkbookFactory.create(file);
		}
          
		 catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sheet=book.getSheet(sheetName);
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	
		
		
	}

}
