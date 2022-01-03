package com.noorteck.qa.utils;

import org.openqa.selenium.WebDriver;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoansPage;
import com.noorteck.qa.pages.TransferPage;

/**
 * In this class we declare our objects that will be shared among different classes
 * @author NoorTeck
 *
 */
public class Constants {
	
	
	public WebDriver driver;
	
	//declare class objects and common objects
public HomePage homeObj;
public TransferPage transferObj;
public LoansPage loansObj;

}
