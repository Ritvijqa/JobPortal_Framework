package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;
import pageObjects.SearchCandidatesElements;
import utils.ElementFetch;

public class SearchCandidatesEvents extends BaseTest{
	ElementFetch ele=new ElementFetch();
	
	public void search() throws InterruptedException
		{
		ele.getWebElement("XPATH", SearchCandidatesElements.Menu).click();
		ele.getWebElement("XPATH", SearchCandidatesElements.SearchCandidate).click();
		Thread.sleep(1000);
		WebElement industries=driver.findElement(By.id("allIndustries_input"));
		Select c=new Select(industries);
		c.selectByVisibleText("Information Technology");
		
		Thread.sleep(1000);
		WebElement qualification=driver.findElement(By.id("allQualifications_input"));
		Select c1=new Select(qualification);
		c1.selectByVisibleText("Private");
		
		Thread.sleep(1000);
		WebElement experience=driver.findElement(By.id("allExperiences_input"));
		Select c2=new Select(experience);
		c2.selectByVisibleText("1-3");
		
		Thread.sleep(1000);
		WebElement skills=driver.findElement(By.id("allSkills_input"));
		Select c3=new Select(skills);
		c3.selectByVisibleText("Agile");
	}

}
