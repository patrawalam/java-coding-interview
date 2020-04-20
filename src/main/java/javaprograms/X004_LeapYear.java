package javaprograms;

import java.util.Scanner;

public class X004_LeapYear {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*
		 * Logic: In the Gregorian calendar, three criteria must be taken into account
		 * to identify leap years: • The year can be evenly divided by 4; • If the year
		 * can be evenly divided by 100, it is NOT a leap year, unless; • The year is
		 * also evenly divisible by 400. Then it is a leap year.
		 * 
		 * According to these rules, the years 2000 and 2400 are leap years, while 1800,
		 * 1900, 2100, 2200, 2300 and 2500 are NOT leap years.
		 * 
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter year :: ");
		String str = scn.next();

		int num = Integer.parseInt(str);

		if (num % 400 == 0 || (num % 4 == 0 && num % 100 != 0))
			System.out.println("Year is a leap year");
		else
			System.out.println("Year is NOT a leap year");
	}
}
