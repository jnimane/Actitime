package com.crm.actitime.genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Taskpage {
@FindBy(xpath="//div[.='Add New']")
private WebElement addnewbtn;

@FindBy(xpath="//div[.='+New Coustomer']")
private WebElement custnametext;

@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement descripationtext;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement descriptiontext;

@FindBy(xpath="(//div[.='- Select Customer -'])[2]")
private WebElement dropdown;
 
@FindBy(xpath="(//div[.='Our company'])[10]")
private WebElement createbtn;
 





}