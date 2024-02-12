package pagepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	private WebDriver driver;
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}
private By remove=By.xpath("//button[text()='Remove']");
private By checkout=By.id("checkout");
private By contshop=By.id("continue-shopping");

public void toRemove()
{
	driver.findElement(remove).click();
	}
public void toContinue()
{
	driver.findElement(contshop).click();
	
	}
public void toCheckOut()
{driver.findElement(checkout).click();
	}

}
