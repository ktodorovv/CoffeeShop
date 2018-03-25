package com.coffee.shop.utils;

import java.util.Calendar;
import java.util.Date;

public class DateParser {

	public static Date parseDate(String dateString) {
		String[] tokens = dateString.split("-");
		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, day);

		return cal.getTime();
	}

}