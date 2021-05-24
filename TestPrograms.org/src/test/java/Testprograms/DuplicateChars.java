package Testprograms;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.MultiSet.Entry;

public class DuplicateChars {

	public static void main(String[] args) {
		//Findout duplicate chars in the String
		
		String s = "dlsfljiosdcsdlfkn";
		char[] c = s.toCharArray();
//		List<String> c1 = null;
//		c1.sort(null);
		Arrays.sort(c);
		System.out.println(c);
		System.out.println(c[0]);
		Map<String,Integer> m = new HashMap<String,Integer>();

		System.out.println();
		
		for (int i=0; i<c.length; i++) {
			if(m.containsKey(String.valueOf(c[i]))) {
				m.put(String.valueOf(c[i]),m.get(String.valueOf(c[i]))+1);
			}else {
				m.put(String.valueOf(c[i]),1);
			}
		}
		System.out.println("m.entrySet()==>"+m.entrySet());
		System.out.println();
		for(Map.Entry<String,Integer> es:m.entrySet()) {
			System.out.println(es.getKey()+"====>"+es.getValue());			
		}
	}

}
