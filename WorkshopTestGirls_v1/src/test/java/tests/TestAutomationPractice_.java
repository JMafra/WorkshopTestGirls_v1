package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.CreateAccountAction_;
import actions.LoginAction;
import actions.PaymentAction;
import actions.SearchItemAction;
import utils.Constants;
import utils.DriverContext;


public class TestAutomationPractice_ {

	static WebDriver driver;
	static WebDriverWait wait;
	static CreateAccountAction_ account;	
	static LoginAction login;
	static SearchItemAction search;
	static PaymentAction payment;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		driver  = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);	
		account  = new CreateAccountAction_();	
		login    = new LoginAction();	
		search   = new SearchItemAction();	
		payment  = new PaymentAction();	
		
	}

	@Test
	public void testCriarContaUsuario() throws Exception {		
		account.clicarSignIn();	
		account.preencherEmail("work07@gmail.com");
		account.clicarCreateAccount();
		account.clicarTitle();
		account.preencherFirstName("Juliana");;
		account.preencherLastName("Mafra");
		account.preencherPassword("12345");	
	    account.selecionarDay("5");		
	    account.selecionarMonth("4");			
		account.selecionarYear("1990");		
		account.preencherCompany("Accenture");
		account.preencherAddress01("Av Conselheiro Aguiar");
		account.preencherAddress02("Ap 501");	
		account.preencherCity("Recife");			
		account.selecionarState("California");
		account.preencherPostCode("55555");
		account.preencherAditionalInformation("informacao adicional");
		account.preencherPhone("3333-4455");
		account.preencherMobilePhone("88888-9999");
		account.preencherReference("proximo ao extra");
		account.clicarSubmit();	
		
		account.validarUsuario("Juliana Mafra");
		account.clicarSignOut();
		
		
	}
	
	@Test
	public void testRealizarLogin() throws Exception {
		
		login.clicarLinkSignIn();
		login.preencherEmail("arthur06@gmail.com");
		login.preencherPassword("12345");
		login.clicarSignIn();		
		
	}
	
	@Test
	public void testPesquisarItem() throws Exception {		
		login.clicarLinkSignIn();
		login.preencherEmail("arthur06@gmail.com");
		login.preencherPassword("12345");
		login.clicarSignIn();	
		
		search.preencherSearch("dresses");
		search.clicarPrintedDress();
		search.selecionarDressQtde();
		search.selecionarDressSize("M");
		search.clicarAddCart();
		search.clicarCheckout();
		
		payment.clicarSingInCheckout();
		payment.clicarAddressCheckout();
		payment.clicarShippingTerms();
		payment.clicarShippingCheckout();
		payment.clicarPaymentBank();
		payment.clicarConfirmOrder();
	}
	
//	@Test
//	public void testRealizarPagamento() throws Exception {	
//	
//	}
	
	@After
	public void tearDownAfterClass() throws Exception {
		//driver.close();
	}
	

}
