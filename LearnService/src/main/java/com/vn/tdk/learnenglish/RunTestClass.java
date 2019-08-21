package com.vn.tdk.learnenglish;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.vn.tdk.learnenglish.entity.Theme;

public class RunTestClass {

	public static void main(String[] args) {
		List<Theme> themes = readThemesFromCSV("C:\\Users\\TTM Dev\\Desktop\\data.csv");
		for (Theme theme : themes) {
			System.out.println(theme.toString());
		}
	}

	private static List<Theme> readThemesFromCSV(String fileName) {
		List<Theme> themes = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);

		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {

			String line = br.readLine();

			while (line != null) {

				String[] attributes = line.split(",");
				for (int i = 1; i < attributes.length; i++) {

				}
				Theme theme = createBook(attributes);
				themes.add(theme);

				line = br.readLine();
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return themes;
	}

	private static Theme createBook(String[] metadata) {
		String name_them = metadata[0];
		String descript_theme = metadata[1];
		String short_url_theme = metadata[2];
		String image_descript_theme = metadata[3];

		// create and return book of this metadata
		return new Theme(name_them, descript_theme, short_url_theme, image_descript_theme);
	}

}
