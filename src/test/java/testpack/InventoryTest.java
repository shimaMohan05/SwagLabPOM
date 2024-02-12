package testpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryTest extends BaseClass{
  @Test(priority=1)
  public void itemCountValidation() {
	  toSetThread();
	 int count= ip.toCountItem();
	 Assert.assertEquals(count, 6);
	 System.out.println("Expected count obtained");
	  
  }
  @Test(priority=2)
  public void itemClickTest() {
	  toSetThread();
	 ip.toSelectItem("Sauce Labs Backpack");
	 String url=driver.getCurrentUrl();
	 Assert.assertTrue(url.contains("inventory-item"), "Fail: failed to select item");
	 System.out.println("Expected item selected");
	  
  }
  @Test(priority=3)
  public void toAddCart() {
	  toSetThread();
	 ip.toaddCart();
	 String url=driver.getCurrentUrl();
	 Assert.assertTrue(url.contains("inventory-item"), "Fail: failed to select item");
	 System.out.println("Expected item selected");
	  
  }
  @Test(priority=4)
  public void toCart() {
	  toSetThread();
	 ip.toCart();
	 String url=driver.getCurrentUrl();
	 Assert.assertTrue(url.contains("cart"), "Fail: failed to select item");
	 System.out.println("Cart page opened");
	  
  }
  
  
}
