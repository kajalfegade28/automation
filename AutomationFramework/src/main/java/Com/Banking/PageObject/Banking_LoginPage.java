package Com.Banking.PageObject;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Banking.BaseClass.BaseClass;

public class Banking_LoginPage extends BaseClass {

        //1.
	public Banking_LoginPage() {

		PageFactory.initElements(driver, this);
	}

//2. 
	@FindBy(name = "uid")
	public WebElement Username;

	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement Password;

	@FindBy(name = "btnLogin")
	public WebElement LoginBtn;

//3.
	public void SetUsername(String Uname) {
		Username.sendKeys(Uname);
	}
	
	public void SetPassowrd(String Pwd) {
		Password.sendKeys(Pwd);
	}
	
	public void Clickbtn() {
		LoginBtn.click();
	}
}

