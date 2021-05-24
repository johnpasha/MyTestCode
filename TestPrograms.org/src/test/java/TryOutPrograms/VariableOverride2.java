package TryOutPrograms;

public class VariableOverride2 extends VariableOverride1{
	int a =10;
	public static void main(String[] args) {
		VariableOverride2 v = new VariableOverride2();
		System.out.println(v.a);
		VariableOverride1 v1 = new VariableOverride2();
		System.out.println(v1.a);
		v.check();
		v1.check();
	}
	
	public void check() {
		System.out.println("VariableOverride2: "+a);
	}

}
