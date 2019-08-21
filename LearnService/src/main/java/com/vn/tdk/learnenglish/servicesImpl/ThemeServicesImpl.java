package com.vn.tdk.learnenglish.servicesImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.vn.tdk.learnenglish.dao.ThemeDao;
import com.vn.tdk.learnenglish.entity.Theme;
import com.vn.tdk.learnenglish.sevices.ThemeServices;
import com.vn.tdk.learnenglish.sevices.uploadService;

@Service
public class ThemeServicesImpl implements ThemeServices {

	@Autowired
	private ThemeDao themeDao;
	@Autowired
	private uploadService upload;

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
	public Theme getByKey(int key) {
		// TODO Auto-generated method stub
		return themeDao.getByKey(key);
	}

	@Override
	public String importDataFromExcel(MultipartFile file) throws IOException {
		int count = 0;
		String urlFile = upload.uploadFileImportData(file);
		List<Theme> themes = readfileCsv(urlFile);
		for (Theme theme : themes) {
			if (themeDao.insert(theme) != -1) {
				count++;
			}
		}
		return "INSERT " + count + " DATA";
	}

	@Override
	public List<Theme> readfileCsv(String pathFile) {
		List<Theme> themes = new ArrayList<>();
		Path pathToFile = Paths.get(pathFile);
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
			String line = br.readLine();
			while (line != null) {

				String[] attributes = line.split(",");
				Theme theme = createThemeFromFileCsv(attributes);
				themes.add(theme);

				line = br.readLine();
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return themes;
	}

	@Override
	public Theme createThemeFromFileCsv(String[] arrayString) {

		String name_them = arrayString[0];
		String descript_theme = arrayString[1];
		String image_descript_theme = arrayString[2];
		String short_url_theme = arrayString[3];
		return new Theme(name_them, descript_theme, short_url_theme, image_descript_theme);
	}

}
