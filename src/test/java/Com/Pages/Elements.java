package Com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.GenericLib.BaseTest;
import Com.GenericLib.FileLib;
import Com.GenericLib.WebDriberCommLib;

public class Elements extends BaseTest
{
	@FindBy(xpath="//h5[.='Elements']")private WebElement elmts;
	public WebElement getelmts()
	{
		return elmts;
		
	}
	public void setelmts()
	{
		elmts.click();
	}
	
	public Elements()
	{
		PageFactory.initElements(driver,  this);
	}
	
	
	
	@FindBy(xpath="//div[@class='main-header']")private WebElement header;
	public WebElement getheader()
	{
		return header;
	}
	
	
	
	public void elementsBox() throws Throwable
	{
		elmts.click();
		WebDriberCommLib wlib=new WebDriberCommLib();
		Thread.sleep(2000);
		FileLib flib=new FileLib();
		wlib.verifyPageLink(flib.getPropData("elementspagelink", PROPERTY_PATH));
		wlib.verifyPageTitle(header.getText(), flib.getPropData("elementpageheader", PROPERTY_PATH));
		
		
	}

}
