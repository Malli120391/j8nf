package com.lambdaexprn;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateAndTimeDemo {

	public static void main(String[] args) {

		Date currentdate = new Date();
		LocalDate localdate =  LocalDate.now();
		LocalTime localtime = LocalTime.now();
		LocalDateTime  localdatetime = LocalDateTime.now();
		
		System.out.println("currnet date and time: " + currentdate);
		System.out.println("local date: " + localdate);
		System.out.println("local  time: " + localtime);
		System.out.println("local date and time: " + localdatetime);
	}

}
