package stepdefinitions;

import base.DriverFactory;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    @Given("the application is open")
    public void the_application_is_open() {
        loginPage = new LoginPage(DriverFactory.getDriver());
    }

    @When("I enter username {string}")
    public void i_enter_username(String username) {
        loginPage.enterUsername(username);
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("I should see the dashboard")
    public void i_should_see_the_dashboard() {
        Assert.assertTrue(
                DriverFactory.getDriver().getCurrentUrl().contains("dashboard")
        );
    }

    @Then("I should not see the dashboard")
    public void i_should_not_see_the_dashboard() {
        Assert.assertFalse(
                DriverFactory.getDriver().getCurrentUrl().contains("dashboard")
        );
    }
}
