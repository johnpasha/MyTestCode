package HackerRankPrograms;

import java.util.Arrays;

public class LenOfCommonSubstring {
	static int matched_len=0;
	public static void main(String[] args) {
		System.out.println(substringDiff(1, "abcd", "bbca"));

	}
	
	static int substringDiff(int k, String s1, String s2) {
		char temp[]=s1.toCharArray();
		Arrays.sort(temp);
		s1=new String(temp);
		char temp2[]=s2.toCharArray();
		Arrays.sort(temp2);
		s2=new String(temp2);
		int matched_len1 = substringDiff(s1,s2)+k;
		if (matched_len1>s1.length()) {
			matched_len1 = s1.length();
		}
		return matched_len1;
    }
	
	static int substringDiff(String s1, String s2) {
	
		if(s1==null || s2==null ||s1.equals("") ||s2.equals("")) {
			return 0;
		}
		else if(s1.compareTo(s2)==0) {//matching
			return s1.length();
		} else if(s1.compareTo(s2)==1){
			return substringDiff(s1.substring(0,s1.length()-1),s2.substring(1,s2.length()));
		}else if(s1.compareTo(s2)==-1){
			return substringDiff(s1.substring(1,s1.length()),s2.substring(0,s2.length()-1));
		}
		return 0;
		
	}

}
