package com.ecom.project.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dd {

	public static void selectByVtest(WebElement ele,String text)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
}
