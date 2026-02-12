package utility;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass extends ListenersLogic {


	@Parameters("browserName")
	@BeforeMethod
	public void browserLaunch(String whichBrowser) throws InterruptedException {
	    if(whichBrowser.equals("chrome")) {
		 driver= new ChromeDriver();
		
	}
	
         if(whichBrowser.equals("edge")) {
	           
        	   driver= new EdgeDriver();
         }
         if(whichBrowser.equals("firefox")) {
	           
      	   driver= new FirefoxDriver();
       }
         
         driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void browserQuit() throws InterruptedException {
		driver.quit();
	}

}
