package com.rakshitvahi.github;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		HelloWorld obj = new HelloWorld();
		obj.printRecurssion("Oh man!", 5);
	}

	public void printRecurssion(String text, int n) {
		System.out.println(text);
		if (n == 0) {
			return;
		} else {
			printRecurssion(text, n - 1);
		}
	}

}
