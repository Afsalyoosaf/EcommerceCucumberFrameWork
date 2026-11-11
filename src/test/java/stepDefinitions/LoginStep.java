package stepDefinitions;

import org.testng.Assert;

import Pages.LoginPage;
import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass{
	LoginPage loginPage;
	@Given("I am on the SauceDemo login page")
	public void i_am_on_the_login_page() {
		initliazeDriver();
		driver.get("https://www.saucedemo.com/");
		loginPage = new LoginPage();
	}
	@When("I enter username {string} and password {string}")
	public void i_enter_username_password(String user, String pass) {
		loginPage.enterUsername(user);
		loginPage.enterPassword(pass);
	}
	@When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.ClickLoginButton();
    }
	@Then("I should be navigated to the inventory page")
    public void i_should_be_navigated_to_the_inventory_page() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory.html"));
        tearDown();
    }
	@Then("I should see an error message")
    public void i_should_see_an_error_message() {
        // Simple assertion to verify we are still stuck on the login page or error exists
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.equals("https://www.saucedemo.com/"));
        tearDown();
    }
}
