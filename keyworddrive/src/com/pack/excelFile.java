package com.pack;



	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.hssf.usermodel.HSSFWorkbook;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class excelFile {
		
		public XSSFSheet readExcel(String filePath,String sheetName) throws IOException{
	//	File file =	new File(filePath);
		FileInputStream inputStream = new FileInputStream(filePath);
		XSSFWorkbook wb = null;
		
		wb = new XSSFWorkbook(inputStream);
		 System.out.println("hai");
		XSSFSheet  sheet = wb.getSheet(sheetName);
		 return sheet;	
		}
	}



