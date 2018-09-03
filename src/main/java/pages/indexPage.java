package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.testBase;
import testUtil.Util;

public class indexPage extends testBase {

    @FindBy(xpath="//div[@class='mTxt'and contains(text(),'Jobs')]")
   WebElement Jobs; 

   @FindBy(xpath="//div[@class='mTxt'and contains(text(),'More')]")
   WebElement More_MenuItem; 
   
   @FindBy(id="qsbFormBtn")
   WebElement searchButton;
   
   @FindBy(xpath="//a[contains(text(),'Register Now')]")
   WebElement Register;
  
   @FindBy(xpath="//span[@id='allow']")
   WebElement allowLocShare;
   
   @FindBy(xpath="//span[@id='block']")
   WebElement blockLocShare;
   
     public indexPage() {
    	 PageFactory.initElements(driver,this);
     }
     
     Actions actions;
     Util ut;
     String createAccountHandle=" ";
     
     
     public void closeOtherWindows() {
    	 String parentWindow=driver.getWindowHandle();
    	 Set<String> winHandles=driver.getWindowHandles();
    	 for(String curWindow: winHandles)
    	 {
    		 driver.switchTo().window(curWindow);
 		 if(curWindow.equals(parentWindow)) {
 			 
 		 }
 		 else
 		 {
 			   driver.close();
 		 } }
    	 
    	 driver.switchTo().window(parentWindow);
     }
     
     public void notificationInput()
     {
    	 WebDriverWait wait= new WebDriverWait(driver, 2000);
    	 wait.until(ExpectedConditions.elementToBeClickable(blockLocShare)).click();
    	 
     }
      	
       public createAccount Jobs_menuItemMouseHover() throws Exception {
    	   
    	   
//    	   parentWindow=driver.getWindowHandle();
    	   Thread.sleep(2000);
    	   actions=new Actions(driver);
    	   actions.moveToElement(Jobs).build().perform();
    	   ut= new Util();
    	   ut.screenShots();
    	   Register.click();
    	   
    	   return new createAccount();
    	  }
       
       
       
     
     
     
     
     
     
     
}
