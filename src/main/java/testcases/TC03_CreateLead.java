package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC03_CreateLead extends OpentapsWrappers {
	
	@BeforeClass
	public void setData(){
		browserName="chrome";
		dataSheetName="TC001";
		testCaseName="Create Lead";
		testDescription="Create Lead (Positive)";
	}
	
	
	@Test(dataProvider="fetchData")
	public void login(String username,String password,String user,String companyname,String Firstname,String Lastname){
		
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.verifyWelcome(user)
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyname)
		.enterFirstName(Firstname)
		.enterLastName(Lastname)
		.clickCreateLead()
		.verifyFirstName();
			
		
	}
	
	
	
	
	
	
	
	
	
	
}
