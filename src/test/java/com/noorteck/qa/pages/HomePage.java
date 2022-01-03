package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{

	@FindBy(xpath = "//span[text() = 'Transfer']")
	WebElement clickTransfer; 
	
	@FindBy(xpath = "//span[text() = 'Loans']")
	WebElement clickLoans; 
	
	@FindBy(xpath = "//span[text() = 'LogOut']")
	WebElement clickLogOut; 
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	public void clickTransfer() {
		click(clickTransfer);
	}
	public void clickLoans() {
		click(clickLoans);
}
	public void LogOut() {
		click(clickLogOut);
}
	
}