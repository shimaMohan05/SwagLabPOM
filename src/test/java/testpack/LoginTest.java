package testpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
  @Test(priority=1)
  public void titleTest() {
	 String curTitle= lp.titleCheck();
	  Assert.assertTrue(curTitle.contains("Swag"),"Fail: Failed to fetch the title");
	  System.out.println("SuccessfullyFetched");
  }
  @Test(priority=2)
  public void loginTest() {
	 lp.toLogin("standard_user", "secret_sauce");
	 String url=driver.getCurrentUrl();
	  Assert.assertTrue(url.contains("inventory"),"Fail: Failed to login");
	  System.out.println("Login Successfully");
  }
  
}
