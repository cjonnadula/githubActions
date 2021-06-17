package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Test3{
	
        @Test
    	public void testChrome1()
    {
		 ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
	WebDriver driver=new ChromeDriver(options);  
		
        driver.get("http://www.facebook.com");
        
        WebElement mailID = driver.findElement(By.id("email"));
        mailID.sendKeys("test1@gmail.com");
        
        driver.quit();
	}

	@Test
	public void testChrome2()
    {
	 ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
	
		WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("http://www.facebook.com");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
        
        WebElement mailID = driver.findElement(By.id("email"));
        mailID.sendKeys("testingDemo@gmail.com");
        
        driver.quit();
	}
	
}   
