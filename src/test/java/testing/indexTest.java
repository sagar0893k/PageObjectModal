package testing;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test; 

import base.testBase;
import pages.indexPage;
import testUtil.Util;

public class indexTest   {

	testBase tb;
	Util ut;
	indexPage ipage;
	
	@BeforeTest
	
	public void loadUrl()throws Exception
	{
		tb=new testBase();
  		tb.Initialize();
  		ut=new Util();
  		ipage=new indexPage();
  		
	}
	
     @Test(priority=1)
        public void fullPageScreenShot() throws Exception {
        	
        	ut.screenShots();
        }
	
//	@Test(priority=2)
//	
//	public void menuMouseHoverTest() throws Exception  {
//		 
//		ipage.Jobs_menuItemMouseHover();
//	}
	
	
}
