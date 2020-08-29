package com.defult.method;

public class MyTestClass implements Left,Right{

	public static void main(String[] args) {
		MyTestClass t=new MyTestClass();
		t.m1();
	}

	@Override
	public void m1() {
		Left.super.m1();
		Right.super.m1();
	}

}
