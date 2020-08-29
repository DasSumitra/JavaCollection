package com.date.api;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeTest {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time=LocalTime.now();
		System.out.println(time);
	}

}
