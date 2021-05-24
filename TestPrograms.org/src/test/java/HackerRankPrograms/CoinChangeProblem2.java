package HackerRankPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class CoinChangeProblem2 {

	static long counter = 0;
	static Set<String> paths = new HashSet<String>();
//	static Map<String,Long> subPaths=new HashMap<String,Long>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getWays(15,Arrays.asList(5l,2l,3l)));
	}
	
	public static long getWays(int n, List<Long> c) {
		Collections.sort(c);
		 getSum(n,c,0l,"");
		 return paths.size();
	    }
	
	public static long getSum(long n, List<Long> c, long sum, String path) {
//		Set<String> s = new HashSet<String>();
		long temp=0l;
		for(long l:c) {
			
			if(sum>=n) {
				sum=0;
			}
			if(n>l && (n-(l+sum)>0)) {
//				System.out.println("n="+n+" l="+l+" c="+c+" sum="+sum+" counter="+counter+" path:"+path);
//				if(!subPaths.containsKey((n-(l+sum))+":"+l)) {
				temp=getSum(n-(l+sum),c,sum,(path.isEmpty()?"":path)+String.valueOf(l));
				sum += l+temp;
//				System.out.println("n="+n+" l="+l+" c="+c+" sum="+sum+" counter="+counter+" path:"+path);
//				}else if(n-(l+sum)>0) {
//					System.out.println("subPaths:"+subPaths);
//					counter+=subPaths.get((n-(l+sum))+":"+l);
//				}
			}else if(n==l) {
				path = (path.isEmpty()?"":path)+String.valueOf(l);
				path = StringUtils.join(convertStringToCharList(path), null);
				if(!paths.contains(path)) {
					paths.add(path);//path.toString();
					System.out.println("paths:"+paths);
//					subPaths.put(n+":"+l, counter-1);
					counter++;					
				}
//				System.out.println("n="+n+" l="+l+" c="+c+" sum="+sum+" counter="+counter+" path:"+path);
				return l;
			}else if(n<=0) {
				return 0l;
			}
		}
		
		return 0l;
	}
	
	public static List<Character> convertStringToCharList(String str)
    {
        List<Character> chars = new ArrayList<Character>();
  
        for (char ch : str.toCharArray()) {
        	chars.add(ch);
        }
        Collections.sort(chars);
        return chars;
    }

}
