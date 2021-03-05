package Calender;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility 
{

public String getExcelData(String sheetName,int rowNum,int colNum)
{
	
	FileInputStream fis = new FileInputStream("./excel/testdata.xlsx");
Workbook wb = WorkbookFactory.create(fis);
sh=wb.getSheet(sheetName);
