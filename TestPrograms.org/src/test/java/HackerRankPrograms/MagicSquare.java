package HackerRankPrograms;

public class MagicSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] s = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
//		s[0][0] = ;
		System.out.println(formingMagicSquare(s));

	}
	
	 static int formingMagicSquare(int[][] s) {
	        
	        int[] sum = new int[8];
	        
	        sum[0] = s[0][0]+s[0][1]+s[0][2];
	        sum[1] = s[1][0]+s[1][1]+s[1][2];
	        sum[2] = s[2][0]+s[2][1]+s[2][2];
	        sum[3] = s[0][0]+s[1][0]+s[2][0];
	        sum[4] = s[0][1]+s[1][1]+s[2][1];
	        sum[5] = s[0][2]+s[1][2]+s[2][2];
	        sum[6] = s[0][0]+s[1][1]+s[2][2];
	        sum[7] = s[0][2]+s[1][1]+s[2][0];
	        
	        for(int a:sum){
	            System.out.println(a);
	        }
	        return 1;
	    }

}
