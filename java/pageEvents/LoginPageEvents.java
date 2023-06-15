package pageEvents;



import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	ElementFetch ele=new ElementFetch();
	
	public void enterCredentials()
	{
		ele.getWebElement("ID", LoginPageElements.phoneNumber).sendKeys("1234567891");
		ele.getWebElement("ID", LoginPageElements.passwordField).sendKeys("123456789");
		ele.getWebElement("XPATH", LoginPageElements.loginText).click();
	}

}
