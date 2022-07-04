package Com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.GenericLib.BaseTest;
import Com.GenericLib.FileLib;
import Com.GenericLib.WebDriberCommLib;

public class HomePage extends BaseTest
{
	
	@FindBy(xpath="//h5[.='Book Store Application']//../..") private WebElement bukstr;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getbukstr()
	{
		return bukstr;
	}
	public void setbukstr()
	{
		bukstr.click();
	}
	
	
	@FindBy(xpath="")private WebElement mainpage;
	
	public WebElement getmainpage()
	{
		return mainpage;
		
	}
	public void setmainpage()
	{
		
	}
	
	public void homepage() throws InterruptedException, IOException
	{
		WebDriberCommLib wlib=new WebDriberCommLib();
		Thread.sleep(2000);
		FileLib flib=new FileLib();
		wlib.verifyPageLink(flib.getPropData("pagelink", PROPERTY_PATH));
		wlib.verifyTitle(flib.getPropData("maintitle", PROPERTY_PATH));
		wlib.Scroll(bukstr);
	}

	

}
