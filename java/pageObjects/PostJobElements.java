package pageObjects;

public interface PostJobElements {
	String postjob="//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div[2]/div/div[1]/div/a/div";
	
	
	//Basic Info
	String JobTitle="jobTitle";
String Address="//input[@maxlength='200']";
  	String Functional="selectFunctionalArea";
	String SubFunctional="selectSubFunctionalArea";
	String Role="selectrole";
	String WhoCanApply="//*[@id=\"Both (Male & Female)\"]/div";
	String WFH="//*[@id=\"addJob\"]/div[5]/label/span";
	String JobSector="selectjobSector";
	String JobType="selectjobType";
	String JobTime="selectJobTime";
	String JobShift="selectJobShift";
	String NoofPositions="positions";
	
	//Salary
	String MinSal="minSalary";
	String Min="minSalPeriod";
	String MaxSal="maxSalary";
	String Max="maxSalPeriod";
	
	//Required Education
	String MinEdu="selectminEducation";
	String MinOverallEx="minExperience";
	
	//Expected Skills
	String PrimarySkills="//*[@id=\"allSkills\"]/div[1]";
	String MinEx1="minPrimExp";
	//String SecondarySkills="";
	String MinEx2="minSecExp";
	//String OtherSkills="";
     String MinEx3="minOtherExp";
   String NotMandatory="//*[@id=\"addJob\"]/div[19]/div/div/div";

	//Contact Info
	String ContactPerson="contactPersonName";
	String Email="contactPersonEmail";
	String PhoneNo="phone-form-control";

//	
	//Job Description
	String JobDescription="//*[@id=\"addJob\"]/div[25]/div/div/div[2]/div[2]/div";

	String Preview="//*[@id=\"addJob\"]/div[26]/button[2]";
String Close="//*[@id=\"robust\"]/div/div/div[3]/button";
	String Publish="//*[@id=\"addJob\"]/div[27]/button";
		
			
			
			

}
