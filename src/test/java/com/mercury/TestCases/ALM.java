package com.mercury.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ALM {
@Test(enabled=false)
public void _openbrowser() throws IOException
{
	WebDriver dr= new FirefoxDriver();
	dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	dr.manage().window().maximize();
	dr.get("https://sonalipat.visualstudio.com/ALM_Maturity_Agile/_queries");
	dr.findElement(By.xpath("//input[@name='loginfmt']")).sendKeys("sonalipat@cybage.com");
	dr.findElement(By.xpath("//input[@value='Next']")).click();
	dr.findElement(By.xpath("//input[@name='passwd']")).sendKeys("riya@123");
	dr.findElement(By.xpath("//input[@value='Sign in']")).click();
	dr.findElement(By.xpath(".//div[text()='Shared Queries']")).click();
	dr.findElement(By.xpath("//*[@id='tfs_tnli17']/a/div")).click();
	dr.findElement(By.xpath("//li[@aria-label='Refresh']")).click();
//dr.findElement(By.xpath(".//a[text()='Editor']")).click();
//dr.findElement(By.xpath(".//span[@aria-label='Run query']")).click();
	WebElement wi=dr.findElement(By.xpath("//div[@class='new-query-and-status-indicator']"));
	System.out.println("Query Count ::==   "+wi.getText());
	
	String str =wi.getText();
    System.out.println("My string characters  "+str.charAt(0));
    char first =str.charAt(0);
    char expected=4;
   
   
   if(first==expected)
   {
    System.out.println("matched");
   }
   else
   {
    System.out.println("better luck next time ");
   }
File scrFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
// Now you can do whatever you need to do with it, for example copy somewhere
FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
dr.close();
}

}
