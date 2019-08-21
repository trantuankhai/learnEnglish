package com.vn.tdk.learnenglish.controller;

import java.io.IOException;
import java.util.List;

import javax.imageio.IIOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vn.tdk.learnenglish.entity.Theme;
import com.vn.tdk.learnenglish.sevices.ThemeServices;

@CrossOrigin
@RestController
public class ThemeController {
	@Autowired
	ThemeServices themeServices;

	@RequestMapping(value = "theme", method = RequestMethod.GET)
	public List<Theme> getThemeAll() {
		return themeServices.getAll();
	}

	@RequestMapping(value = "theme/{id}", method = RequestMethod.DELETE)
	public String deleteTheme(@PathVariable int id) {
		return themeServices.delete(id);
	}

	@RequestMapping(value = "theme", method = RequestMethod.PUT)
	public String updateTheme(@RequestBody Theme theme) {
		return themeServices.edit(theme);
	}

	@RequestMapping(value = "theme", method = RequestMethod.POST)
	public Integer addTheme(@RequestBody Theme theme) {
		return themeServices.insert(theme);
	}
	@RequestMapping(value = "importData", method = RequestMethod.POST)
	public String addTheme(@RequestBody MultipartFile file) throws IOException {
		return themeServices.importDataFromExcel(file);
	}
}
