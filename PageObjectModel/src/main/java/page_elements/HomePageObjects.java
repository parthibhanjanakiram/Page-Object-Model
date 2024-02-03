package page_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects 
{

	@FindBy(id = "search")
	public static WebElement searchBar;
	
	@FindBy(id = "cartIcon")
	public static WebElement cartIcon;
	
	@FindBy(xpath = "(//*[name()='svg'])[3]")
	public static WebElement accountIconBtn;
	
	@FindBy(xpath = "//li[contains(.,'My Profile')]")
	public static WebElement myProfile;                   //which is located in the account icon drop down box
	
	@FindBy(xpath = "(//li[@role='menuitem'])[7]")
	public static WebElement logOut;
}
