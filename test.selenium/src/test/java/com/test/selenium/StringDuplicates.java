

package com.test.selenium;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicates {
	
	public static void main(String[] args) {
		String s = "malayalam";
		
		String[] s1;
		Map<String, Integer> s3 = new HashMap<String, Integer>();
		for(int i=0; i<s.length();i++)
		{
			s1 = (s+" ").split(s.substring(i,i+1));
			System.out.println(s.substring(i,i+1));
			System.out.println("-----------------");
			for (String a : s1) 
	            System.out.println(a);
//			System.out.println(s.substring(i,i+1)+"====>"+s.split(s.substring(i,i+1)).length);
//			System.out.println(s.substring(i,i+1)+"====>"+s1.length);
			s3.put(s.substring(i,i+1),s1.length-1);
			System.out.println("-----------------"+(s1.length-1));
		}
		
		for (Map.Entry<String, Integer> m: s3.entrySet()) {
			System.out.println(m.getKey()+"======>"+m.getValue());
		}
		
//		s1 = s.split("m");
//		System.out.println(s1.length);
		
		
		
		
//		= s.split("")
	}

}
