package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.testBase;

public class createAccount extends testBase {

	@FindBy(xpath="//button[@value='exp']")
	WebElement professionalButton;
	
	indexPage ip;
	
	
	public createAccount()
	{
		PageFactory.initElements(driver, this);
	}
	
	public registerStepFirstPersonal enterToTheDetailsPage()
	{
		ip=new indexPage();
		
	//	Switching from one window to another
//		Set<String>windowHandle=driver.getWindowHandles();
//		for(String curWindow: windowHandle)
//		{
//			driver.switchTo().window(curWindow);
//		}
	
	//switching from one tab to another	
	ArrayList<String> tab2=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tab2.get(1));
	System.out.println(driver.getTitle());	
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("arguments[0].click();",professionalButton);
	professionalButton.click();
	    return new registerStepFirstPersonal();
	    
	}
	
}
