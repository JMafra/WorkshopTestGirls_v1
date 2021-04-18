package actions;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.PaymentPage;
import utils.DriverContext;

public class PaymentAction extends PaymentPage {
	
	protected WebDriverWait wait;
	
	public PaymentAction() {
		wait = new WebDriverWait(DriverContext.getDriver(), 30);		
		
	}	
	
	public void clicarSingInCheckout() {	
		wait.until(ExpectedConditions.visibilityOf(btSigInCheckout)).click();		
    }	
		
	
	public void clicarAddressCheckout() {	
		wait.until(ExpectedConditions.visibilityOf(btAddressCheckout)).click();		
    }
	
	public void clicarShippingTerms() {	
		ckShippingTerms.click();		
    }
		
	public void clicarShippingCheckout() {	
		wait.until(ExpectedConditions.visibilityOf(btShippingCheckout)).click();		
    }
	
	public void clicarPaymentBank() {	
		wait.until(ExpectedConditions.visibilityOf(btPayByBank)).click();		
    }

	public void clicarConfirmOrder() {	
		wait.until(ExpectedConditions.visibilityOf(btConfirmOrder)).click();		
    }	
	
}
