package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	protected WebElement linkSignIn;

	@FindBy(how = How.ID, using = "email")
	protected WebElement txtEmail;

	@FindBy(how = How.ID, using = "passwd")
	protected WebElement txtPassword;

	@FindBy(how = How.ID, using = "SubmitLogin")
	protected WebElement btSignIn;

}
