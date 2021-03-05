package Comvrtigercrmgenericutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility1 {
/** this method will return  single cell value in excel sheet
 * @param sheetName
 * @param rownum
 * @param cellnum
 * @return cell value
 * @throws Throwable 
 
 */
	public String readDatafromExcel(String sheetName,int rownum,int cellnum) throws Throwable
	{
		FileInputStream fis = new FileInputStream(".\\TestData\\SDET.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		return cell.getStringCellValue();
	}
	public String getDatafromExcel(String sheetName,String testcaseID,String columnHeader) throws Throwable
	{
		int expectedRowNum=0;
		int expectedCellNum=0;
		FileInputStream fis = new FileInputStream(".\\TestData\\SDET.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int lastRowNum=sh.getLastRowNum();
		//traverse in row
		for(int i=0;i<=lastRowNum;i++)
		{
			String actualID = sh.getRow(i).getCell(0).getStringCellValue();
	if(actualID.equals(testcaseID))
	{
		expectedRowNum=i;
		break;
	}}
	
		//traverse in column
		  int lastCellNum = sh.getRow(expectedRowNum).getLastCellNum();

			for(int j=0;j<lastCellNum;j++)
			{
			
		String actualHeader = sh.getRow(expectedRowNum-1).getCell(j).getStringCellValue();
		if(actualHeader.equals(columnHeader))
		{
			expectedCellNum=j;
			break;
	
		}}
			return sh.getRow(expectedRowNum).getCell(expectedCellNum).getStringCellValue();
	}
		 public static void main(String[] args) throws Throwable
{
	String org = new ExcelUtility1().getDatafromExcel("Sheet1", "TC_01", "OrganizationName");
	String con = new ExcelUtility1().getDatafromExcel("Sheet1", "TC_01", "ContactName");
	System.out.println(org);
	System.out.println(con);
	System.out.println(new ExcelUtility1().readDatafromExcel("Sheet1",3, 3));
}
}