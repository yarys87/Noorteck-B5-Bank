package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoansPage extends CommonUI {

	@FindBy(css = "#mat-input-3")
	WebElement Name;
	
	@FindBy(css = "#mat-input-4")
	WebElement Address;
	
	@FindBy(xpath= "//*[@class='mat-select-placeholder ng-tns-c13-12 ng-star-inserted']")
	WebElement LoanTypeDropown;
	
	@FindBy(css= "#mat-input-5")
	WebElement YearsToRepayLoan;

	@FindBy(css= "//*[@class='mat-button']")
	WebElement NextButton;
	
	@FindBy(css= "#mat-input-6")
	WebElement Amount;
	
	@FindBy(css= "#mat-input-7")
	WebElement MothersMaidenName;
	
	@FindBy(css= "#mat-input-8")
	WebElement SocialSecurityNumber;
	
	@FindBy(css= "//*[text()='Next']")
	WebElement BackButton ;
	
	@FindBy(css= "//*[text()='Back']")
	WebElement Next;
	
	@FindBy(css= "//*[text()='Confirm']")
	WebElement ConfirmButton;
	
	@FindBy(css= "//*[text()='Back']")
	WebElement Back;

	@FindBy(css=  "//*[text()='Reset']")
	WebElement Reset;
	
	//@FindBy(css=  "//*[text()='Reset']")
	//WebElement submissionSucess;
	
	public LoansPage() {
		PageFactory.initElements(driver,this);
	}
	public void enterName(String name) {
		enter(Name, name);
	}
	public void enterAddress(String address) {
		enter(Address, address);
	
	}
	public void selectLoanTypeDropdown(String methodName, String indexTextValue) {
		selectFromDropdown(LoanTypeDropown,methodName, indexTextValue);
	}
	public void enterYearsToRepayLoan(String yearsToRepayLoan) {
		enter(YearsToRepayLoan, yearsToRepayLoan);
	}
	public void clickNextButton() {
		click(NextButton);
	}
	public void enterAmount(String amount) {
		enter(Amount,amount);
	}
	public void enterMothersMaidenName(String mothersMaidenName) {
		enter(MothersMaidenName,mothersMaidenName);
}
	public void enterSocialSecurityNumber(String socialSecurityNumber) {
		enter(SocialSecurityNumber,socialSecurityNumber);
}
	public void clickBackButton() {
		click(BackButton);
}
	public void clickNext() {
		click(Next);
	}
	public void clickConfirmButton() {
		click(ConfirmButton);
}
	public void clickBack() {
		click(Back);
}
	public void clickReset() {
		click(Reset);
}
	//submission 
	}
