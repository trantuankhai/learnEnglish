package com.vn.tdk.learnenglish.sevices;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;


public interface uploadService {
	public String uploadFile(MultipartFile file) throws IOException;

	public Resource getFile(String fileName) throws MalformedURLException;

}
