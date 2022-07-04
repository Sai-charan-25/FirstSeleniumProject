package Com.ElementsModules;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.GenericLib.BaseTest;
import Com.GenericLib.FileLib;
import Com.GenericLib.WebDriberCommLib;

public class TextBoxModule extends BaseTest
{
	
	//span[.='Text Box']//..
	
	@FindBy(xpath="//span[.='Text Box']//..") private WebElement lfttxtBXmenu;
	
	public WebElement getlfttxtBXmenu()
	{
		return lfttxtBXmenu;
		
	}
	public void setlfttxtBXmenu()
	{
		lfttxtBXmenu.click();
	}
	
	
	
	@FindBy(id="userName") private WebElement fulname;
	
	public WebElement getfulname()
	{
		return fulname;
		
	}
	public void setfulname(String fname)
	{
		fulname.sendKeys(fname);
	}
	
	@FindBy(id="userEmail") private WebElement email;
	
	public WebElement getemail()
	{
		return email;
		
	}
	public void setemail(String mail)
	{
		email.sendKeys(mail);
	}
	
	
	
   @FindBy(id="currentAddress") private WebElement caddrs;
	
	public WebElement getcaddrs()
	{
		return caddrs;
		
	}
	public void setcaddrs(String curaddress)
	{
		caddrs.sendKeys(curaddress);
	}
	
	
	@FindBy(id="permanentAddress") private WebElement paddrs;
	
	public WebElement getpaddrs()
	{
		return paddrs;
		
	}
	public void setpaddrs(String permaddress)
	{
		paddrs.sendKeys(permaddress);
	}
	
	@FindBy(id="submit") private WebElement submitBtn;
	
	public WebElement getsubmitBtn()
	{
		return submitBtn;
		
	}
	public void setsubmitBtn()
	{
		submitBtn.click();
	}
	
	public TextBoxModule()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void textBxmod(String fname, String mail, String curaddress, String permaddress) throws IOException
	{
		
		WebDriberCommLib wlib=new WebDriberCommLib();
		FileLib flib=new FileLib();
		wlib.implesitwait();
		wlib.actions(lfttxtBXmenu);
		lfttxtBXmenu.click();
		wlib.verifyPageLink(flib.getPropData("textBxlink", PROPERTY_PATH));
		fulname.sendKeys(fname);
		email.sendKeys(mail);
		caddrs.sendKeys(curaddress);
		paddrs.sendKeys(permaddress);
		wlib.Scroll(submitBtn);
		submitBtn.click();
		
	}
	
}
