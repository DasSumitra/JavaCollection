package com.nt.lambda;

public class MainTest {

	public static void main(String[] args) {
		A a = new A() {

			@Override
			public void m1() {
				System.out.println("hello");
			}
		};
		
		A a2=()->{System.out.println("Java World");};
		a.m1();
		a2.m1();
	}

}
