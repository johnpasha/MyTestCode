package Check3;

public class B extends A{
	
	public void test(int a,double a1) {
		System.out.println("Class B test int a,double a1");
	}
	public void test(double a,int a1) {
		System.out.println("Class B test double a,int a1");
//		return 1;
	}
	public void test2(double a,int a1) {
		System.out.println("Class B test double a,int a1");
	}
	
	public static void main(String[] args) {
		B b = new B();
//		b.test(1,10);
		b.test(10.0, 10);
//		b.test
	}

}
