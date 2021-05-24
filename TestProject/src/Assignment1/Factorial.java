package Assignment1;

public class Factorial {

	public int factotial(int a){

		if(a>1){
		return factotial(a-1)*a;
		}
		return 1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = new Factorial();
		System.out.println(f.factotial(4));
	}

}
