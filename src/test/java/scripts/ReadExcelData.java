package scripts;

import java.util.List;
import java.util.Map;

import utilities.ExcelUtil;

public class ReadExcelData {

	public static void main(String[] args) {
		String [][] data = ExcelUtil.readExcelData("TestData.xlsx", "Sheet1");
		
		List<Map<String, String>> dataList = ExcelUtil.readData("TestData.xlsx", "Sheet1");
	}

}
