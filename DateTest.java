package com.date.api;

import java.time.LocalDate;

public class DateTest {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println("Current Date  .."+date);
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yyyy=date.getYear();
		System.out.println(dd+".."+mm+"..."+yyyy);
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
	}

}
