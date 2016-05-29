package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers {

	public ViewLeadPage(){
		if(!verifyTitle("View Lead | opentaps CRM") ){
			Reporter.reportStep("Landed in Wrong Page.This is not ViewLeadPage","FAIL");
		}
	}
		
		public ViewLeadPage verifyFirstName(){
			
			verifyTextContainsByXpath("//*[@id='viewLead_firstName_sp']","Guava");
			return this;
		}
		public  MyLeadsPage clickEditLead(){
			clickByLink("Edit");
			return new MyLeadsPage();
		}
		
}		