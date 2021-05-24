package com.Automate.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	Properties p;
	
	public Properties ReadPropertyFile(String propertyFileName) {
		p = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(propertyFileName);
			p.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}
}
