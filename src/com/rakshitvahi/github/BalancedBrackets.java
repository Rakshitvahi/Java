package com.rakshitvahi.github;

import java.util.EmptyStackException;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String args[]) {
		String input = "{[(1+2)*(3+2)]/(8/2)}";
		// Code to check if the brackets are balanced in the input using Stacks
		Stack<Character> stack = new Stack<>();
		try {
			if (isValid(input, stack) && stack.isEmpty()) {
				System.out.println("Balanced");
			} else {
				System.out.println("NOT Balanced");
			}
		} catch (EmptyStackException e) {
			System.out.println("NOT Balanced");
		}

	}

	public static boolean isValid(String input, Stack<Character> stack) {
		int size = input.length();
		for (int i = 0; i < size; i++) {
			if (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{') {
				stack.push(input.charAt(i));
			} else if (input.charAt(i) == ')' || input.charAt(i) == ']' || input.charAt(i) == '}') {
				if (!check(input.charAt(i), stack.pop())) {
					return false;
				}
			}
		}
		return true;

	}

	public static boolean check(Character chr, Character opening) {
		boolean result = true;
		switch (chr) {
		case ')':
			result = opening == '(' ? true : false;
			break;
		case ']':
			result = opening == '[' ? true : false;
			break;
		case '}':
			result = opening == '{' ? true : false;
			break;
		}
		return result;
	}
}
