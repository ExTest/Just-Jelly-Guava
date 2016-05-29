package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers{
	public EditLeadPage(){
		if(!verifyTitle("") ){
			Reporter.reportStep("Landed in Wrong Page.This is not EditLeadPage","FAIL");
		}
	}
public EditLeadPage selectSource (String data){
	selectById("addDataSourceForm_dataSourceId", data);
return this;	
}
public EditLeadPage clickSourceAdd(){
	clickByXpath("");
	return this;
}
public ViewLeadPage clickMarketingAdd(){
	clickByXpath("");
	return new ViewLeadPage();
}
//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a[1]
}

