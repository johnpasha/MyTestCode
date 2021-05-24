package Check2;

public class TestC {
	// but this is working fine when one method has int and other has double
	public void test(int a,double b) {
		System.out.println("test int");
	}

	public void test(double b,int a) {
		System.out.println("test double");
	}
	
	public static void main(String[] args) {
		TestC c = new TestC();
		c.test(10.0,10);// working
		c.test(10,10.0);// working
//		c.test(10,10);// not working
//		c.test(10.0,10.0); // not working
	}
}
