package com.mercury.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	
	 public static WebDriver dr;
	
	 
	@BeforeMethod()
	public void ConnectToSite()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		dr= new ChromeDriver();
			
		 dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 dr.manage().window().maximize();
		 
		 dr.get("http://newtours.demoaut.com/");

		 
	}
	
	
	
	@Test(dataProvider="getdata",enabled=false)
	public void login(String un, String pwd) 
	{
		 dr.findElement(By.xpath("//input[@name='userName']")).sendKeys(un);
		 dr.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		 dr.findElement(By.xpath("//input[@name='login']")).click();
		 System.out.println(dr.findElement(By.xpath("//input[@name='login']")).getLocation());
		 dr.quit();
		 
	}
	

	@Test(invocationCount = 10)
	public void login() 
	{
		 dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		 dr.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		 dr.findElement(By.xpath("//input[@name='login']")).click();
		 System.out.println(dr.findElement(By.xpath("//input[@name='login']")).getLocation());
		 dr.quit();
		 
	}
	
	@DataProvider()
	public Object[][] getdata()
	{
		
		Object[][] data= new Object[2][2];
		
		data[0][0]="mercury";
		data[0][1]="mercury"; 
		return data;
	}

}
