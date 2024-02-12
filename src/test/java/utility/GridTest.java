package utility;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {
	@Parameters({"bname"})
  @Test
  public void toGetGrid(String bname) throws MalformedURLException, InterruptedException {
		WebDriver driver = null;
	  
	 
	  if(bname.equals("Chrome"))
	  {
	  ChromeOptions options =new ChromeOptions();
	  driver =new RemoteWebDriver(new URL("http://localhost:4444"),options);
	  }
	  if(bname.equals("Firefox"))
	  {
		  FirefoxOptions options=new FirefoxOptions();
	  driver =new RemoteWebDriver(new URL("http://localhost:4444"),options);
	  }
	  if(bname.equals("Edge"))
	  {
		  EdgeOptions options=new EdgeOptions();
	  driver =new RemoteWebDriver(new URL("http://localhost:4444"),options);
	  }
	  Thread.sleep(3000);
	  driver.get("https://www.amazon.in");
	  Thread.sleep(3000);
	  
  }
}