package testpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import pagepack.CartPage;
import pagepack.CheckOutPage;
import pagepack.InventoryPage;
import pagepack.LoginPage;
import pagepack.OverviewPage;
import utility.UtilityClass;

public class BaseClass {
	public ExtentReports extent;
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	public CartPage cp;
	public CheckOutPage cop;
	public OverviewPage op;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	//PropertiesClass pc;
	@BeforeSuite
	public void getExtentReport()
	{
		extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("report/swaglab.html");
		extent.attachReporter(spark);
		spark.config().setReportName("Overview automation");
		spark.config().setDocumentTitle("end to end scenario report");
		spark.config().setTheme(Theme.DARK);
		test=extent.createTest("end to end test");
		
		
	}
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 //   pc=new PropertiesClass();
		driver.get(UtilityClass.getData1("url"));
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		cp=new CartPage(driver);
		cop=new CheckOutPage(driver);
		op=new OverviewPage(driver);
	}
	//@Parameters({"uname","pword"})
	@BeforeClass
	public void startUp()
	{
		lp.toLogin(UtilityClass.getData1("uname"), UtilityClass.getData1("pword"));
		UtilityClass.totakeScreenShot(driver);
		test.pass("login successfully ");
		toSetThread();
		ip.toSelectItem(UtilityClass.getData1("product1"));
		test.pass("product selected");
		UtilityClass.totakeScreenShot(driver);
		toSetThread();
		ip.toaddCart();
		test.pass("product is added to cart correctly");
		UtilityClass.totakeScreenShot(driver);
		ip.toCart();
		test.pass("cart page opened");
		toSetThread();
		cp.toCheckOut();
		test.pass("redirected to checkout page");
		toSetThread();
		UtilityClass.totakeScreenShot(driver);
		cop.toEnterData(UtilityClass.getData1("fname"), UtilityClass.getData1("lname"), UtilityClass.getData1("zip"));
		toSetThread();
		test.pass("entered address correctly");
		UtilityClass.totakeScreenShot(driver);
		cop.toContinue();
		
		
	}
	public static void toSetThread()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterTest
	public void tearOut()
	{
		driver.quit();
	}
	@AfterSuite
	public void flushOut()
	{
		extent.flush();
	}

}
