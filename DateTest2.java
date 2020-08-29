package com.date.api;

import java.time.LocalDateTime;
import java.time.Month;

public class DateTest2 {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.of(1995, Month.MAY, 15, 14, 45);
		System.out.println(dt);
		System.out.println(dt.plusMonths(6));
		System.out.println(dt.minusMonths(6));
	}

}
