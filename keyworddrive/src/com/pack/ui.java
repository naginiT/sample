package com.pack;





import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ui {
	
	WebDriver driver;
	public ui(WebDriver driver){
		this.driver = driver;
	}
	
	public void perform(Properties prop,String operation,String objectname,String value)
	{
		
		
		
		if(operation.equalsIgnoreCase("setuser"))
		{
			
		
		driver.findElement(By.name(prop.getProperty(objectname))).sendKeys(value);
		}
		else if(operation.equalsIgnoreCase("setpassword"))
		{
			driver.findElement(By.name(prop.getProperty(objectname))).click();

		}
		else if(operation.equalsIgnoreCase("gotourl"))
		{
			driver.get(prop.getProperty(value));

		}
		else
		{
			System.out.println("fail");
		}
	}




}

