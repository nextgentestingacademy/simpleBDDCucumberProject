package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class DashboardPage extends BasePage{
	
	private final By btnAssignLeave = By.xpath("//button[@title='Assign Leave']");
	private final By btnLeaveList = By.xpath("//button[@title='Leave List']");
	private final By btnTimesheets = By.xpath("//button[@title='Timesheets']");
	private final By btnApplyLeave = By.xpath("//button[@title='Apply Leave']");
	private final By btnMyLeave = By.xpath("//button[@title='My Leave']");
	private final By btnMyTimesheet = By.xpath("//button[@title='My Timesheet']");
	
	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean assignLeaveIsDisplayed() {
		return waitForVisible(btnAssignLeave);
	}
	
	public boolean leaveListIsDisplayed() {
		return waitForVisible(btnLeaveList);
	}
	
	public boolean timesheetsIsDisplayed() {
		return waitForVisible(btnTimesheets);
	}
	
	public boolean applyLeaveIsDisplayed() {
		return waitForVisible(btnApplyLeave);
	}
	
	public boolean myLeaveIsDisplayed() {
		return waitForVisible(btnMyLeave);
	}
	
	public boolean myTimesheetIsDisplayed() {
		return waitForVisible(btnMyTimesheet);
	}
}