package qa.Test;

import org.testng.annotations.Test;

import pageEvents.ProfileEvents;
import utils.ElementFetch;

public class ProfileTestcase {
	ElementFetch ele= new ElementFetch();
	ProfileEvents profileevents=new ProfileEvents();
	
	@Test
	public void profileDetalis()
	{
		profileevents.profileCredentials();
	}
	

}
