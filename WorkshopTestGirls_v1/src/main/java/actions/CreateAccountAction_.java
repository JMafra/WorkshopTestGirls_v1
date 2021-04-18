package actions;


import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CreateAccountPage_;
import utils.DriverContext;

public class CreateAccountAction_ extends CreateAccountPage_ {
	
	protected WebDriverWait wait;
	
	public CreateAccountAction_() {
		
		wait = new WebDriverWait(DriverContext.getDriver(), 30);		
		
	}	
	
	public void clicarSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSignIn)).click();
	}	
	
	public void preencherEmail(String email) {	
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
    }
	
	public void clicarCreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(btCreateAccount)).click();
	}
	

	public void clicarTitle() {
		wait.until(ExpectedConditions.elementToBeClickable(radioTitle)).click();
	}
	
	public void preencherFirstName(String firstName) {	
		wait.until(ExpectedConditions.visibilityOf(txtFirstName)).sendKeys(firstName);
    }
	
	public void preencherLastName(String lastName) {	
		wait.until(ExpectedConditions.visibilityOf(txtLastName)).sendKeys(lastName);
    }
	
	public void preencherPassword(String password) {	
		wait.until(ExpectedConditions.visibilityOf(txtPassword)).sendKeys(password);
    }	
	
	public void selecionarDay(String day) {	
		Select cbDay  = new Select(cbDays);
		cbDay.selectByValue(day);
    }
	
	public void selecionarMonth(String month) {	
		Select cbMonth  = new Select(cbMonths);
		cbMonth.selectByValue(month);
    }	
	
	public void selecionarYear(String year) {	
		Select cbYear  = new Select(cbYears);
		cbYear.selectByValue(year);
    }	
	
	public void preencherCompany(String company) {	
		wait.until(ExpectedConditions.visibilityOf(txtCompany)).sendKeys(company);
    }
	
	public void preencherAddress01(String address01) {	
		wait.until(ExpectedConditions.visibilityOf(txtAddress01)).sendKeys(address01);
    }
	
	
	public void preencherAddress02(String address02) {	
		wait.until(ExpectedConditions.visibilityOf(txtAddress02)).sendKeys(address02);
    }
	
	public void preencherCity(String city) {	
		wait.until(ExpectedConditions.visibilityOf(txtCity)).sendKeys(city);
    }
	
	public void selecionarState(String state) {				
	//	Select cbState2  = new Select(wait.until(ExpectedConditions.elementToBeSelected(cbState)));
		Select cbState2  = new Select(cbState);
		cbState2.selectByVisibleText(state);
    }	
	
	
	public void preencherPostCode(String postCode) {	
		wait.until(ExpectedConditions.visibilityOf(txtPostCode)).sendKeys(postCode);
    }	
	
	public void preencherAditionalInformation(String other) {	
		wait.until(ExpectedConditions.visibilityOf(txtOther)).sendKeys(other);
    }
	
	public void preencherPhone(String phone) {	
		wait.until(ExpectedConditions.visibilityOf(txtPhone)).sendKeys(phone);
    }
	
	public void preencherMobilePhone(String mobilePhone) {	
		wait.until(ExpectedConditions.visibilityOf(txtMobilePhone)).sendKeys(mobilePhone);
    }
	
	public void preencherReference(String reference) {	
		wait.until(ExpectedConditions.visibilityOf(txtReference)).sendKeys(reference);
    }
	
	
	public void clicarSubmit() {
		wait.until(ExpectedConditions.elementToBeClickable(btSubmitAccount)).click();
	}
	
	public void clicarSignOut() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSignOut)).click();
	}
	
	public void validarUsuario(String nome) {
		Assert.assertTrue(nome.equals(lblUser.getText()));
	}
	
	
}
