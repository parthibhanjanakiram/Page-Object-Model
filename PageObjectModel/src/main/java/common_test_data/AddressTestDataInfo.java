package common_test_data;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;
import java.io.IOException;

public class AddressTestDataInfo 
{
	static Workbook wrkb;
	
	public static void workBook() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./pomTestData/Addressdetails.xlsx");
		wrkb= WorkbookFactory.create(fis);
	}
	
	public static String name() throws EncryptedDocumentException, IOException
	{
		AddressTestDataInfo.workBook();
		String name= wrkb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		return name;
	}

	public static String houseNo() throws EncryptedDocumentException, IOException
	{
		AddressTestDataInfo.workBook();
		String houseNo= wrkb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		return houseNo;
	}
	
	public static String street() throws EncryptedDocumentException, IOException
	{
		AddressTestDataInfo.workBook();
		String street= wrkb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		return street;
	}
	
	public static String landmark() throws EncryptedDocumentException, IOException
	{	
		AddressTestDataInfo.workBook();
		String landmark= wrkb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		
		return landmark;
	}
	
	public static String country() throws EncryptedDocumentException, IOException
	{
		AddressTestDataInfo.workBook();
		String country= wrkb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		
		return country;
	}
	
	public static String state() throws EncryptedDocumentException, IOException
	{
		
		AddressTestDataInfo.workBook();
		String state= wrkb.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
		
		return state;
	}
	
	public static String city() throws EncryptedDocumentException, IOException
	{
		AddressTestDataInfo.workBook();
		String city= wrkb.getSheet("Sheet1").getRow(1).getCell(6).getStringCellValue();
		
		return city;
	}
	
	public static String pincode() throws EncryptedDocumentException, IOException
	{	
		AddressTestDataInfo.workBook();
		String pincode= wrkb.getSheet("Sheet1").getRow(1).getCell(7).getStringCellValue();
		
		return pincode;
	}
	
	public static String phoneNumber() throws EncryptedDocumentException, IOException
	{
		AddressTestDataInfo.workBook();
		String phoneNumber= wrkb.getSheet("Sheet1").getRow(1).getCell(8).getStringCellValue();
		
		return phoneNumber;
	}
}
