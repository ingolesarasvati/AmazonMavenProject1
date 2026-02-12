package package_01.Amazon_01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	public WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@FindBy(name = "email")
	WebElement username;

	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement continueButton;

	@FindBy(xpath= "//input[@id='ap_password']")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement signinButton;

	public void enteringValidUserName() {

		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("+917841857026");
	}

	public void continue_click() {
		wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		continueButton.click();
	}

	public void enteringValidPassword() {
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("Saras@12345");
	}

	public void clickOnSignInButton() {
		wait.until(ExpectedConditions.elementToBeClickable(signinButton));
		signinButton.click();
	}

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

}
