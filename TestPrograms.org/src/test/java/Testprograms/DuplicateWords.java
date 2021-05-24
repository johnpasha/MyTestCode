package Testprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="There is some Text given. Which has some dupliates in it. you need to find out this and see. There is some Text given. Which has some dupliates in it. you need to find out this and see";
		String[] s1 = s.split(" ");
		Arrays.sort(s1);
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		for(int i=0;i<s1.length;i++) {
			if(m.containsKey(s1[i])) {
				m.put(s1[i], m.get(s1[i])+1);
			}else {
				m.put(s1[i],1);
			}
		}
		
		for(Map.Entry<String,Integer> e:m.entrySet()) {
			System.out.println(e.getKey()+"=>"+e.getValue());
		}
		
	}

}
