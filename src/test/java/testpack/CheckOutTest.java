package testpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutTest extends BaseClass{
  @Test(priority=1)
  public void toEnterDetails() {
	  cop.toEnterData("Shima", "Mohan", "560060");
	  toSetThread();
	  
  }
  @Test(priority=2)
  public void toCancelOrder() {
	  cop.toCancel();
	  cp.toCheckOut();
	  toSetThread();
	  toEnterDetails();
	  
  }
  @Test(priority=3)
  public void toContinue() {
	  cop.toContinue();
	  toSetThread();
	  Assert.assertTrue(driver.getCurrentUrl().contains("checkout-step-two"),"Failed to continue shopping");
	  System.out.println("successfully entered details");
	  
	  
  }
}
