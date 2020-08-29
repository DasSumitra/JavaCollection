package com.nt.lambda;

public class LambdaTest {
	public static void main(String[] args) {
		System.out.println("main");
		
		  Test t=new Test() {
		  
		  @Override public void show() 
		  { System.out.println("Hello World");
		  
		  } 
		};
		 
		Test t2=()->System.out.println("hello");
		t.show();
		t2.show();
	}

}
