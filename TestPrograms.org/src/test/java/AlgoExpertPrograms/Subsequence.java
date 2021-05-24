package AlgoExpertPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subsequence {

	  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
	    
//			Map<Integer,Integer> m = new HashMap<Integer,Integer>();
			int j=0;
			
			while(true) {
				if(j==sequence.size()) {
					for(int i=j;i<array.size();)
					array.remove(i);
				}else if(sequence.contains(array.get(j))) {
					j++;
				}
					else {
					array.remove(j);
				}
				
				if(j==array.size()) {
					break;
				}
			}
			if(array.equals(sequence)) {
				return true;
			} else {
				return false;
			}
//			
//			
//			for(int i=0;i<array.size();i++){
//				System.out.println(i+"==>"+array.get(i));
//				m.put(array.get(i),0);
//			}
//			for(int i=0;i<sequence.size();i++){
//				if(m.containsKey(sequence.get(i))) {
//					m.put(sequence.get(i), m.get(sequence.get(i))+1);
//				}
//				else {
//					test=1;
//					break;
//				}
//			}
//			if(test==1 || m.containsValue(2)) {
//				return false;
//			}else {
//				return true;
//			}
	    
	  }

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<Integer>();
		List<Integer> sequence = new ArrayList<Integer>();
		
//		"array": [5, 1, 22, 25, 6, -1, 8, 10],
//		  "sequence": [5, 1, 22, 22, 25, 6, -1, 8, 10]
		array.add(1);
		array.add(1);
		array.add(1);
		array.add(1);
		array.add(1);

		sequence.add(1);
		sequence.add(1);
		sequence.add(1);

		System.out.println(isValidSubsequence(array,sequence));
		

	}

}
