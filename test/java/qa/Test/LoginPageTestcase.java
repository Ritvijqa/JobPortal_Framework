package qa.Test;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class LoginPageTestcase extends BaseTest {
	ElementFetch ele=new ElementFetch();
	LoginPageEvents loginpage=new LoginPageEvents();
  @Test
  public void sampleMethodForEnteringCredentials() {
	 
	  loginpage.enterCredentials();
	  
  }
}
