package qa.Test;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.SignupPageEvents;
import utils.ElementFetch;

public class SignupPageTestcase extends BaseTest{
	ElementFetch ele=new ElementFetch();
	SignupPageEvents signup=new SignupPageEvents();
	
	@Test
	public void enteringCredentialsForSifnUp() throws InterruptedException
	{
		signup.enterCredentialsSignUp();;
	}
	
}
