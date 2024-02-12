package testpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseClass {
  @Test(priority=1)
  public void toRemoveProduct() 
  {
	  cp.toRemove();
	  toSetThread();
	  Assert.assertTrue(driver.getCurrentUrl().contains("cart"));
	  System.out.println("successfully removed");
	  
  }
  @Test(priority=2)
  public void toContinueShopping() 
  {
	  cp.toContinue();
	  toSetThread();
	  Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
	  System.out.println("Page will redirect to inventory page");
	  ip.toSelectItem("Sauce Labs Bike Light");
	  toSetThread();
	  ip.toaddCart();
	  ip.toCart();
	  
  }
  @Test(priority=3)
  public void toCheckout() 
  {toSetThread();
	  cp.toCheckOut();
	  Assert.assertTrue(driver.getCurrentUrl().contains("checkout"), "failed to checkout");
	  System.out.println("checkout succesfully");
  }
}
