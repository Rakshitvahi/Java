package com.rakshitvahi.github;

public class PermutationsOfString {

	public static void main(String[] args) {
		String str = "abc";
		printPermutation(str, "");
	}

	static void printPermutation(String str, String ans) {
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutation(ros, ans + ch);
		}
	}

}
