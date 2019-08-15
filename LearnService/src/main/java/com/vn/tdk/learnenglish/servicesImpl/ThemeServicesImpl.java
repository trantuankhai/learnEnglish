package com.vn.tdk.learnenglish.servicesImpl;

import java.io.File;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.dao.ThemeDao;
import com.vn.tdk.learnenglish.entity.Theme;
import com.vn.tdk.learnenglish.sevices.ThemeServices;

@Service
public class ThemeServicesImpl implements ThemeServices {

	@Autowired
	private ThemeDao themeDao;
	@Autowired 

	@Override
	public Integer insert(Theme theme) {
		// TODO Auto-generated method stub
		return themeDao.insert(theme);
	}

	@Override
	public String edit(Theme theme) {
		// TODO Auto-generated method stub
		return themeDao.edit(theme);
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
		return null;
	}

	@Override
	public Theme getByKey(int key) {
		// TODO Auto-generated method stub
		return themeDao.getByKey(key);
	}

}
