package pageObjects;

public interface EmployerDetailsElements {
	String Menu="//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div[2]/div/div[4]/div";
	
	String Setting="//*[@id=\"barsToggel\"]/a[1]/div/span";
	String BasicInfo="basic-info-pillss pills";
	String CompanyName="companyName";
	String GroupName="groupName";
	String Industry="selectIndustry";
	String email="companyEmail";
	String CompanyNumber="phone-form-control";
	String Website="website";
	//String Country="country";
	String TAX="TAN";
	String Next="//*[@id=\"BasicInfo\"]/div/div/div[2]/div/div/button";
	String button="//button[@class='swal2-confirm swal2-styled']";
	
	//Statutory Info
	String addstatutory="//*[@id=\"locationsDetail\"]/div/div[1]/div[2]/div";
	
	String gstinno="GSTIN";
	String pan="PAN";
	//String sub="//*[@id=\"locationsDetail\"]/div/div[2]/div/div[2]/button";
	String next="//button[@class='button1 pull-right']";
	
	String button1="/html/body/div[2]/div/div[3]/button[1]";
	
	//Location
	String AddLocation="//*[@id=\"locationsDetail\"]/div/div[1]/div[2]/div";
	//String BlockNo="//*[@id=\"Line2\"]";
	
	String AddressLine="addressLine1";
	String submit="//*[@id=\"locationsDetail\"]/div/div[2]/div[4]/button";
	String nxt="//*[@id=\"locationsDetail\"]/div/div[3]/button[2]";
	String okbutton="/html/body/div[2]/div/div[3]/button[1]";
	
	//contact
	String AddContact="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div/section/div/section/div/div/div[1]/div[3]/div";
	String EmployeeID="employeeID";
	String FName="firstName";
	String LName="lastName";
	String mail="email";
	String yes="//*[@id=\"ContactDetail\"]/div[4]/div[1]/div/label[1]";
	String submit5="//*[@id=\"ContactDetail\"]/div[5]/button";
	String Finish="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div/section/div/section/div/div/div[3]/button[2]";
	String Ok="//button[@class='swal2-confirm swal2-styled']";
	String ok1="/html/body/div[2]/div/div[3]/button[1]";
	
	


}
