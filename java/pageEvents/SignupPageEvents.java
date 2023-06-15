package pageEvents;

import org.openqa.selenium.Alert;

import base.BaseTest;

import pageObjects.SignupPageElements;
import utils.ElementFetch;

public class SignupPageEvents extends BaseTest {
ElementFetch ele=new ElementFetch();
	
	public void enterCredentialsSignUp() throws InterruptedException
	{
		ele.getWebElement("CLASSNAME", SignupPageElements.SignUpText).click();
		ele.getWebElement("ID", SignupPageElements.CompanyName).sendKeys("TATA");
		ele.getWebElement("NAME", SignupPageElements.Branch).sendKeys("Shivajinagar,Pune");
		//ele.getWebElement("ID", SignupPageElements.State).sendKeys("Maharashtra");
		ele.getWebElement("ID", SignupPageElements.Country ).sendKeys("India");
		ele.getWebElement("XPATH", SignupPageElements.Next).click();
		
		
		ele.getWebElement("ID", SignupPageElements.FirstName).sendKeys("Nilisha");
		ele.getWebElement("ID", SignupPageElements.LastName).sendKeys("Raut");
		ele.getWebElement("ID", SignupPageElements.Email).sendKeys("iassureit.jobportal@gmail.com");
		ele.getWebElement("ID", SignupPageElements.PhoneNo).sendKeys("9130173552");
		ele.getWebElement("ID", SignupPageElements.Password).sendKeys("iAssureIT@123");
		ele.getWebElement("ID", SignupPageElements.ConfirmPassword).sendKeys("iAssureIT@123");
		ele.getWebElement("ID", SignupPageElements.CheckBox).click();
		ele.getWebElement("XPATH", SignupPageElements.Nxt).click();
		
		Alert simpleAlert=driver.switchTo().alert(); 
		System.out.println(simpleAlert.getText());
		Thread.sleep(2000); 
		simpleAlert.accept();
		
	}

}
