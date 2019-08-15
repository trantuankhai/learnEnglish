package com.vn.tdk.learnenglish.sevices;

import java.util.List;

import com.vn.tdk.learnenglish.entity.Theme;

public interface ThemeServices extends services<Theme> {
	public List<Theme> getThem(int min, int max);

	public String importDataFromExcel(String url);
	
}
 