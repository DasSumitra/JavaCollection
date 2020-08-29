package com.date.api;

import java.time.LocalTime;

public class TimeTest {

	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		int h=time.getHour();
		int min=time.getMinute();
		int sec=time.getSecond();
		int nano=time.getNano();
		System.out.printf("%d:%d:%d:%d",h,min,sec,nano);
	}

}
