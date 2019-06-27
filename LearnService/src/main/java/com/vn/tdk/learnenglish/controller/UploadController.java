package com.vn.tdk.learnenglish.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vn.tdk.learnenglish.sevices.uploadService;

@RestController
public class UploadController {
	@Autowired
	uploadService uploadService;

	@PostMapping(value = "image")
	public String uploadImage(@RequestBody MultipartFile file) throws IOException {
		return uploadService.uploadFile(file);
	}

	@GetMapping(value = "image/{link}")
	public Resource getAvatar(@PathVariable("link") String link) throws IOException {
		return uploadService.getFile(link);
	}
}
