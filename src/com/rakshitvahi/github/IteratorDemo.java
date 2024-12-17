package com.rakshitvahi.github;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		collection.add("New York");
		collection.add("Boston");
		collection.add("California");

		Iterator<String> it = collection.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toUpperCase());
		}

		IteratorDemo obj = new IteratorDemo();
		obj.performStringTask();

	}

	private void performStringTask() {
		Collection<String> myCollection = new ArrayList<>();
		myCollection.add("Pineapple");
		myCollection.add("Banana");
		myCollection.add("Apple");
		myCollection.add("Orange");
		myCollection.add("Watermellon");

		Iterator<String> it = myCollection.iterator();
		while (it.hasNext()) {
			String text = it.next();
			if (text.toLowerCase().contains("an")) {
				System.out.println(text);
			}
		}

	}
}
