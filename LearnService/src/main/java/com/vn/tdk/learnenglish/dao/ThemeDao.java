package com.vn.tdk.learnenglish.dao;

import java.util.List;

import com.vn.tdk.learnenglish.entity.Theme;

public interface ThemeDao extends TempleteDao<Theme> {
	public List<Theme> getThem(int min, int max);

}
