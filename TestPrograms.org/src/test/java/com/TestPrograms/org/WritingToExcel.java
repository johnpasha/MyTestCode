package com.TestPrograms.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WritingToExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("test");
		Row row =  sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("sampletext");
		File f = new File(".\\src\\test\\Resources\\TestExcel.xlsx");
		FileOutputStream fout = new FileOutputStream(f);
		book.write(fout);
		book.close();
		
//		FileInputStream fis = new FileInputStream(f);
		//System.out.println(book.getSheet("test").getRow(0).getCell(0));
	}

}
