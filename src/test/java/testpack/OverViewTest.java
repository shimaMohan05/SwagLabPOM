package testpack;

import org.testng.annotations.Test;

import utility.UtilityClass;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OverViewTest extends BaseClass{
  @Test(priority=1)
  public void toGetSummaryinfo() {
	  toSetThread();
	  op.toGetSummary();
	  UtilityClass.totakeScreenShot(driver);
	  toSetThread();
  }
  @Test(priority=2)
  public void toFinishShopping() {
	  op.toFinish();
	  toSetThread();
	  UtilityClass.totakeScreenShot(driver);
	  Assert.assertTrue(driver.getCurrentUrl().contains("checkout-complete"),"Failed to compleate shopping");
	  System.out.println("Succesfull shopping");
  }
  
}
