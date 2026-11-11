package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage {
	@FindBy(id = "user-name")
	WebElement usernameField;
	@FindBy(id = "password")
	WebElement passwordField;
	@FindBy(id = "login-button")
	WebElement loginButton;
	public LoginPage() {
		PageFactory.initElements(BaseClass.driver,this);
	}
	public void enterUsername(String user) {
		usernameField.sendKeys(user);
	}
	public void enterPassword(String pwd) {
		passwordField.sendKeys(pwd);
	}
	public void ClickLoginButton() {
		loginButton.click();
	}
}
