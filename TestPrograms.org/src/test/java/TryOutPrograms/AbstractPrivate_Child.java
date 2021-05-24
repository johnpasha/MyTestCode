package TryOutPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class AbstractPrivate_Child extends AbstractPrivate 
{
//we are not able to extend as the parent class constructor is private, 
//	we should have default constructer as non private and call it to create object
	public AbstractPrivate_Child(int a) {
		new AbstractPrivate();
	}
	
	public static void main(String[] args) {
		int a =0x000F;
		int b =0x2222;
		System.out.println(a&b);
		int[] a1= {1,2};
		int[] a2= {1,2};
		System.out.println(a1[0]+","+a2);
		System.out.println(a1.equals(a2));
//		Collections.max(Arrays.asList(a1));
//		Collections.frequency(1, Arrays.asList(a1)); 
		int x = Integer.parseInt(Integer.toBinaryString(10));
		System.out.println(7&8);
//		Iterator<List<Integer>> itr = pairs.iterator();
		
	}
}
