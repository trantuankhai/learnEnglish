package com.vn.tdk.learnenglish;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class LearnEnglishApplication {

	public static void main(String[] args) throws IOException {
		//
		// An excel file name. You can create a file name with a full
		// path information.
		//
		String fileName = "D:\\KHAITT\\datatest.xlsx";
		// Create an ArrayList to store the data read from excel sheet.
		//
		List sheetData = new ArrayList();

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator rows = sheet.rowIterator();
			while (rows.hasNext()) {
				XSSFRow row = (XSSFRow) rows.next();
				Iterator cells = row.cellIterator();
				List data = new ArrayList();
				while (cells.hasNext()) {
					XSSFCell cell = (XSSFCell) cells.next();
					data.add(cell);
				}
				sheetData.add(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
		showExelData(sheetData);
	}

	private static void showExelData(List sheetData) {
		for (int i = 0; i < sheetData.size(); i++) {
			List list = (List) sheetData.get(i);
			// for (int j = 0; j < list.size(); j++) {
			XSSFCell Name_theme = (XSSFCell) list.get(0);
			XSSFCell Short_descript = (XSSFCell) list.get(1);
			XSSFCell image_descript = (XSSFCell) list.get(2);
			XSSFCell short_url = (XSSFCell) list.get(3);
			System.out.print(Name_theme.getRichStringCellValue().getString()
					+ " , ");
			System.out.print(Short_descript.getRichStringCellValue()
					.getString() + " , ");
			System.out.print(image_descript.getRichStringCellValue()
					.getString());
			System.out.print(short_url.getRichStringCellValue().getString());

			System.out.println("");
		}
	}

}
