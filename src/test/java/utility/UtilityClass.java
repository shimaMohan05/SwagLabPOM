package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	public static void totakeScreenShot(WebDriver driver) 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./"+"\\ScreenShots\\swaglab"+System.currentTimeMillis()+".png");
	    try {
			FileHandler.copy(temp,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
		
	
		
		
	

public static String getData1(String key)
{ Properties ps=new Properties();
File f=new File("./"+"\\config.properties");//to read data from file
FileInputStream fs;
try {
	fs = new FileInputStream(f);
	ps.load(fs);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}//read in stream
catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	return ps.getProperty(key);
}


}
