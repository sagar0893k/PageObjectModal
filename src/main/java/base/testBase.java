package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;


public class testBase {

	static Properties prop;
	public static WebDriver driver;

   public testBase()
   {
         
	   try
	   {
		   
	   FileInputStream fis=new FileInputStream("E:\\Eclipse\\Naukri\\properties");
	  
	  prop= new Properties();
	   
	   prop.load(fis);
	   
	   
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   
	}
   
   public void Initialize()throws Exception{
          
    	  //loading of browser and URL
    	  System.setProperty("webdriver.chrome.driver",prop.getProperty("chromeDriverPath"));
    	  driver= new ChromeDriver();
    	   /* ChromeOptions options  = new ChromeOptions();
    	    options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
    	    DesiredCapabilities capabilities = new DesiredCapabilities();
    	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    	    driver = new ChromeDriver(capabilities);*/
    	  driver.get(prop.getProperty("URL"));
    	  
    	  //browser settings and implicit wait
    	  
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	  
    	 
    	  
    	
    	 
    	 
      }
   
   
   
	
	
	
	
}
