package pageEvents;

import base.BaseTest;
import pageObjects.PackageSubscriptionElements;
import utils.ElementFetch;

public class PackageSubscriptionEvents extends BaseTest{
	ElementFetch ele=new ElementFetch();
	
	public void subscription() {
	
	ele.getWebElement("XPATH", PackageSubscriptionElements.Menubar).click();
	ele.getWebElement("XPATH", PackageSubscriptionElements.sub).click();
	ele.getWebElement("XPATH", PackageSubscriptionElements.SubscriptionButton).click();
	ele.getWebElement("XPATH", PackageSubscriptionElements.OkSubscription).click();
	ele.getWebElement("XPATH", PackageSubscriptionElements.SelectPackage).click();
	ele.getWebElement("XPATH", PackageSubscriptionElements.Subscription).click();
	ele.getWebElement("XPATH", PackageSubscriptionElements.MakePayment).click();
	driver.navigate().back();
	
	
	
	
	
	
	
		
	}

}
