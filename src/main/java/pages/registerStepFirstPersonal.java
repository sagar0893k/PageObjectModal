package pages;



import java.math.BigDecimal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.testBase;

public class registerStepFirstPersonal extends testBase {

	@FindBy(id="fname")
	WebElement Name;
	
	@FindBy(id="email")
	WebElement emailId;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="number")
	WebElement mobile;
	
	@FindBy(xpath="//input[@name='expYear']")
	WebElement expyr;
	
	@FindBy(name="expMonth")
	WebElement expmon;
	
	@FindBy(name="uploadCV")
	WebElement fileUpload;
	
	public registerStepFirstPersonal() {
		PageFactory.initElements(driver, this);
	}
	
	public void registerStepFirstPersonalDetails(String nm, String email , String pwd, String mb,String yr,String month,String resum) throws InterruptedException {
		
		Name.sendKeys(nm);
		emailId.sendKeys(email);
		password.sendKeys(pwd);
	   String a=   new BigDecimal(mb).toPlainString();
		mobile.sendKeys(a);
		fileUpload.sendKeys(resum);
		//expyr.sendKeys(yr);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
