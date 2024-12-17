package com.rakshitvahi.github;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		System.out.println("Demo on STACK");
		Stack<String> stacks = new Stack<String>();
		stacks.push("A");
		stacks.push("B");
		stacks.push("C");
		stacks.push("D");

		Iterator<String> it = stacks.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		System.out.println("Pop out of stack");
		while (stacks.size() != 0) {
			System.out.print(stacks.pop() + " ");
		}
		System.out.println();

	}

}
