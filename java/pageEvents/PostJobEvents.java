package pageEvents;

import base.BaseTest;
import pageObjects.PostJobElements;
import utils.ElementFetch;

public class PostJobEvents extends BaseTest {
	ElementFetch ele = new ElementFetch();

	public void jobPost() throws InterruptedException {
		ele.getWebElement("XPATH", PostJobElements.postjob).click();
		
		  //Basic Info 
		ele.getWebElement("ID",PostJobElements.JobTitle).sendKeys("QA Engineer"); 
		ele.getWebElement("XPATH", PostJobElements.Address).sendKeys("Rajiv Gandhi Infotech Park, Phase 3, Hinjawadi Rajiv Gandhi Infotech Park, Hinjawadi, Pimpri-Chinchwad, Maharashtra, India" );
		 
		ele.getWebElement("ID", PostJobElements.Functional).sendKeys("IT Service");
		ele.getWebElement("ID",PostJobElements.SubFunctional).sendKeys("Software Development");
		ele.getWebElement("ID", PostJobElements.Role).sendKeys("Tester");
		ele.getWebElement("XPATH", PostJobElements.WhoCanApply).click();
		ele.getWebElement("XPATH", PostJobElements.WFH).click();
		  
		ele.getWebElement("ID", PostJobElements.JobSector).sendKeys("Private");
		ele.getWebElement("ID", PostJobElements.JobType).sendKeys("Remote");
		ele.getWebElement("ID", PostJobElements.JobTime).sendKeys("Full Time");
		ele.getWebElement("ID", PostJobElements.JobShift).sendKeys("Day Shift");
		ele.getWebElement("ID", PostJobElements.NoofPositions).sendKeys("5");
		  
		 //Salary 
		ele.getWebElement("ID", PostJobElements.MinSal).sendKeys("500000");
		ele.getWebElement("ID", PostJobElements.Min).click();;
		ele.getWebElement("ID", PostJobElements.MaxSal).sendKeys("700000");
		ele.getWebElement("ID", PostJobElements.Max).click();
		 
		 //Required Education and Experience 
		ele.getWebElement("ID",PostJobElements.MinEdu).sendKeys("BE");
		ele.getWebElement("ID",PostJobElements.MinOverallEx).sendKeys("3");
		  
		 //Expected Skills
		 
		/* WebElement elem=driver.findElement(By.xpath("//*[@id=\"allSkills\"]/div[1]")); 
		 Select select=new Select(elem);
		 select.selectByIndex(0); select.selectByIndex(1);
		 select.selectByIndex(4); select.selectByIndex(6);
		  
		 List<WebElement> listOfoptions = select.getAllSelectedOptions(); for
		  (WebElement obj: listOfoptions) { System.out.println(obj.getText()); }
		 */
		  
		 ele.getWebElement("XPATH", PostJobElements.PrimarySkills).sendKeys("Java");
		 ele.getWebElement("ID", PostJobElements.MinEx1).sendKeys("3");
		 ele.getWebElement("ID", PostJobElements.MinEx2).sendKeys("3");
		 ele.getWebElement("ID", PostJobElements.MinEx3).sendKeys("3");
		 ele.getWebElement("XPATH", PostJobElements.NotMandatory).sendKeys("C");
		 
		  
		  //Contact Info 
		 ele.getWebElement("ID", PostJobElements.ContactPerson).sendKeys("Hr.Mukta"); 
		 ele.getWebElement("ID",PostJobElements.Email).sendKeys("hr@iassureit.com"); 
		 ele.getWebElement("ID", PostJobElements.PhoneNo).sendKeys("9822812846");
		  
		 //Job Description 
		 ele.getWebElement("XPATH", PostJobElements.JobDescription).sendKeys("Hello");
		 
		 ele.getWebElement("XPATH", PostJobElements.Preview).click();
		 ele.getWebElement("XPATH", PostJobElements.Close).click();
		 ele.getWebElement("XPATH", PostJobElements.Publish).click();
		 
		 
		
	}
}
