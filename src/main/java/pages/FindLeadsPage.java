package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers{
	public FindLeadsPage(){
		if(!verifyTitle("") ){
			Reporter.reportStep("Landed in Wrong Page.This is not FindLeadsPage","FAIL");
		}
	}
public FindLeadsPage enterFirstNameForSearch(String data){
	enterByXpath("//div[@id='findLeads']//following::input[1]", data);
return this;	
}
public FindLeadsPage clickFindLead(){
	clickByXpath("//div[@class='x-panel-footer x-panel-footer-noborder']//button");
	return this;
}
public ViewLeadPage clickFindLeadSearch(){
	clickByXpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a[1]']//button");
	return new ViewLeadPage();
}
//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a[1]
}

