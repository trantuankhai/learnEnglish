package com.vn.tdk.learnenglish.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vn.tdk.learnenglish.sevices.uploadService;

@CrossOrigin
@RestController
public class UploadController {
	@Autowired
	uploadService uploadService;

	@PostMapping(value = "image")
	public String uploadImage(@RequestBody MultipartFile file) throws IOException {
		return uploadService.uploadFile(file);
	}

	@GetMapping(value = "image/{fileName}")
	public Resource getAvatar(@PathVariable("fileName") String fileName) throws IOException {
		return uploadService.getFileImage(fileName);
	}

	@PostMapping(value = "data")
	public String uploadCsv(@RequestBody MultipartFile file) throws IOException {
		return uploadService.uploadFileImportData(file);
	}

	@GetMapping(value = "data/{fileName}")
	public Resource getCSV(@PathVariable("fileName") String fileName) throws IOException {
		return uploadService.getFileCsv(fileName);
	}

}
