package com.rakshitvahi.github;

import java.util.Scanner;

public class CreditCardValidation {
	
	public static void main(String[] args) {
		long creditCardNumber;
		boolean result;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number as a long integer: ");
		creditCardNumber = input.nextLong();
		result = isValid(creditCardNumber);
		if (result) {
			System.out.println(creditCardNumber + " is valid");
		} else {
			System.out.println(creditCardNumber + " is invalid");
		}
	}
	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		if (getSize(number) >= 13 && getSize(number) <= 16) {
			if (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
					|| prefixMatched(number, 6)) {
				if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) {
					return true;
				}
			}
		}
		return false;
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String numString = Long.toString(number);
		for (int i = getSize(number) - 2; i >= 0; i -= 2) {
			int digit = getDigit(Integer.parseInt(String.valueOf(numString.charAt(i))) * 2);
			sum = sum + digit;
		}
		return sum;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of the
	 * two digits
	 */
	public static int getDigit(int number) {
		if (number < 9) {
			return number;
		} else {
			return number / 10 + number % 10;
		}
	}

	/** Return sum of odd place digits in number */
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String numString = Long.toString(number);
		for (int i = getSize(number) - 1; i >= 0; i -= 2) {
			int digit = Integer.parseInt(String.valueOf(numString.charAt(i)));
			sum = sum + digit;
		}
		return sum;
	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}

	/** Return the number of digits in d */
	public static int getSize(long d) {
		String numString = Long.toString(d);
		return numString.length();
	}

	/**
	 * Return the first k number of digits from number. If the number of digits in
	 * number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		if (getSize(number) > k) {
			String numString = Long.toString(number);
			return Long.parseLong(numString.substring(0, k));
		} else {
			return number;
		}
	}
}
