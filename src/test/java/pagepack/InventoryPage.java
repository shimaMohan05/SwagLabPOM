package pagepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
	private WebDriver driver;
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By list=By.xpath("//div[@class='inventory_item_description']//div[@class='inventory_item_name ']");
	private By btn=By.xpath("//button[text()='Add to cart']");
	private By cart=By.xpath("//a[@class='shopping_cart_link']");
	public int toCountItem()
	{
		List<WebElement>proList=driver.findElements(list);
		return proList.size();
	}
	public void toSelectItem(String product)
	{
		List<WebElement>proList=driver.findElements(list);
		for(WebElement i:proList)
		{
			if(i.getText().contains(product))
			{
				i.click();
				break;
			}
		}
		}
		public void toaddCart()
		{
			driver.findElement(btn).click();
		}
		public void toCart()
		{
			driver.findElement(cart).click();
		}
	

}
