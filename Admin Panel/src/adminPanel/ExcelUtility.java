package adminPanel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	XSSFWorkbook workbook;
	XSSFSheet sheet;

	// Constructor

	public ExcelUtility(String excelpath, String sheetname) {
		init(excelpath, sheetname);
	}

	public void init(String path, String sheetName) {
		try {
			workbook = new XSSFWorkbook(path);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void main(String args[]) throws IOException {
		getRowCount();
		getCelDataString(0, 0);
		getCelDataNumber(1, 1);
		getColCount();
	}

	public int getRowCount() {
		int rowCount = 0;
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		return rowCount;
	}

	public String getCelDataString(int rowNum, int colNum) throws IOException {
		String cellData = null;
		try {
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		} catch (Exception e) {
			cellData = sheet.getRow(rowNum).getCell(colNum).getRawValue();
		}
		System.out.println(cellData);
		return cellData;

	}

	public double getCelDataNumber(int rowNum, int colNum) {
		double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(cellData);
		return cellData;
	}

	public int getColCount() {
		int colCount = 0;
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(colCount);
		return colCount;
	}

}