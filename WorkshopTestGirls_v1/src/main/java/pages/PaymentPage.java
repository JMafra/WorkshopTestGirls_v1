package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class PaymentPage {

	public PaymentPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]")
	protected WebElement btSigInCheckout;

	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button")
	protected WebElement btAddressCheckout;

	@FindBy(how = How.XPATH, using = "//input[@id=\"cgv\"]")
	protected WebElement ckShippingTerms;

	@FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button")
	protected WebElement btShippingCheckout;

	@FindBy(how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	protected WebElement btPayByBank;

	@FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button")
	protected WebElement btConfirmOrder;

}
