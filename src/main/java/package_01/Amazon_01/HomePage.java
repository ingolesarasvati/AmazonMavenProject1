package package_01.Amazon_01;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	public WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	WebElement accountAndList;

	@FindBy(xpath = "//span[@class='nav-action-inner']")
	WebElement signInFromaccountAndList;
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchtextBox;
	@FindBy(xpath = "//span[text()='Sign Out']")
	WebElement signOut;

	public void hoverOverOnAccountAndList(WebDriver driver) {
		wait.until(ExpectedConditions.visibilityOf(accountAndList));
		Actions a1 = new Actions(driver);

		a1.moveToElement(accountAndList).perform();

	}

	public void clickOnSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(signInFromaccountAndList));
		signInFromaccountAndList.click();

	}

	public void searchingProduct() {
		wait.until(ExpectedConditions.visibilityOf(searchtextBox));
		searchtextBox.sendKeys("Shoes" + Keys.ENTER);
	}

	public void clickOnSignOut() {
		wait.until(ExpectedConditions.elementToBeClickable(signOut));
		signOut.click();
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

}
