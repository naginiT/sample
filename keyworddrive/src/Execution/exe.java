package Execution;



	import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.pack.excelFile;
import com.pack.ui;

import propertiesfile.loadproperties;

	public class exe {
		
		@Test
		public void exe() throws Exception
		{
		System.setProperty("webdriver.chrome.driver","D:\\Vishnu vardhan\\jarfiles\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	   options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		 excelFile file = new excelFile();
		 loadproperties object = new loadproperties();
	     Properties allObjects =  object.getObjectRepository();
	     ui	 operation = new ui(driver);
	     XSSFSheet sheet = file.readExcel("C:\\Users\\NSSS KKISHORE\\Downloads\\KeywordDrivenFramework\\Book1.xlsx", "Sheet1");
	     int rowcount=sheet.getLastRowNum();
	     System.out.println(rowcount);
	 	for (int i = 1; i < rowcount+1; i++) {
			//Loop over all the rows
			//Row row = sheet.getRow(i);
	 		Row row = sheet.getRow(i);
	 		System.out.println(i);
			//Check if the first cell contain a value, if yes, That means it is the new testcase name
			if(row.getCell(0).toString().length()==0){
			//Print testcase detail on console
				System.out.println(row.getCell(1).toString()+"----"+ row.getCell(2).toString()+"----"+
				row.getCell(3).toString()+"----"+ row.getCell(4).toString());
			//Call perform function to perform operation on UI
				operation.perform(allObjects, row.getCell(1).toString(), row.getCell(2).toString(),
					row.getCell(3).toString());
			}
	 	   }
		}


}
