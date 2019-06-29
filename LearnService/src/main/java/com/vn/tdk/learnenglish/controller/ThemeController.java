package com.vn.tdk.learnenglish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.entity.Theme;
import com.vn.tdk.learnenglish.sevices.ThemeServices;

@CrossOrigin()
@RestController
public class ThemeController {
	@Autowired
	ThemeServices themeServices;

	@RequestMapping(value = "theme", method = RequestMethod.GET)
	public List<Theme> getThemeAll() {
		return themeServices.getAll();
	}

}