package HackerRankPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(
				4,2,3,4,4,9,98,98,3,3,3,4,2,98,1,98,98,1,1,4,98,2,98,3,9,9,3,1,4,1,98,9,9,2,9,4,2,2,9,98,4,98,1,3,4,9,1,98,98,4,2,3,98,98,1,99,9,98,98,3,98,98,4,98,2,98,4,2,1,1,9,2,4
				));
		System.out.println(pickingNumbers(a));
	}
	
	public static int pickingNumbers(List<Integer> a) {
		Set<Integer> hSet = new HashSet<Integer>(a);
		Set<Integer> MaxSet= new HashSet<Integer>();
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		Set<Integer> MaxSet2= new HashSet<Integer>();
		Iterator itr = hSet.iterator();
		Integer i;
		int max_fre=0, max_val=0, temp=0,next=0;
		while(itr.hasNext()) {
			i=(Integer) itr.next();
			m.put(i, Collections.frequency(a,i));
			
		}
		max_val = Collections.max(m.values());
		
		itr = m.keySet().iterator();
		while(itr.hasNext()) {
			temp=(Integer) itr.next();
			if(max_val == m.get(temp)){
				MaxSet.add(temp);				
			}			
		}
		
		itr = MaxSet.iterator();
		
		while(itr.hasNext()) {
			next = (Integer) itr.next();
			temp = m.get(next);
			
			MaxSet2.add(temp + Math.max(m.getOrDefault(next+1,0), m.getOrDefault(next-1, 0)));
			
		}
		return Collections.max(MaxSet2);
	    }

}
