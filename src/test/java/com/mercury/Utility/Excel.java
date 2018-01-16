package com.mercury.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {

	@Test
	public void ReadExcel() throws IOException
	{
		
	     FileInputStream fis= new FileInputStream("D:\\Automation\\selenium_workspace\\demoaut\\src\\test\\java\\com\\mercury\\TestData\\TestData.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sh= wb.getSheet("AllTestCases");
		
		int TotalRow= sh.getPhysicalNumberOfRows();
		int TotaCol= sh.getRow(0).getPhysicalNumberOfCells();
		
		
		
		
		
		
	}
	
	
}
