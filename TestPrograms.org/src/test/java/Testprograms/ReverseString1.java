package Testprograms;

public class ReverseString1 {

	public static void main(String[] args) {
		// String reverse using String Builder
		String s = "Reverse this";
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.append(" OMG ");
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		
		//Same as above code for String buffer too
//		Collections.sort
	}

}
