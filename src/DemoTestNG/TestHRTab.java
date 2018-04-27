package DemoTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestHRTab extends CreateWebDriverObject {
 //@Test
	public void clickonHRTab()
	{
	driver.findElement(ObjectRepository.HrTab).click();
	Reporter.log("CLicked on the HR tab.");
	}
}
