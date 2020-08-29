package com.date.api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneTest {

	public static void main(String[] args) {
		ZoneId id=ZoneId.systemDefault();
		System.out.println(id);
		ZoneId azId=ZoneId.of("America/Los_Angeles");
		ZonedDateTime time=ZonedDateTime.now(azId);
		System.out.println(time);
	}
}