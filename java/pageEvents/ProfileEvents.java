package pageEvents;


import pageObjects.ProfileElements;
import utils.ElementFetch;

public class ProfileEvents {
	ElementFetch ele=new ElementFetch();
	
	public void profileCredentials()
	{
		ele.getWebElement("XPATH", ProfileElements.profilePicture).click();
		ele.getWebElement("XPATH", ProfileElements.Profile).click();
		ele.getWebElement("ID", ProfileElements.Edit).click();
		ele.getWebElement("XPATH", ProfileElements.SaveNext).click();
		ele.getWebElement("XPATH", ProfileElements.Popup).click();
	//	ele.getWebElement("XPATH", ProfileElements.Download).click();
		ele.getWebElement("XPATH", ProfileElements.Next1).click();
	
		ele.getWebElement("XPATH", ProfileElements.GridView).click();
		ele.getWebElement("XPATH", ProfileElements.ListView).click();
		//ele.getWebElement("XPATH", ProfileElements.Print).click();
		//ele.getWebElement("ID", ProfileElements.Download1).click();
		ele.getWebElement("XPATH", ProfileElements.Next2).click();
		
		
		//Contact
		//ele.getWebElement("XPATH", ProfileElements.AddContact).click();
		ele.getWebElement("XPATH", ProfileElements.Finish).click();
		ele.getWebElement("XPATH", ProfileElements.OK).click();
		ele.getWebElement("XPATH", ProfileElements.AcceptProfile).click();
		ele.getWebElement("XPATH", ProfileElements.OK1).click();
	}

}
