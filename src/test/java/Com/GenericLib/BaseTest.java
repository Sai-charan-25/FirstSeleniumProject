package Com.GenericLib;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest implements Path
{
	public static WebDriver driver;
	Logger log = Logger.getLogger(BaseTest.class);
	@BeforeClass
	public void openBrowser() throws IOException
	{
		FileLib flib=new FileLib();
		String webbrowser=flib.getPropData("browser", PROPERTY_PATH);
		if(webbrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			log.info("***********launching the Chrome Browser***********");
		}
		else
		{
			System.setProperty(FIREFOX_KEY, FIREFOX_PATH);
			driver=new FirefoxDriver();
			log.info("***********launching the Firefox Browser***********");
	
		}
		driver.manage().window().maximize();
		
		driver.get(flib.getPropData("url", PROPERTY_PATH));
	}
	
//	@AfterClass
//	public void closeBrowser()
//	{
//		driver.close();
//		log.info("*********** Browser Closed***********");
//	}
	
	
	
}
