package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage(){
		if(!verifyTitle("My Home | opentaps CRM") ){
			Reporter.reportStep("Landed in Wrong Page.This is not CRMHomePage","FAIL");
		}
	}
	public  MyLeadsPage clickLeads(){
		clickByLink("Leads");
		return new MyLeadsPage();
	}
	}

