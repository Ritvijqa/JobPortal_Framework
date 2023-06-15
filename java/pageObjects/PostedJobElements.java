package pageObjects;

public interface PostedJobElements {
	String MenuPostedJob="//*[@id=\\\"root\\\"]/div/div/div[1]/div/div[1]/div/div[2]/div/div[4]/div";
	String ActiveJob="//*[@id=\"mapwise\"]/section/div/div[1]/ul/li[1]/a";
	String InactiveJob="//*[@id=\"mapwise\"]/section/div/div[1]/ul/li[2]/a";
	String DraftsJobs="//*[@id=\"mapwise\"]/section/div/div[1]/ul/li[3]/a";
	String ActiveInactive="64786641a0da9f0affd2510b";
	String Edit="//*[@id=\"activejobs\"]/div[1]/div/div/div[2]/div/div/div[2]";
	String View="//*[@id=\"activejobs\"]/div[1]/div/div/div[2]/div/div/div[3]/a";
	String Delete="//*[@id=\"activejobs\"]/div[1]/div/div/div[2]/div/div/div[4]";
	String NoButton="//*[@id=\"delModal\"]/div/div/div[2]/div[2]/button[1]";

}
