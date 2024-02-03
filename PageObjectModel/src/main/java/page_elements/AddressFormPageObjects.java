package page_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressFormPageObjects 
{
	
	@FindBy(id = "Name")
	public static WebElement nameField;
		
	@FindBy(id = "House/Office Info")
	public static WebElement houseNo;
	
	@FindBy(id = "Street Info")
	public static WebElement street;
	
	@FindBy(id = "Landmark")
	public static WebElement landmark;
	
	@FindBy(id="Country")
	public static WebElement countryDb;
	
	@FindBy(id = "State")
	public static WebElement stateDb;
	
	@FindBy(id = "City")
	public static WebElement cityDb;
	
	@FindBy(id = "Pincode")
	public static WebElement pinCode;
	
	@FindBy(id = "Phone Number")
	public static WebElement phoneNumber;
	
	@FindBy(id = "addAddress")
	public static WebElement  addAddressBtn;
	
	@FindBy(xpath = "//a[contains(.,'Home')]")
	public static WebElement homeLink;


}
