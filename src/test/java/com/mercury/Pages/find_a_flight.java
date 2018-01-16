package com.mercury.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mercury.MasterPage.MasterPage;

public class find_a_flight extends MasterPage {
    private String username;
	private String Password;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public void login()
	{ 
		
		setUsername(prop.getProperty("username"));
		setPassword(prop.getProperty("password"));
		senddata("username_textbox_xpath",getUsername());
		senddata("password_textbox_xpath",getPassword());
		click("signin_button_xapth");
		
	}
	
	public void senddata(String element,String input)
	{
		dr.findElement(By.xpath(prop.getProperty(element))).sendKeys(input);
	}
	
	public void click(String button)
	{
		dr.findElement(By.xpath(prop.getProperty(button))).click();
	}
	
    
	public find_a_flight() throws IOException {
		
	}

	public void find_flight()
	{
		//select radio button
		
		
	}
	
}
