package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	/*
	 * Sample script to read Excel Data
	 */

	public static void main(String[] args) throws IOException {

		String workbookName = "SampleWorkbook";
		String worksheetName = "RegisterUserTests";
		String testName = "TC03";
		
		System.out.println(getAllExcelData(workbookName, worksheetName, testName));
		System.out.println("**********");
		System.out.println(getTestData(workbookName, worksheetName, testName));

	}

	public static ArrayList<HashMap<String, String>> getAllExcelData(String workbookName, String worksheetName, String testName) throws IOException {

		ArrayList<HashMap<String, String>> al = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> hm;

		File file = new File(System.getProperty("user.dir") + "//src//test//resources//" + workbookName + ".xlsx");
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet ws = wb.getSheet(worksheetName);
		int totalRows = ws.getLastRowNum() - ws.getFirstRowNum();

		for (int i = 1; i <= totalRows; i++) { // Starting row iteration from first row which contains data
			hm = new HashMap<String, String>();
			XSSFRow eachRow = ws.getRow(i);
			int totalCells = eachRow.getLastCellNum() - eachRow.getFirstCellNum();

			for (int j = 0; j < totalCells; j++) { // Starting column iteration from 0 as column is read from 0
				XSSFCell eachCell = eachRow.getCell(j);
				// System.out.println(eachCell.getStringCellValue());
				hm.put(ws.getRow(0).getCell(j).getStringCellValue(), eachCell.getStringCellValue());
			}
			al.add(hm);
		}
		return al;
	}

	public static HashMap<String, String> getTestData(String workbookName, String worksheetName, String testName)
			throws IOException {

		// ArrayList<HashMap<String, String>> al = new ArrayList<HashMap<String,
		// String>>();
		HashMap<String, String> hm = new HashMap<String, String>();

		File file = new File(System.getProperty("user.dir") + "//src//test//resources//" + workbookName + ".xlsx");
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet(worksheetName);
		int totalRows = ws.getLastRowNum() - ws.getFirstRowNum();
		
		int totalCellsInMatchedRow;
		int matchRowFoundAt = 0;
		XSSFRow eachRow;
		XSSFCell eachCell;
		
		for (int i = 1; i <= totalRows; i++) { // Starting row iteration from first row which contains data
			
			eachRow = ws.getRow(i);
			if (eachRow.getCell(0).getStringCellValue().equals(testName)) {
				matchRowFoundAt = i;
				break;
			}
		}
		
		XSSFRow matchedRow = ws.getRow(matchRowFoundAt);
		totalCellsInMatchedRow = matchedRow.getLastCellNum() - matchedRow.getFirstCellNum();
		
		for (int j = 0;j<totalCellsInMatchedRow;j++) {
			eachCell = matchedRow.getCell(j);
			hm.put(ws.getRow(0).getCell(j).getStringCellValue(), eachCell.getStringCellValue());
		}
		
		return hm;
	}
}
