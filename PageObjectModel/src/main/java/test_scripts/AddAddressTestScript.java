package test_scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_test_data.AddressTestDataInfo;
import common_test_data.TestData;
import page_elements.AddressFormPageObjects;
import page_elements.HomePageObjects;
import page_elements.LoginPageObjects;
import page_elements.MyProfileObjects;
import utility_block.*;

public class AddAddressTestScript
{
	@Test
	public void addAndStoreInfo() throws EncryptedDocumentException, IOException, InterruptedException
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
		
		MyProfileObjects.myAddress.click();
		
		MyProfileObjects.addAdressBtn.click();

		PageFactory.initElements(driver,AddressFormPageObjects.class);
		
		WebDriverUtility ut = new WebDriverUtility();
		
		AddressFormPageObjects.nameField.sendKeys(AddressTestDataInfo.name());
		AddressFormPageObjects.houseNo.sendKeys(AddressTestDataInfo.houseNo());
		AddressFormPageObjects.street.sendKeys(AddressTestDataInfo.street());
		AddressFormPageObjects.landmark.sendKeys(AddressTestDataInfo.landmark());
		
		ut.dropDown(AddressFormPageObjects.countryDb, AddressTestDataInfo.country());
		ut.dropDown(AddressFormPageObjects.stateDb, AddressTestDataInfo.state());
		ut.dropDown(AddressFormPageObjects.cityDb, AddressTestDataInfo.city());
		
		AddressFormPageObjects.pinCode.sendKeys(AddressTestDataInfo.pincode());
		AddressFormPageObjects.phoneNumber.sendKeys(AddressTestDataInfo.phoneNumber());
		AddressFormPageObjects.addAddressBtn.click();

		HomePageObjects.accountIconBtn.click();
		HomePageObjects.logOut.click();
		
		driver.quit();
	}
}
