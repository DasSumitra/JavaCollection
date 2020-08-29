package com.date.api;

import java.time.Year;
import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Year  :");
		int n=sc.nextInt();
		Year y=Year.of(n);
		if(y.isLeap()) {
			System.out.println("This year is leap year : "+y);
		}else {
			System.out.println("This year is not Leap Year :"+y);
		}
	}

}
