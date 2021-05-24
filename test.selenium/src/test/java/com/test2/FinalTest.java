package com.test2;

public class FinalTest {
	
	final int i;
	
	public FinalTest() {
		this.i =10;
		System.out.println(i);
	}
	
	public FinalTest(FinalTest f) {
		this.i =this.i+1;
		System.out.println(i);
	}

	public static void main(String[] args) {
		FinalTest f = new FinalTest();
		new FinalTest(f);
	}

}
