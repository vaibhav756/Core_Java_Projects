package com;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {

	public static void main(String[] args) {
		
		Date now=new Date();
		System.out.println(now);
		
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE));
		
	}

}