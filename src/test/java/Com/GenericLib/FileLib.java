package Com.GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib extends BaseTest
{
	public String getPropData(String key, String propertypath) throws IOException
	{
		FileInputStream fs=new FileInputStream(propertypath);
		Properties p=new Properties();
		p.load(fs);
		String browser=p.getProperty(key);
		return browser;
		
	}
	
	public String getExcelData(String excelpath,String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fs=new FileInputStream(excelpath);
		
		Workbook wb=WorkbookFactory.create(fs);
		return wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue().toString();
		
	}
	
	public int getRownumber(String excelpath, String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fs=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fs);
		return wb.getSheet(sheet).getLastRowNum();
	}
	
}
