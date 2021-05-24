package com.Automate.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {

	public XSSFWorkbook readExcel(String excelPath) throws IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		return wb;
	}

}
