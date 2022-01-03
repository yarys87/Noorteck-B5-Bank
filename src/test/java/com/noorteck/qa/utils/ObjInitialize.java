package com.noorteck.qa.utils;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoansPage;
import com.noorteck.qa.pages.TransferPage;

public class ObjInitialize extends Constants {
	
	 
	
	public void initializeClassObj() {
		//initialize each page class objects here..
		homeObj= new HomePage();
		loansObj= new LoansPage();
		transferObj= new TransferPage();
		
	}

}
