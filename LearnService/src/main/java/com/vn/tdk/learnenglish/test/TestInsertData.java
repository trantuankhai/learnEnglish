package com.vn.tdk.learnenglish.test;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vn.tdk.learnenglish.sevices.readDataFromExcel;

public class TestInsertData {
	@Autowired
	private static readDataFromExcel dataFromExcel;
	public static void main(String[] args) throws IOException {
		List data = dataFromExcel.getDataFromFile("D:\\KHAITT\\datatest.xlsx");
		
	}

}
