package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI{

	@FindBy(xpath = "//*[@class = mat-select-placeholder ng-tns-c12-2 ng-star-inserted")
	WebElement 	OriginAccount;
	
	@FindBy(xpath = "//*[@class = 'mat-select-placeholder ng-tns-c12-4 ng-star-inserted']")
	WebElement DestinationAccount;
	
	@FindBy(css = "#mat-input-0")
	WebElement amount;
	

	@FindBy(css = "#mat-input-1")
	WebElement ssNumber;
	
	@FindBy(css = "#mat-input-2")
	WebElement AtmPin;
	
	@FindBy(xpath = "//*[text()= 'Transfer Funds']")
	WebElement TransferFunds;
	

	
	public TransferPage() {
		PageFactory.initElements(driver,this);
}
	public void selectFromOriginAccount(String Value, String RainyDay) {

}
	public void selectFromDestinationAccount(String Value, String Investing) {
}
public void enterAmount(String matinput0) {
	enter (amount,matinput0);
}
public void enterSsNumber(String matinput1) {
	enter (ssNumber,matinput1);
}
public void enterAtmPin(String matinput2) {
	enter (AtmPin, matinput2);
}
public void clickTransferFunds() {
	click (TransferFunds);
}





}