package com.mercury.MasterPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MasterPage {
	
	
	public static WebDriver dr;
	public Properties prop;
	
	public MasterPage() throws IOException 
	{
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\mercury\\ObjectRepository\\Obj_Repo.properties");
		
		prop=new Properties();
		
		prop.load(fis);
		
		if(prop.getProperty("browser").equals("firefox"))
		{
		
         dr= new FirefoxDriver();
		}
		
		 dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 dr.manage().window().maximize();
		 
		 dr.get("http://newtours.demoaut.com/");
	}
	
	public void close_browser()
	{
		dr.close();
	}
	
	
	public void captureScreenShot(String TestCaseName) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot) dr;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./ScreenShots/"+TestCaseName+".png"));
	}

}
