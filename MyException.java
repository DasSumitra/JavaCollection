package com.test.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MyException {
	public void getException(int num) throws SQLException, IOException, IllegalAccessException, InterruptedException, CloneNotSupportedException, NoSuchFieldException, ClassNotFoundException {
		
		
		if (num == 1) {
			throw new SQLException("SQLException ");
		}
		if (num == 2) {
			throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
		}
		if (num == 3) {
			throw new FileNotFoundException("FileNotFoundException");
		}
		if (num == 4) {
			throw new IOException("IOException");
		}
		if (num == 5) {
			throw new IllegalAccessException("IllegalAccessException");
		}
		if (num == 6)

		{
			throw new InterruptedException("InterruptedException");
		}
		if (num == 7)

		{
			throw new CloneNotSupportedException("CloneNotSupportedException");
		}
		if (num == 8)

		{
			throw new NoSuchFieldException("NoSuchFieldException");
		}
		if (num == 9)

		{
			throw new ClassNotFoundException("ClassNotFoundException");
		}
		if (num == 10)

		{
			throw new ArithmeticException("ArithmeticException");
		}
		
	}
	public static void main(String[] args) {
		MyException exception=new  MyException();
		try {
		//exception.getException(1);
		exception.getException(9);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getClass());
		}
	}

}
