package qa.Test;

import org.testng.annotations.Test;

import pageEvents.PostJobEvents;
import utils.ElementFetch;

public class PostJobTestcase {
	ElementFetch ele=new ElementFetch();
	PostJobEvents post=new PostJobEvents ();
	@Test
	public void postjobCredentials()
	{
		try {
			post.jobPost();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
