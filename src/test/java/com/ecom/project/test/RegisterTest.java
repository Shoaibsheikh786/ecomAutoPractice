package com.ecom.project.test;

import org.testng.annotations.Test;

import com.ecom.project.base.SetUp;
import com.ecom.project.pages.Register;

public class RegisterTest extends SetUp{
	
	Register obj1;
	
	RegisterTest() {
		intilization();      //    open chrome and url 
		obj1=new Register();
	}
	
	
	@Test(priority=1)
	public void clickOnRegister()
	{
		obj1.clickOnRegister();
	}
	
	
	/** @author Vishali -K ,, call those methods which you have created in Register Page*/
     /** also give prioriy -->2,,3 */
	
	
}
