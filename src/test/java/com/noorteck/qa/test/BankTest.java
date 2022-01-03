package com.noorteck.qa.test;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoansPage;
import com.noorteck.qa.pages.TransferPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) throws InterruptedException {
		
String url = "https://usdemo.vee24.com/#/transactions";
		
		CommonUI commonUIobj = new CommonUI();
		ObjInitialize obj = new ObjInitialize();
		BankTest testobj = new BankTest();	
		
		HomePage homepageObj = new HomePage();
		TransferPage transferObj = new TransferPage();
		LoansPage loansObj = new LoansPage();
		
		commonUIobj.openBrowser("chrome"); //Open the browser
		commonUIobj.navigate(url); //navigate to URL
		
		testobj.BankTestCaseOne();
		
		commonUIobj.quitBrowser();// close the browser
		
	}
	public void BankTestCaseOne() throws InterruptedException {
		transferObj.clickTransferFunds();
		transferObj.selectFromOriginAccount("Value", "RainyDay");
	    transferObj.selectFromDestinationAccount("Value", "Investing");
	    transferObj.enterAmount("1000");
	    transferObj.enterSsNumber("12345677");
	    transferObj.enterAtmPin("1235");
	    transferObj.clickTransferFunds();
        Thread.sleep(10000);

	}
}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/