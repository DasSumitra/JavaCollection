package com.test.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			// System.out.println(e.getCause());
		}
	}

}
