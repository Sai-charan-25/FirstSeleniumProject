package Execution;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;


import Com.ElementsModules.TextBoxModule;
import Com.GenericLib.BaseTest;
import Com.GenericLib.FileLib;
import Com.GenericLib.Path;
import Com.GenericLib.WebDriberCommLib;
import Com.Pages.Elements;
import Com.Pages.HomePage;

public class Valid extends BaseTest implements Path
{
	Logger log = Logger.getLogger(Valid.class);
	@Test(priority=1)
	public void validexe() throws IOException, InterruptedException
	{
//		BaseTest bt=new BaseTest();
//		bt.openBrowser();
		HomePage hp=new HomePage();
		Thread.sleep(3000);
		hp.homepage();
		log.info("***********Home Page Displayed***********");
		log.error("########## this is just for remembering the error method in log files ###########");
		log.debug("########## this is just for remembering the debug method in log files ###########");
		log.fatal("########## this is just for remembering the fatal method in log files ###########");
		log.warn("########### this is just for remembering the warn method in log files ############");
		Reporter.log("done",true);
		
	}
	@Test(priority=2)
	public void elementexe() throws Throwable
	{
		Elements ele=new Elements();
		ele.elementsBox();
		log.info("***********Element Displayed***********");
	}
	
	@Test(priority=3)
	public void textBxexe() throws EncryptedDocumentException, IOException
	{
		TextBoxModule tb=new TextBoxModule();
//		WebDriberCommLib wlib=new WebDriberCommLib();
//		wlib.implesitwait();
		FileLib flib=new FileLib();
		tb.textBxmod(flib.getExcelData(EXCEL_PATH, flib.getPropData("sheetname", PROPERTY_PATH), 1, 0), 
					 flib.getExcelData(EXCEL_PATH, flib.getPropData("sheetname", PROPERTY_PATH), 1, 1), 
					 flib.getExcelData(EXCEL_PATH, flib.getPropData("sheetname", PROPERTY_PATH), 1, 2), 
					 flib.getExcelData(EXCEL_PATH, flib.getPropData("sheetname", PROPERTY_PATH), 1, 3));
		
		log.info("***********Entered Text is displayed***********");
		
	}

	
}
