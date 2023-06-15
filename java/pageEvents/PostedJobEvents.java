package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;
import pageObjects.PostedJobElements;
import utils.ElementFetch;

public class PostedJobEvents extends BaseTest {
	ElementFetch ele=new ElementFetch();
	
	public void PostedJobActive() throws InterruptedException
	{
		ele.getWebElement("XPATH", PostedJobElements.MenuPostedJob).click();
	    ele.getWebElement("XPATH", PostedJobElements.ActiveJob).click();
		
		Thread.sleep(1000);
		WebElement sector=driver.findElement(By.id("allSectors_input"));
		Select c=new Select(sector);
		c.selectByVisibleText("Private");
		
		Thread.sleep(1000);
		WebElement Types=driver.findElement(By.id("allJobTypes_input"));
		Select c1=new Select(Types);
		c1.selectByVisibleText("Parmanent");
		
		Thread.sleep(1000);
		WebElement Time=driver.findElement(By.id("allJobTime_input"));
		Select c2=new Select(Time);
		c2.selectByVisibleText("Full Time");
		
		Thread.sleep(1000);
		WebElement element3=driver.findElement(By.id("allJobShift_input"));
		Select c3=new Select(element3);
		c3.selectByVisibleText("Day Shift");
		
		Thread.sleep(1000);
		WebElement Roles=driver.findElement(By.id("allRoles_input"));
		Select c4=new Select(Roles);
		c4.selectByVisibleText("Software Engineer");		
		Thread.sleep(1000);
		WebElement skills=driver.findElement(By.id("allSkills_input"));
		Select c5=new Select(skills);
		c5.selectByVisibleText("Github");
		
		Thread.sleep(1000);
		WebElement qualifications=driver.findElement(By.id("allQualifications_input"));
	    Select c6=new Select(qualifications);
		c6.selectByVisibleText("Graduate");
		
		Thread.sleep(1000);
		WebElement experience=driver.findElement(By.id("allExperiences_input"));
		Select c7=new Select(experience);
		c7.selectByVisibleText("3-5 year");
		
		ele.getWebElement("ID", PostedJobElements.ActiveInactive).click();
		ele.getWebElement("XPATH", PostedJobElements.Edit).click();
		driver.navigate().back();
		ele.getWebElement("XPATH", PostedJobElements.View).click();
		driver.navigate().back();
		ele.getWebElement("XPATH", PostedJobElements.Delete).click();
		ele.getWebElement("XPATH", PostedJobElements.NoButton).click();
	}
	
	public void inactivesjob()
	{
		ele.getWebElement("XPATH", PostedJobElements.InactiveJob).click();
	}
	
	public void draftsjobs()
	{
		ele.getWebElement("XPATH", PostedJobElements.DraftsJobs).click();
	}
	
		
	
	

}
