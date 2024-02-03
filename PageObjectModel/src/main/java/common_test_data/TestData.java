package common_test_data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestData
{
	static Workbook wb;
	
	public static void dataPoint() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./pomTestData/Book1.xlsx");   // it will show filenotfoundException

	     wb= WorkbookFactory.create(fis);     // IO exception occurs	
	}
	
	public static String url() throws EncryptedDocumentException, IOException
	{
		TestData.dataPoint();
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		return url;
		
	}

	public static String email() throws EncryptedDocumentException, IOException
	{
		TestData.dataPoint();
		String email = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		return email;
		
	}
	
	public static String password() throws EncryptedDocumentException, IOException
	{  
		TestData.dataPoint();
		String pwd = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		
		return pwd;
		
	}
}
