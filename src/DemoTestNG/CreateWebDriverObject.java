package DemoTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class CreateWebDriverObject {
  
  
  public WebDriver driver;
  
  public void Superclass() 
  {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");  
    driver = new ChromeDriver();
    ChromeOptions copt = new ChromeOptions();
	//copt.setHeadless(true);
	copt.addArguments("start-maximized");
	copt.addArguments("disable-infobars");
  }
  
  public WebDriver getdriver()
  {
    if (driver == null)
    {
      System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\chromedriver.exe");	
      driver = new ChromeDriver();
      ChromeOptions copt = new ChromeOptions();
		//copt.setHeadless(true);
		copt.addArguments("start-maximized");
		copt.addArguments("disable-infobars");
      return driver;
    }
    
    else
    {
      return driver;
    }
  }
}
