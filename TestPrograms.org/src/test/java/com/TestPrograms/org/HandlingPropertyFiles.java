package com.TestPrograms.org;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFiles {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/Resources/OR_Properties.txt");
		Properties p = new Properties();
		p.load(fis);
	
		System.out.println("URL = "+p.get("URL"));
		System.out.println("textbox = "+p.get("textbox"));
		
		p.setProperty("URL", "changed");
		System.out.println("URL = "+p.get("URL"));

	}

}
