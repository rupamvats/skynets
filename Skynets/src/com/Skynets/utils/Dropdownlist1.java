package com.Skynets.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist1 {

public static void SelectddlByIndex(WebElement element, int index)
{
	Select sct=new Select(element);
	sct.selectByIndex(index);
}
public static void SelectddlByVisibleText(WebElement element,String vtext)
{
	Select sct=new Select(element);
	sct.deselectByVisibleText(vtext);
}
public static void SelectddlByValue(WebElement element, String value)
{
Select sct=new Select(element);
sct.selectByValue(value);
}
//DeSelect the DropDown
public static void DeselectddlByIndex(WebElement element, int index)
{
	Select sct=new Select(element);
	sct.deselectByIndex(index);
}
public static void DeselectddlByValue(WebElement element, String value)
{
	Select sct=new Select(element);
	sct.deselectByValue(value);
}
public static void DeselectddlByVisibleText(WebElement element, String vtext)
{
	Select sct=new Select(element);
	sct.deselectByVisibleText(vtext);
}
public static void DeselectAll(WebElement element)
{
	Select sct=new Select(element);
	sct.deselectAll();
}
//verify single or multiple DroPDownList
public static boolean verifyIsmultiple(WebElement element)
{
	Select sct=new Select(element);
	boolean status=sct.isMultiple();
	return status;
}
}