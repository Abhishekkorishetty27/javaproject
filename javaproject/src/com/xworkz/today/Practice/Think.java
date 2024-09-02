package com.xworkz.today.Practice;

import java.time.LocalDate;
import java.time.LocalTime;

public class Think {
	public String thinkType;


public Think() {
	this("hsgf");
	System.out.println("no argument");
	
}
public Think(String thinkType) {

	System.out.println("this is one argument");
}
public String getThinkType(String thinkType) {
	return thinkType;
}
public LocalDate getDate(LocalDate date) {
	return date;
}
public LocalTime getTime(LocalTime time) {
	return time;
}


}
