package testUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import base.testBase;
import org.apache.poi.ss.usermodel.Sheet;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Util extends testBase {

	public String testData="E:\\Eclipse\\Naukri\\src\\main\\java\\data\\Book1.xlsx";
	Workbook book;
	Sheet sheet;

	
	
	 public void screenShots() throws Exception {
		 
		TakesScreenshot scrShot=(TakesScreenshot)driver;
	 
		 File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
	 String date= new SimpleDateFormat("yyyy.MM.dd.hh.mm").format(new Date());
	 File destFile=new File("E:\\screenshots\\"+date +".png");
	     FileUtils.copyFile(srcFile, destFile);
	
	     
		 //full page screenshot in selenium
//   Screenshot ss=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(5000)).takeScreenshot(driver);
//	ImageIO.write(ss.getImage(),"PNG",destFile );	 
	   }
	   
     public Object[][] getData (String sheetName)
     {
    	FileInputStream file=null;
    	
    	
    	try
    	{
    		file= new FileInputStream("E:\\Eclipse\\Naukri\\src\\main\\java\\data\\Book1.xlsx");
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	try
    	{
    	book=WorkbookFactory.create(file);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	sheet=book.getSheet(sheetName);
    	
    	Object[][]data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
    	
    	for(int i=0;i<sheet.getLastRowNum();i++)
    	{
    		for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
    		{
    			data[i][k]=sheet.getRow(i+1).getCell(k).toString();
    		}
    	}
    	
    	return data;
    	
     }
	
	
	
	
	
}
