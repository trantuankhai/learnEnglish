package com.vn.tdk.learnenglish.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return null;
	}

	@Override
	public List<Theme> getAll() {
		// TODO Auto-generated method stub
		return themeDao.getAll();
	}

}
