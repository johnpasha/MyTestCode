package HackerRankPrograms;

import java.util.HashMap;
import java.util.Map;

public class ModifiedFibnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacciModified(1,2,3));
	}
	
	static long fibonacciModified(int t1, int t2, int n) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(1,t1);
        m.put(2,t2);
        int temp=0;
        for(int i=3; i<=n;i++){
            temp=(int) (m.get(i-2)+Math.pow(m.get(i-1),2));
            m.put(i,temp);
        }
        
        return 0l;

    }

}
