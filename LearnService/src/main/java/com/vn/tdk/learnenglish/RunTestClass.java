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

	        // create an instance of BufferedReader
	        // using try with resource, Java 7 feature to close resources
	        try (BufferedReader br = Files.newBufferedReader(pathToFile,
	                StandardCharsets.US_ASCII)) {

	            // read the first line from the text file
	            String line = br.readLine();

	            // loop until all lines are read
	            while (line != null) {

	                // use string.split to load a string array with the values from
	                // each line of
	                // the file, using a comma as the delimiter
	                String[] attributes = line.split(",");

	                Theme theme = createBook(attributes);

	                // adding book into ArrayList
	                themes.add(theme);

	                // read next line before looping
	                // if end of file reached, line would be null
	                line = br.readLine();
	            }

	        } catch (IOException ioe) {
	            ioe.printStackTrace();
	        }

	        return themes;
	    }
	   private static Theme createBook(String[] metadata) {
	        String name_them = metadata[0];
	        String descript_theme =metadata[1];
	        String short_url_theme = metadata[2];
	        String image_descript_theme = metadata[3];

	        // create and return book of this metadata
	        return new Theme(name_them, descript_theme, short_url_theme, image_descript_theme);
	    }

}
