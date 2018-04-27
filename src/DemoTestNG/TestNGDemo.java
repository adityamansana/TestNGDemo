package DemoTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class TestNGDemo extends CreateWebDriverObject  {
	//WebDriver driver;
	  @Test
	  public void login() {
		
		  getdriver().findElement(ObjectRepository.txtBox_Username).sendKeys(Keywords.username);
		  getdriver().findElement(ObjectRepository.txtBoxPassword).sendKeys(Keywords.password);
		  getdriver().findElement(ObjectRepository.btnLogin).click();
		  TestHRTab.clickonHRTab();
		  Reporter.log("Logged in to the website");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		 // System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");
		  // driver = new ChromeDriver();
		  getdriver().get("http://demo.sentrifugo.com");
		  Reporter.log("Redirected to the website");
		   //http://beust.com/eclipse
	  }

	  @AfterMethod
	  public void afterMethod() {
		  Reporter.log("Test has been completed.");
	  }

}
