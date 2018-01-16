package com.mercury.Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.mercury.MasterPage.MasterPage;

public class Login extends MasterPage {
	
	public Login() throws IOException {
		

	}

	public void login_page()
	{
		 dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("rcury");
		 dr.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		 dr.findElement(By.xpath("//input[@name='login']")).click();
	}
}
