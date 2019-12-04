package com.wildcodeschool.bootcamp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LiveCoding20191202 {

	private static void separator() {
		System.out.println("------------------------------------------------------------------------------");
	}

	public static void main(String[] args) {

		// Sortieren anhand der Stringlänge
		String[] strings = { "Zacharias Winter", "trallalla", "1", "A", "HUHU" };
		Comparator<String> comparator = new StringLengthComparator();
		System.out.println("Unsorted: " + Arrays.toString(strings));
		Arrays.sort(strings, comparator);
		System.out.println("Sorted: " + Arrays.toString(strings));

		separator();
		
		// Array -> List
		List<String> stringList = Arrays.asList(strings);
		System.out.println("Class: " + stringList.getClass());

		// Live Änderung von Werten im Array und der List
		System.out.println("List: " + stringList);
		strings[0] = "Zacharias Sommer";
		System.out.println("List: " + stringList);
		stringList.set(0, "Zak");
		System.out.println("Array: " + Arrays.toString(strings));

		separator();
		
		// Weitere Spezial-Listenimplementierungen
		stringList = stringList.subList(0, 0);
		System.out.println(stringList.subList(0, 0).getClass());
		System.out.println(Collections.emptyList().getClass());
		System.out.println(Collections.singletonList("HUHU").getClass());
	}

}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
//	    System.out.println("compare: " + o1 + " <-> " + o2);
		int lengthDiff = o1.length() - o2.length();
//	    System.out.println(o1.length() + " " + o2.length() + ": " + lengthDiff);
		return o1.length() - o2.length();
	}
}
