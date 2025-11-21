package stepdefinitions;

import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Then;
import pages.DashboardPage;

public class DashboardSteps {

    private DashboardPage dashboardPage= new DashboardPage(DriverFactory.getDriver());

    @Then("I should see Assign Leave button")
    public void i_should_see_assign_leave_button() {
    	Assert.assertTrue(dashboardPage.applyLeaveIsDisplayed());
    }
    @Then("I should see Leave List button")
    public void i_should_see_leave_list_button() {
    	Assert.assertTrue(dashboardPage.leaveListIsDisplayed());
    }
    @Then("I should see Timesheets button")
    public void i_should_see_timesheets_button() {
    	Assert.assertTrue(dashboardPage.timesheetsIsDisplayed());
    }
    @Then("I should see Apply Leave button")
    public void i_should_see_apply_leave_button() {
    	Assert.assertTrue(dashboardPage.applyLeaveIsDisplayed());
    }
    @Then("I should see My Leave button")
    public void i_should_see_my_leave_button() {
    	Assert.assertTrue(dashboardPage.myLeaveIsDisplayed());
    }
    @Then("I should see My Timesheet button")
    public void i_should_see_my_timesheet_button() {
    	Assert.assertTrue(dashboardPage.myTimesheetIsDisplayed());
    }    
}