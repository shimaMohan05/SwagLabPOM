package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
	public Properties ps;
	public  PropertiesClass()
	{
		ps=new Properties();
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
			
		
			
			
		
	}
	public String getData(String key)
	{
		return ps.getProperty(key);
	}

}
