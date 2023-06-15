package qa.Test;

import pageEvents.PostedJobEvents;
import utils.ElementFetch;

public class PostedJobTestcase {
	ElementFetch ele=new ElementFetch();
	PostedJobEvents events=new PostedJobEvents();
	
	public void posted()
	{
		try {
			events.PostedJobActive();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
			

}
