package com.TestPrograms.org;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HandlingFiles {

	public static void main(String[] args) throws IOException {
		File f = new File("./src/test/Resources/TestFile.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("text1");
		bw.newLine();
		bw.write("text2");
		bw.newLine();
		bw.write("text3");
		bw.newLine();
		bw.write("text4");
		bw.newLine();
		bw.close();
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s = br.readLine())!=null) {
			System.out.println(s);
		}
		br.close();
	}

}
