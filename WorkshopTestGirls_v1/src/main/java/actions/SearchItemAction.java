package actions;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.SearchItemPage;
import utils.DriverContext;

public class SearchItemAction extends SearchItemPage {
	
	protected WebDriverWait wait;
	
	public SearchItemAction() {
		wait = new WebDriverWait(DriverContext.getDriver(), 30);		
		
	}	
	
	public void preencherSearch(String email) {	
		wait.until(ExpectedConditions.visibilityOf(txtSearch)).sendKeys(email);
		txtSearch.sendKeys(Keys.ENTER);
    }	
	
	public void clicarPrintedDress() {
		for (WebElement link : itensList.findElements(By.tagName("a"))) {

			if (link.getText().contains("Printed Chiffon Dress")) {
				link.click();
				break;
			}
		}		
	}
	
	public void selecionarDressQtde() throws InterruptedException {			
		wait.until(ExpectedConditions.visibilityOf(btQtde)).click();			
		
	}	
	
	public void selecionarDressSize(String size) {		
		Select cbSize2  = new Select(cbSize);
		cbSize2.selectByVisibleText(size);
    }	
	
	public void clicarAddCart() {
		wait.until(ExpectedConditions.elementToBeClickable(btAddCart)).click();
	}
	
	public void clicarCheckout() {	
		wait.until(ExpectedConditions.visibilityOf(btCheckout)).click();		
    }	
	
}
