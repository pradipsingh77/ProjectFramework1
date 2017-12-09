package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {

	//declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="ped")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbtn;
	
	
	//initialization
	public LoginPagePOM(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//utilisation.
	
		public void setUsername(String un){
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw){
		pwTB.sendKeys(pw);
	
	}
	
	public void clickLogin(){
		loginbtn.click();

	}
}