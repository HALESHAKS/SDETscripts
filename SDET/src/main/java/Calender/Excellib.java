package Calender;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Excellib {
	@Test
	public void readdatafromExcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./excel/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	System.out.println(wb.getSheet("Sheet2").getRow(0).getCell(3).toString());
	
	}
	public int getLastrow() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./excel/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("Sheet2").getLastRowNum();
		return rowcount;
	}}


