package testcases;
import org.testng.annotations.Test;

import common.WebDriverBase;

public class test2 extends WebDriverBase{

	@Test 
    public void testTfact21012ADMApExCaseCreation() throws InterruptedException{
		WebDriverBase.getDriver().get("https://www.google.com");
	}
	
	@Test
    public void testMyntra() throws InterruptedException{
		WebDriverBase.getDriver().get("https://www.myntra.com");
	}
}
