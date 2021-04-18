package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class SearchItemPage {

	public SearchItemPage() {

		PageFactory.initElements(DriverContext.getDriver(), this);
	}

	@FindBy(how = How.ID, using = "search_query_top")
	protected WebElement txtSearch;

	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul")
	protected WebElement itensList;

	@FindBy(how = How.XPATH, using = "//*[@id=\"fancybox-frame1586645245031\"]")
	protected WebElement frameDressDetail;

	@FindBy(how = How.XPATH, using = "//p[@id=\"quantity_wanted_p\"]/a[2]")
	protected WebElement btQtde;

	@FindBy(how = How.ID, using = "group_1")
	protected WebElement cbSize;

	@FindBy(how = How.NAME, using = "Submit")
	protected WebElement btAddCart;

	@FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	protected WebElement btCheckout;

}
