package Com.GenericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class WebDriberCommLib extends BaseTest
{
	public void waitForPageTitle() throws Throwable
	{
		FileLib flib=new FileLib();
		@SuppressWarnings("deprecation")
		WebDriverWait ww=new WebDriverWait(driver, 20);
		ww.until(ExpectedConditions.titleIs(flib.getPropData("hometitle", PROPERTY_PATH)));
	}
	
	public void Scroll(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+element.getLocation());
	}
	
	public void verifyPageTitle(String act, String exp)
	{
		
		Assert.assertEquals(act, exp);
		Reporter.log("actual page title" + act +" matched with expected page title"+ exp , true);
		
	}
	public void verifyTitle(String exp)
	{
		String act=driver.getTitle();
		Assert.assertEquals(act, exp);
		Reporter.log("actual page title" + act +" matched with expected page title"+ exp , true);
	}
	
	public void verifyPageLink(String exp)
	{
		String act=driver.getCurrentUrl();
		Assert.assertEquals(act, exp);
		Reporter.log("actual page is" + act +" matched with expected page "+ exp , true);
		
	}
	
	@SuppressWarnings("deprecation")
	public void implesitwait()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void explisitwait(WebElement element)
	{
		WebDriverWait ww=new WebDriverWait(driver, 30);
		ww.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void actions(WebElement targetelement)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(targetelement).perform();
	}

	
}
