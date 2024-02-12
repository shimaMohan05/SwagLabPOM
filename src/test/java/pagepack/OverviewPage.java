package pagepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPage {
	private WebDriver driver;
	public OverviewPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By summary=By.xpath("//div[@class='summary_info']//div[contains(@class,'summary')]");
	private By finish=By.id("finish");
	private By cancel=By.id("cancel");
	
	public void toGetSummary()
	{
		List<WebElement> summaryinfo = driver.findElements(summary);
		for(WebElement i:summaryinfo)
		{
			System.out.println(i.getText());
		}
	}
	public void tocancel()
	{
		driver.findElement(cancel).click();
	}
	public void toFinish()
	{
		driver.findElement(finish).click();
	}

}
