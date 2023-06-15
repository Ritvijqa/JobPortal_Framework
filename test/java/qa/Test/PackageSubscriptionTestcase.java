package qa.Test;

import org.testng.annotations.Test;

import pageEvents.PackageSubscriptionEvents;
import utils.ElementFetch;

public class PackageSubscriptionTestcase {
	ElementFetch ele=new ElementFetch();
	PackageSubscriptionEvents packagesubscription=new PackageSubscriptionEvents();
	
	@Test
	public void subscriptionDetails() {
		packagesubscription.subscription();
		
	}

}
