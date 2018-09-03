package testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.testBase;
import pages.createAccount;
import pages.indexPage;

public class createAccountTest {

	createAccount CA;
	testBase tb;
	indexPage ipage;
	
	@BeforeTest
	public void Initialization() throws Exception
	{
		tb=new testBase();
		tb.Initialize();
		ipage=new indexPage();
		ipage.Jobs_menuItemMouseHover();
		
		CA=new createAccount();
	}
	
//	@Test
//	public void enterToDetailsPageTest()
//	{
//		CA.enterToTheDetailsPage();
//	}
	
}
