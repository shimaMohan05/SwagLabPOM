package pagepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	private WebDriver driver;
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By fname=By.id("first-name");
	private By lname=By.id("last-name");
	private By zip=By.id("postal-code");
	private By cancel=By.id("cancel");
	private By contBtn=By.id("continue");
	
	public void toEnterData(String fn,String ln,String zc)
	{
		driver.findElement(fname).sendKeys(fn);
		driver.findElement(lname).sendKeys(ln);
		driver.findElement(zip).sendKeys(zc);
	}
	public void toCancel()
	{
		driver.findElement(cancel).click();
	}
	public void toContinue()
	{
		driver.findElement(contBtn).click();
	}
	
	

}
