package com.vn.tdk.learnenglish.servicesImpl;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.poi.ss.usermodel.*;
import com.vn.tdk.learnenglish.dao.ThemeDao;
import com.vn.tdk.learnenglish.entity.Theme;
import com.vn.tdk.learnenglish.sevices.ThemeServices;

@Service
public class ThemeServicesImpl implements ThemeServices {

	@Autowired
	ThemeDao themeDao;

	@Override
	public Integer insert(Theme theme) {
		// TODO Auto-generated method stub
		return themeDao.insert(theme);
	}

	@Override
	public String edit(Integer id, Theme object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return themeDao.delete(id);
	}

	@Override
	public List<Theme> getAll() {
		// TODO Auto-generated method stub
		return themeDao.getAll();
	}

	@Override
	public List<Theme> getThem(int min, int max) {
		// TODO Auto-generated method stub
		return themeDao.getThem(min, max);
	}

	@Override
	public String importDataFromExcel(String url) {
		// Create workbook from a file excel
		Workbook workbook = WorkbookFactory.create(new File(url));
		// Retrieving the number of sheets in the Workbook
		System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
		Iterator<Sheet> sheetIterator = workbook.sheetIterator();
		System.out.println("Retrieving Sheets using Iterator");
		while (sheetIterator.hasNext()) {
			Sheet sheet = sheetIterator.next();
			System.out.println("=> " + sheet.getSheetName());
		}
		Sheet sheet = workbook.getSheetAt(0);
		for (Row row : sheet) {
			for (Cell cell : row) {
				String cellValue = dataFormatter.formatCellValue(cell);
				System.out.print(cellValue + "\t");
			}
			System.out.println();
		}
		System.out.println();
		workbook.close();

		return null;
	}

}
