package testUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtility 

{
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	public static String ExcelPath = "C:\\Users\\Jeemol Jayakumar\\eclipse-workspace\\Admin Panel\\src\\testData\\TestData.xlsx";
	
	public static Object[][] getExcelData(String Sheet1)
	{
		FileInputStream file = null;
		
		try {
			file= new FileInputStream(ExcelPath);
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			}
		try {
			book = WorkbookFactory.create(file);
			}catch(InvalidFormatException e) {
			e.printStackTrace();
			}catch (IOException e) {
			e.printStackTrace();
			}	
		sheet = book.getSheet(Sheet1);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0; i<sheet.getLastRowNum();i++)
		{
			for(int k=0; k<sheet.getRow(0).getLastCellNum();k++)
			{
				data[i][k]=sheet.getRow(i + 1).getCell(k).toString();
			}
		} 
		return data;
	}
}
