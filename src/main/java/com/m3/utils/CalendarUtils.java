package com.m3.utils;

public class CalendarUtils {
	
	public static String LocalDateTimeToString(String updatedISO) {
		String[] iso = updatedISO.split("T");
		String date = iso[0].replace('-', '/');
		return date + " " + iso[1].substring(0, 8);
	}
}
