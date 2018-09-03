package testing;


import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.testBase;
import pages.createAccount;
import pages.indexPage;
import pages.registerStepFirstPersonal;
import testUtil.Util;

@Listeners(extentReports.listernersPractice.class)


public class registerStepFirstPersonalTest {

	testBase tb;
	indexPage ipage;
	createAccount ca;
	Util ut;
	String sheetName="Personal";	
	registerStepFirstPersonal rp;
	
	
	
	
	@BeforeTest
	public void setUp()throws Exception {
	
		 Logger log= Logger.getLogger("Sagar1logs");
		System.out.println("Before test column");
		tb=new testBase();
		tb.Initialize();
		ipage=new indexPage();
	    ipage.closeOtherWindows();
	    ipage.notificationInput();
		ipage.Jobs_menuItemMouseHover();
		
		ca=new createAccount();
		ca.enterToTheDetailsPage();
		
		rp=new registerStepFirstPersonal();
		
	}
	
	@DataProvider
     public Object[][] getData()
     {
		ut= new Util();
		Object[][] data= ut.getData(sheetName);
		return data;
     }
	
	@Test(dataProvider="getData")
	public void personalDataformFilling(String Name , String email , String password , String Mobileno,String year,String mnth,String resume) throws InterruptedException {
		
		rp.registerStepFirstPersonalDetails(Name, email, password, Mobileno,year,mnth,resume);
		
	
	}
	
	
	
	
	
	
	
	
	
	
}
