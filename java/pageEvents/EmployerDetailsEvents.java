package pageEvents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;
import pageObjects.EmployerDetailsElements;
import utils.ElementFetch;

public class EmployerDetailsEvents extends BaseTest {
	ElementFetch ele = new ElementFetch();

	public void details() throws InterruptedException {
		ele.getWebElement("XPATH", EmployerDetailsElements.Menu).click();
		ele.getWebElement("XPATH", EmployerDetailsElements.Setting).click();
		ele.getWebElement("CLASSNAME",EmployerDetailsElements.BasicInfo).click();
		ele.getWebElement("ID", EmployerDetailsElements.CompanyName).sendKeys("Infosys");
		ele.getWebElement("ID", EmployerDetailsElements.GroupName).sendKeys("Infosys");
		ele.getWebElement("ID", EmployerDetailsElements.Industry).sendKeys("IT");
		ele.getWebElement("ID", EmployerDetailsElements.email).sendKeys("career@infosys.com");
		ele.getWebElement("ID", EmployerDetailsElements.CompanyNumber).sendKeys("9834444701");
		ele.getWebElement("ID", EmployerDetailsElements.Website).sendKeys("www.infosys.com");
		// ele.getWebElement("ID", EmployerDetailsElements.Country).click();
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.id("country"));
		Select c = new Select(element);
		c.selectByVisibleText("India");

		ele.getWebElement("ID", EmployerDetailsElements.TAX).sendKeys("KILH13456Y");
		ele.getWebElement("XPATH", EmployerDetailsElements.Next).click();
		ele.getWebElement("XPATH", EmployerDetailsElements.button).click();

		// Add Statutory
		
		ele.getWebElement("XPATH", EmployerDetailsElements.addstatutory).click();
		WebElement country=driver.findElement(By.id("states")); 
		Select s1=new Select(country); 
		s1.selectByVisibleText("Maharashtra");
		ele.getWebElement("ID",EmployerDetailsElements.gstinno).sendKeys("27AAAAP0267H2ZN");
		ele.getWebElement("ID", EmployerDetailsElements.pan).sendKeys("SDFGH4567K");
		//ele.getWebElement("XPATH", EmployerDetailsElements.sub).click();
		ele.getWebElement("XPATH", EmployerDetailsElements.next).click();
		ele.getWebElement("XPATH",EmployerDetailsElements.button1).click();
		 
		  //Location
		ele.getWebElement("XPATH", EmployerDetailsElements.AddLocation).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement location=driver.findElement(By.id("locationType"));
		Select s=new Select(location); 
		s.selectByVisibleText("Office");
		 
		ele.getWebElement("ID", EmployerDetailsElements.AddressLine).sendKeys("Hinjewadi Phase 1 Road, Phase 1, Hinjawadi Rajiv Gandhi Infotech Park, Hinjawadi, Pimpri-Chinchwad, Maharashtra, India"); ele.getWebElement("XPATH", EmployerDetailsElements.submit).click();
		ele.getWebElement("XPATH", EmployerDetailsElements.nxt).click();
		ele.getWebElement("XPATH", EmployerDetailsElements.okbutton).click();
		 //contact 
	    ele.getWebElement("XPATH",EmployerDetailsElements.AddContact).click(); 
		Thread.sleep(1000); 
		WebElement dept=driver.findElement(By.id("deptName")); 
		Select c1=new Select(dept);
		c1.selectByVisibleText("Operations");
		  
		Thread.sleep(1000); WebElement desg=driver.findElement(By.id("desgName"));
		Select s3=new Select(desg); 
		s3.selectByVisibleText("Intern");
		 
		ele.getWebElement("ID", EmployerDetailsElements.EmployeeID).sendKeys("A13");
		ele.getWebElement("ID", EmployerDetailsElements.FName).sendKeys("Nilisha");
		ele.getWebElement("ID", EmployerDetailsElements.LName).sendKeys("Raut");
		ele.getWebElement("ID",EmployerDetailsElements.mail).sendKeys("iassureit.jobpotal@gmail.com");
		ele.getWebElement("XPATH", EmployerDetailsElements.yes).click();
		  
		 
		Thread.sleep(1000);
		WebElement rol=driver.findElement(By.id("role")); 
		Select r=new Select(rol); 
		r.selectByVisibleText("employer");
		 
		ele.getWebElement("XPATH", EmployerDetailsElements.submit5).click();
		 
		ele.getWebElement("XPATH", EmployerDetailsElements.Finish).click();

		ele.getWebElement("XPATH", EmployerDetailsElements.Ok).click();

		ele.getWebElement("XPATH", EmployerDetailsElements.ok1).click();
	}

}
