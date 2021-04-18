package actions;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LoginPage;
import utils.DriverContext;

public class LoginAction extends LoginPage {
	
	protected WebDriverWait wait;
	
	public LoginAction() {

		wait = new WebDriverWait(DriverContext.getDriver(), 30);		
		
	}	
	
	public void clicarLinkSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSignIn)).click();
	}	
	
	public void preencherEmail(String email) {	
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
    }
	
	
	public void preencherPassword(String password) {	
		wait.until(ExpectedConditions.visibilityOf(txtPassword)).sendKeys(password);
    }	
	
	public void clicarSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(btSignIn)).click();
	}	
	
}
