package com.xworkz.today.Practice;

import java.time.LocalDate;
import java.time.LocalTime;

public class ThinkTester {
	public static void main(String args[]) {
		Think think=new Think();
		System.out.println(think.getThinkType("dfgsh"));
		System.out.println(think.getDate(LocalDate.of(2024, 8, 30)));
		System.out.println(think.getTime(LocalTime.now()));
	}

}
