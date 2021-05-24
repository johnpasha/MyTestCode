package HackerRankPrograms;

public class NumberLineJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kangaroo(0,3,4,2));
		System.out.println(kangaroo(0,2,5,3));
	}
	
	static String kangaroo(int x1, int v1, int x2, int v2) {
		
		if(x1!=x2 && (v1==0 || v2==0 || v1 == v2)) {
			return "NO";
		}else if(x1==x2) {
			return "YES";
			
		}else if((x1<x2 && v1<v2) || (x2<x1 && v2<v1)) {
			return "NO";
		}else if((x1<x2 && v2<v1) || (x2<x1 && v1<v2)){
			return kangaroo(x1+v1,v1,x2+v2,v2);
		}else {
			return "NO";
		}
    }

}
