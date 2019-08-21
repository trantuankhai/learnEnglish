package com.vn.tdk.learnenglish.sevices;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.vn.tdk.learnenglish.entity.Theme;

public interface ThemeServices extends services<Theme> {
	public List<Theme> getThem(int min, int max);

	public String importDataFromExcel(MultipartFile file) throws IOException;
	public List<Theme> readfileCsv(String pathFile);
	public Theme createThemeFromFileCsv(String[] arrayString);
	
	
}
 