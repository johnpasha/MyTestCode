package HackerRankPrograms;

public class ChiefHopper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1401,2019,1748,3785,3236,3177,3443,3772,2138,1049,353,908,310,2388,1322,88,2160,2783,435,2248,1471,706,2468,2319,3156,3506,2794,1999,1983,2519,2597,3735,537,344,3519,3772,3872,2961,3895,2010,10,247,3269,671,2986,942,758,1146,77,1545,3745,1547,2250,2565,217,1406,2070,3010,3404,404,1528,2352,138,2065,3047,3656,2188,2919,2616,2083,1280,2977,2681,548,4000,1667,1489,1109,3164,1565,2653,3260,3463,903,1824,3679,2308,245,2689,2063,648,568,766,785,2984,3812,440,1172,2730};
		
		System.out.println(chiefHopper(arr));
//		System.out.println((1401/16+2019/8+1748/4+3785/2+3236/1)/5);
	}
	
	static int chiefHopper(int[] arr) {
		int guessEnergy=0;
		for(int i=0;i<arr.length;i++) {
			guessEnergy += arr[i];
		}
		guessEnergy = guessEnergy/arr.length;
		System.out.println(guessEnergy);
		if(arr.length>check(arr,guessEnergy,0)) {
			guessEnergy++;
			check(arr,guessEnergy,0);
		}
		return guessEnergy;
    }
	
	static int check(int[] arr,int CurrEnergy, int index) {
		int sum=1;
		if(index>=arr.length) {
			return 1;
		}else if(2*CurrEnergy-arr[index]>0){
			sum += check(arr,2*CurrEnergy-arr[index],index+1);
		}
		return sum;
	}

}
