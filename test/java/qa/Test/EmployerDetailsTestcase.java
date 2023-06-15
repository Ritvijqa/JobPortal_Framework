package qa.Test;

import org.testng.annotations.Test;

import pageEvents.EmployerDetailsEvents;
import utils.ElementFetch;

public class EmployerDetailsTestcase {
	ElementFetch ele=new ElementFetch();
	EmployerDetailsEvents ls=new EmployerDetailsEvents();
	
	@Test
	public void enteringEmployerDetails() throws InterruptedException
	{
		ls.details();
	}

}
