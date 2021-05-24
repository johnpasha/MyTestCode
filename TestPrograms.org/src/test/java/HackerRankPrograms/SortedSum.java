package HackerRankPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(9,5,8));
		System.out.println(sortedSum(l));
	}
	
	public static int sortedSum(List<Integer> a) {
	    // Write your code here
	        
	        List<Integer> temp= new ArrayList<Integer>(a);
	        Collections.copy(temp,a);
	        Collections.sort(a);
	        System.out.println(a);
	        int sum=0;
	        for(int i=0;i<a.size();i++){
	                sum += (i+1)*a.get(i);
	        }
	        System.out.println(sum);
	        if(temp.size()==1){
	            return sum;
	        }else{
	            System.out.println(temp.subList(0, temp.size()-1));
	            return sum + sortedSum(temp.subList(0, temp.size()-1));
	        }
	}

}
