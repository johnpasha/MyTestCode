package HackerRankPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Equal {

	public static void main(String[] args) {

		 int[] array= new int[]{53,361,188,665,786,898,447,562,272,123,229,629,670,848,994,54,822,46,208,17,449,302,466,832,931,778,156,39,31,777,749,436,138,289,453,276,539,901,839,811,24,420,440,46,269,786,101,443,832,661,460,281,964,278,465,247,408,622,638,440,751,739,876,889,380,330,517,919,583,356,83,959,129,875,5,750,662,106,193,494,120,653,128,84,283,593,683,44,567,321,484,318,412,712,559,792,394,77,711,977,785,146,936,914,22,942,664,36,400,857};
		System.out.println(equal(array));
		
	}
	
	static int equal(int[] arr) {
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length-1];
		int counter=0;
		if(min==max) {
			return counter;
		}else {
			if((max-min)/5>0) {
				for(int i=0;i<arr.length-1;i++) {
					
					arr[i]+=5;
					
				}
				counter = equal(arr)+1;
				return counter;
			}
			else if((max-min)/2>0) {
				for(int i=0;i<arr.length-1;i++) {
					
					arr[i]+=2;
					
				}
				counter = equal(arr)+1;
				return counter;
			}else {
				for(int i=0;i<arr.length-1;i++) {
					
					arr[i]+=1;
					
				}
				counter = equal(arr)+1;
				return counter;
			}
		}
    }


}
