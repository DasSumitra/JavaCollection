package com.date.api;

import java.time.LocalDateTime;

public class TestDateTime {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.getMonth());
		System.out.println(dt.getYear());
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getHour());
		System.out.println(dt.getMinute());
		System.out.println(dt.getSecond());
		System.out.println(dt.getNano());
	}

}
