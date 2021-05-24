package com.TestPrograms.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(".\\src\\test\\Resources\\TestExcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("test");
		System.out.println(sheet.getRow(0).getCell(0).toString());
	}

}
