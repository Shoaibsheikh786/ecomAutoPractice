package com.ecom.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.project.base.SetUp;

public class Register extends SetUp {
	
	//1. Constructor 
	
	public Register()
	{
		PageFactory.initElements(driver,this);
	}
   
	
	//WebElements 
	@FindBy(xpath="//a[@class='ico-register']")
	WebElement Register;
	
	/** @author Vishali - K*/
	
	//1. Find element Gender(radio)--> click , for input--->send Keys
	
	
	
	//Actions 
	public void clickOnRegister()
	{
		Register.click();
	}
}
