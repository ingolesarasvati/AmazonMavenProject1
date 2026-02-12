package package_01.Amazon_01;

import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.RetryLogic;

public class TC_02_LoginToAmazonSearching extends BaseClass {


	@Test(retryAnalyzer=RetryLogic.class)
	public void searchingProduct() throws InterruptedException {
		Reporter.log("Browser is Launched");
		HomePage homepage= new HomePage(driver);
		homepage.hoverOverOnAccountAndList(driver);
		homepage.clickOnSignIn();
		
		LoginPage loginPage = new LoginPage(driver);

		loginPage.enteringValidUserName();
		Reporter.log("UserName is Entered");
		loginPage.continue_click();
		loginPage.enteringValidPassword();
		Reporter.log("Password  is Entered");
		loginPage.clickOnSignInButton();
		Reporter.log("Login is Successfull ");

		homepage.searchingProduct();
		Reporter.log("Product searched is Successfull");

	}

}
