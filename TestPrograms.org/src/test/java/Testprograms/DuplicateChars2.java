package Testprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateChars2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dup= "salklsofhdslfusafglkasdfarfsdsrwaedschkxgfds";
		char c[] = dup.toCharArray();
		System.out.println(dup);
		dup.replace("s", "");
		Arrays.sort(c);
//		System.out.println(dup.length());
//		System.out.println(dup.replace("s", "").length());
		System.out.println(c);
		Map<String, Integer> m = new HashMap<String, Integer>();
		String temp=null;
		
		for(int i=0; i<c.length;i++) {
			temp= String.valueOf(c[i]);
			if(m.containsKey(temp)) {
				m.put(temp, m.get(temp)+1);
			}else {
				m.put(temp, 1);
			}
		}
		
		for(Map.Entry<String, Integer> e:m.entrySet()) {
			System.out.println(e.getKey()+"="+e.getValue());
		}

	}

}
