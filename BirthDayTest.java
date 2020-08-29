package com.date.api;

import java.time.LocalDate;
import java.time.Period;

public class BirthDayTest {

	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(1991, 5, 8);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthDate, today);
		System.out.printf("your age is %d year %d month %d Days", p.getYears(), p.getMonths(), p.getDays());

		LocalDate deathDate = LocalDate.of(1991 + 60, 5, 8);
		Period p2 = Period.between(today, deathDate);
		int p3=p2.getYears()*365+p2.getMonths()+60+p.getDays();
		System.out.println("you will be on the earth %d days do more important work as soon as possible "+p3);

	}

}
