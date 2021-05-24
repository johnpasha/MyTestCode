package com.test.selenium;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReverseString {

//		 public static void main(String[] args)
//		    {
//		        String input = "GeeksForGeeks";
//		 
//		        // convert String to character array
//		        // by using toCharArray
//		        char[] try1 = input.toCharArray();
//		 
//		        for (int i = try1.length - 1; i >= 0; i--)
//		            System.out.println(try1[i]);
//		    }
//	public static void main(String[] args)
//    {
//        String input = "Geeks for Geeks";
// 
//        StringBuffer input1 = new StringBuffer(input);
// 
//        // append a string into StringBuilder input1
////        input1.append(input);
// 
//        // reverse StringBuilder input1
//        input1.reverse();
// 
//        // print reversed String
//        System.out.println();
//        System.out.println(input1);
//    }
	@Test(dependsOnMethods = {"test1"})
	@Parameters({"browser"})
	public  void test(String b) {
		String in = b;
		char[] ch = in.toCharArray();
		char[] rev= new char[ch.length];
		for (int i=0; i<ch.length;i++) {
			rev[i] = ch[ch.length-i-1];
			
		}
		System.out.print(rev);
		Assert.fail();
	}
	@Test
	public  void test1() {
		String in = "skeeG rof skeeG";
		char[] ch = in.toCharArray();
		char[] rev= new char[ch.length];
		for (int i=0; i<ch.length;i++) {
			rev[i] = ch[ch.length-i-1];
			
		}
		System.out.print(rev);
		Assert.fail("deliberately failed");
	}
	@Test
	public static void test2() {
		String in = "skeeG rof skeeG";
		char[] ch = in.toCharArray();
		char[] rev= new char[ch.length];
		for (int i=0; i<ch.length;i++) {
			rev[i] = ch[ch.length-i-1];
			
		}
		System.out.print(rev);
	}
	@Test
	public static void test3() {
		String in = "skeeG rof skeeG";
		char[] ch = in.toCharArray();
		char[] rev= new char[ch.length];
		for (int i=0; i<ch.length;i++) {
			rev[i] = ch[ch.length-i-1];
			
		}
		System.out.print(rev);
	}
	@Test
	public static void test4() {
		String in = "skeeG rof skeeG";
		char[] ch = in.toCharArray();
		char[] rev= new char[ch.length];
		for (int i=0; i<ch.length;i++) {
			rev[i] = ch[ch.length-i-1];
			
		}
		System.out.print(rev);
	}
	
	public static void main(String[] args) throws Exception {
		String in = "skeeG rof skeeG";
		System.out.println(in.length());

		System.out.println(in.replaceAll("s", ""));
		System.out.println(in);
//		throw new Exception("test");
		
		//throw new FileNotFoundException();
	}
	

}
