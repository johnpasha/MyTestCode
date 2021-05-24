package HackerRankPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;

public class BitwiseAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		System.out.println(countPairs(l));
	}
	
	public static long countPairs(List<Integer> arr) {
	    // Write your code here
	    List<List<Integer>> pairs =new ArrayList<List<Integer>>();
	    List<Integer> pair =new ArrayList<Integer>();
	    pairs = getPairs(arr);
	    int counter = 0;
	    Iterator<List<Integer>> itr = pairs.iterator();
	    while(itr.hasNext()){
	        pair=itr.next();
	        if(isPowerOfTwo(pair.get(0)&pair.get(1))){
	            counter++;
	        }
	    }
	    return counter;   
	    
	    }
	    
	    public static boolean isPowerOfTwo (int x)
	    {
	        return x!=0 && ((x&(x-1)) == 0);
	    }
	    
	    public static List<List<Integer>> getPairs(List<Integer> arr){
	    	int len = arr.size();
	        List<List<Integer>> pairs = null;// = new int[(len*(len-1)/2)-1][1];
	        for(int i=0;i<arr.size()-1;i++){
	            for(int j=i+1;j<arr.size();j++){
//	                pair.add(arr.get(j));
//	                pairs[i][j]=arr.get(index)
//	                System.out.println(pairs);
//	                pairs.add(pair);
//	                pair.clear();
	                System.out.println(pairs);
	            }
	            
	            
	        }
//	        Collections.copy(dest, src);
	        return pairs;
	    }
	

}
