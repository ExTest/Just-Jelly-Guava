package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers{
	public MyLeadsPage(){
		if(!verifyTitle("My Leads | opentaps CRM") ){
			Reporter.reportStep("Landed in Wrong Page.This is not MyLeadsPage","FAIL");
		
		}
	}
	public CreateLeadPage clickCreateLead(){
		clickByLink("Create Lead");
		return new CreateLeadPage ();
	}
	public FindLeadsPage clickFindLead(){
		clickByLink("Find Leads");
		return new FindLeadsPage ();
	}
	public FindLeadsPage clickMergeLead(){
		clickByLink("Merge Leads");
		return new FindLeadsPage ();
	}
}
