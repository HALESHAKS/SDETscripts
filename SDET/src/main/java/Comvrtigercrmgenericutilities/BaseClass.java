
	package Comvrtigercrmgenericutilities;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;

	import Com.crm.comcast.Objectrepository.Home;
	import Com.crm.comcast.Objectrepository.Login;
	import Comvrtigercrmgenericutilities.DatabaseUtilities;
	import Comvrtigercrmgenericutilities.ExcelUtility1;
	import Comvrtigercrmgenericutilities.FileUtility;
	import Comvrtigercrmgenericutilities.JavaUtility;
	import Comvrtigercrmgenericutilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {
	public static WebDriver staticDriver;
	public FileUtility flib=new FileUtility();
	public ExcelUtility1 elib = new ExcelUtility1();
	public  JavaUtility jLib = new JavaUtility();
	public  WebDriverUtility wLib = new WebDriverUtility();
	public DatabaseUtilities dbLib = new DatabaseUtilities();
	public  WebDriver driver;

	@BeforeSuite
	public void configBS() {
		System.out.println("DB & extend repost config");
		dbLib.connectToDB();
	}

	@BeforeClass
	public void configBC() throws Throwable {
		System.out.println("launch the browser");
	       /*read common Data*/

			String URL = flib.getPropertykeyvalues("url");
			String BROWSER = flib.getPropertykeyvalues("browser");
			WebDriverManager.chromedriver().setup();
			
			 /* launch the browser*/
			  if(BROWSER.equals("chrome")) {
				  driver = new ChromeDriver();
			  }else if(BROWSER.equals("firefox")) {
				  driver = new FirefoxDriver();			  
			  }else if(BROWSER.equals("ie")) {
				  driver = new InternetExplorerDriver();			  
			  }
			  wLib.waitForElement(driver);
			  driver.get(URL);
	}

	@BeforeMethod
	public void configBM() throws Throwable {
		System.out.println("login");
		 String USERNAME = flib.getPropertykeyvalues("username");
		 String PASSWORD = flib.getPropertykeyvalues("password");
		  
		 /*step 1 login to app*/
		  Login lp = new Login(driver);
		  lp.loginToAPP(USERNAME, PASSWORD);
	}
	//@AfterMethod
	//public void configAM() {
	//	System.out.println("logout");
	//	 /*step 5:  logout*/
		//Home hp = new Home(driver);
		//  hp.logout();
	//}

	@AfterClass
	public void configAC() {
		System.out.println("close the browser");
		 /*step 2 : close the browser*/ 
		  driver.close();

	}
	@AfterSuite
	public void configAS() throws Throwable {
		//System.out.println("close DB & extend repost objects");
		dbLib.closeDb();
	}


	}