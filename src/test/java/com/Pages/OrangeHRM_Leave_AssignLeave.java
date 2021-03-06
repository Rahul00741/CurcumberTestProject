package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.SeleniumReusableFuntion.SeleniumUtility;



public class OrangeHRM_Leave_AssignLeave

{
	/**
	 *@author Rahul
	 */
		
		WebDriver driver;
		
		SeleniumUtility selut = new SeleniumUtility(driver);

		public OrangeHRM_Leave_AssignLeave (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="menu_leave_viewLeaveModule")
		WebElement LeaveLink;
		
		@FindBy(xpath="//a[text()='Assign Leave']")
		WebElement Leave_AssignLeave;
		
		@FindBy(id="assignleave_txtEmployee_empName")
		WebElement Leave_AssignLeave_EmployeeName;
		
//		@FindBy(id="assignleave_txtLeaveType")
//		WebElement Leave_AssignLeave_LeaveType;
		
		@FindBy(xpath="(//select[@id='assignleave_txtLeaveType'])/option[@value='2']")
		WebElement Leave_AssignLeave_LeaveType;
		
		@FindBy(id="assignleave_txtFromDate")
		WebElement Leave_AssignLeave_FromDate;
		
		@FindBy(id="assignleave_txtToDate")
		WebElement Leave_AssignLeave_ToDate;
		
		@FindBy(id="assignleave_duration_duration")
		WebElement Leave_AssignLeave_Duration;
		
		@FindBy(id="assignleave_txtComment")
		WebElement Leave_AssignLeave_Comments;
		 
		@FindBy(id="assignBtn")
		WebElement Leave_AssignLeave_Assignbtn;
		
		
		
		//click on Leave Tab in Application 
		public void Leave_leavelink(){
			LeaveLink.click();
		}
		
		//click on Assign Leave in Leave Tab
		public void Leave_AssignLeave()
		{
			Leave_AssignLeave.click();
		}
		
		//Enter the employee name
		public void Leave_AssignLeave_EmployeeName(String emp)
		{
			Leave_AssignLeave_EmployeeName.sendKeys(emp);
		}
		
		
		//Select Leave Type
				public void Leave_AssignLeave_LeaveTypeDropdwon(String value)
				{
					selut.selectDropDownByValue(Leave_AssignLeave_LeaveType, value);
				}
		
		
		//Select From Date  
		public void Leave_AssignLeave_FromDate(String date)
		{
			Leave_AssignLeave_FromDate.clear();
			Leave_AssignLeave_FromDate.sendKeys(date);
		}
		
		
		
		//Select Leave To Date
		public void Leave_AssignLeave_ToDate(String date)
		{
			Leave_AssignLeave_ToDate.clear();
			Leave_AssignLeave_ToDate.sendKeys(date);
		}
		
		
		
		//Add comments
		public void Leave_AssignLeave_Comments(String cmt)
		{
			Leave_AssignLeave_Comments.sendKeys(cmt);
		}
		
		//Click on Assign Button
		public void Leave_AssignLeave_Assignbtn()
		{
			Leave_AssignLeave_Assignbtn.click();
		}
}
