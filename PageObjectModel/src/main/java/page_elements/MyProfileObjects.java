package page_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyProfileObjects 
{

	@FindBy(className ="r2")
	public static WebElement myProfileTable;
	
	@FindBy(partialLinkText = "My Addresses")
	public static WebElement myAddress;
	
	@FindBy(how=How.XPATH,using="//button[contains(.,'Add Address')]")
	public static WebElement addAdressBtn;
}
