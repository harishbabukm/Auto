package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	@FindBy(id="username")
	private WebElement userName;

	@FindBy(name="pwd")
	private WebElement passWord;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String name) {
		userName.sendKeys(name);
	}
	
	public void enterPassword(String username) {
		passWord.sendKeys(username);
	}
	
	public void clickLoginBTN() {
		login.click();
	}
}
