package page_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects
{

	// email , password, login button elements 
	
	@FindBy(how=How.NAME,using="loginBtn")	          
	public static WebElement outerLoginButton;
	
	@FindBy(id = "Email")
	public static WebElement email;
	
	@FindBy(id = "Password")
	public static WebElement password;
	
	@FindBy(xpath = "//span[contains(.,'Login')]")
	public static WebElement innerLoginButton;
	
}	
	
	
//	public static WebElement outerLoginButton(WebDriver driver)
//	{
//		return driver.findElement(By.name("loginBtn"));
//	}
//	
//	public static WebElement email(WebDriver driver)
//	{
//		return driver.findElement(By.id("Email"));
//	}
//	
//	public static WebElement password(WebDriver driver)
//	{
//		return driver.findElement(By.id("Password"));
//	}
//	
//	public static WebElement innerLoginButton(WebDriver driver)
//	{
//		return driver.findElement(By.xpath("//span[contains(.,'Login')]"));
//	}

