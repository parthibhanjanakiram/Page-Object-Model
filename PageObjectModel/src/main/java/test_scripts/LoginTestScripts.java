package test_scripts;

import org.testng.annotations.Test;

import common_test_data.TestData;
import page_elements.LoginPageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class LoginTestScripts 
{

	@Test
	public void login() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.get(TestData.url());
		
		PageFactory.initElements(driver, LoginPageObjects.class);   
		
	//we want to give driver control to the class which has page object elements,if not we will get run-time Error (null pointer exception).becoz @Findby need driver.
		
		LoginPageObjects.outerLoginButton.click();
		
		LoginPageObjects.email.sendKeys(TestData.email());
		
		LoginPageObjects.password.sendKeys(TestData.password());
		
		LoginPageObjects.innerLoginButton.click();
		
		driver.quit();
	}
}
