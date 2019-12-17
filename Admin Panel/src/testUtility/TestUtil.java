package testUtility;

import java.util.ArrayList;

public class TestUtil {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDatafromExcel()
	{
		ArrayList<Object[]> myData= new ArrayList<Object[]>();
		
		try {
			reader= new Xls_Reader("C:\\Users\\Jeemol Jayakumar\\eclipse-workspace\\Admin Panel\\src\\testData\\TestData.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		int rowCount=reader.getRowCount("Sheet1");
		
		for(int rowNum=2; rowNum<=rowCount; rowNum++)
		{
			String agency=reader.getCellData("Sheet1", "agency", rowNum);
			String username=reader.getCellData("Sheet1", "username", rowNum);
			String password=reader.getCellData("Sheet1", "password", rowNum);
			
			Object obj[]= {agency,username,password};
			myData.add(obj);
		}
		return myData;
	}

}
