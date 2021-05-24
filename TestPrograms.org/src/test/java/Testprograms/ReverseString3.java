package Testprograms;

import java.util.HashSet;
import java.util.Set;

public class ReverseString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sadfdsg";
		
		char c[] = s.toCharArray();
		for(int i=c.length; i>0;i--) {
			System.out.print(c[i-1]);
		}
//		Set s = new HashSet();
//		s.size()
		
	}

}
