package library;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver, String screenshotName)	
	{
				
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File source=ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./Screenshots/" + screenshotName + ".png"));
			
			System.out.println("Screenshot taken: " + screenshotName);
		} 
		catch (Exception e) 
		{
			System.out.println(screenshotName + ": Screenshot NOT taken: Reason: " + e.getMessage());
	}
		/* finally 
		{
		} */
}
	
	public static boolean isElementPresent(WebDriver driver, By by, String item){
        try{
        	System.out.println("Checking for element - " + item);
        	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            driver.findElement(by);
            System.out.println("Element is present - " + item);
            return true;
        }
        catch(Exception e){
       // catch(NoSuchElementException e){
        	System.out.println("Element is NOT present -  " + item);
            return false;
        }
    }
	
}
