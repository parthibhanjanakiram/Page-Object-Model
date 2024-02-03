package test_scripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_test_data.TestData;
import page_elements.HomePageObjects;
import page_elements.LoginPageObjects;
import page_elements.MyProfileObjects;

public class GetMyProfileTableTestScript 
{

	@Test
	public void ProfileTableScrnSht() throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(TestData.url());

		PageFactory.initElements(driver, LoginPageObjects.class);   

		//login

		LoginPageObjects.outerLoginButton.click();

		LoginPageObjects.email.sendKeys(TestData.email());

		LoginPageObjects.password.sendKeys(TestData.password());

		LoginPageObjects.innerLoginButton.click();

		PageFactory.initElements(driver, HomePageObjects.class);

		Thread.sleep(2000);

		//home

		HomePageObjects.accountIconBtn.click();

		HomePageObjects.myProfile.click();

		//my profile

		PageFactory.initElements(driver, MyProfileObjects.class);
		
		Thread.sleep(1000);

		TakesScreenshot shot = (TakesScreenshot) MyProfileObjects.myProfileTable;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File perm = new File("./pom screenshots/profile_tab2.png");
		FileHandler.copy(src, perm);
		
		driver.quit();
	}
}
