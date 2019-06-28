package com.vn.tdk.learnenglish.servicesImpl;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.vn.tdk.learnenglish.sevices.uploadService;
import com.vn.tdk.learnenglish.util.ConstanValue;
import com.vn.tdk.learnenglish.util.Status;

@Service
public class UploadFileServicesImpl implements uploadService {
	private final String URL_UPLOAD_FILE_IMAGE = System.getProperty("user.dir") + "/image";

	@Override
	public String uploadFile(MultipartFile file) throws IOException {
		Date date = new Date();
		File file2 = new File(URL_UPLOAD_FILE_IMAGE);
		file2.mkdirs();
		if (file.isEmpty()) {
			return Status.INPUT_NULL;

		} else {
			String nameFile = date.getTime() + removeSpace(file.getOriginalFilename());
			String uploadFilePath = URL_UPLOAD_FILE_IMAGE + "/" + nameFile;
			byte[] bytes = file.getBytes();
			Path path = Paths.get(uploadFilePath);
			Files.write(path, bytes);
			return nameFile;
		}
	}

	@Override
	public Resource getFile(String fileName) throws MalformedURLException {
		if (!ConstanValue.NULL_VALUE.equals(fileName)) {
			File file = new File(URL_UPLOAD_FILE_IMAGE + "/" + fileName);
			return new UrlResource(file.toURI());
		} else {
			return null;
		}

	}

	public String removeSpace(String str) {
		str = str.trim();
		str = str.replaceAll("\\s+", "");
		return str;
	}

}
