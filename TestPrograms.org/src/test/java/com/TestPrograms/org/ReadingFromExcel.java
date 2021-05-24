package com.TestPrograms.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File("./src/test/Resources/TestExcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook b = WorkbookFactory.create(fis);
		System.out.println(b.getSheet("test").getRow(0).getCell(0));
	}

}
