package com.wildcodeschool.bootcamp;

import java.util.Arrays;
import java.util.Comparator;

public class LiveCoding20191126 {

	public static void main(String[] args) {

		// Beispiel für ein Interface: "IsNamed"
		Quest quest = new Quest("Java 01 : The JDK", "https://odyssey.wildcodeschool.com/quests/853");
		Student student = new Student("Jane", "HTML");
		IsNamed[] namedThings = {quest, student};
		for (IsNamed isNamed : namedThings) {
			System.out.println(isNamed.getName());
			System.out.println( "Object: " + (isNamed instanceof Object));
			System.out.println( "Participant: " + (isNamed instanceof Participant));
			System.out.println( "Student: " + (isNamed instanceof Student));
			System.out.println( "IsNamed: " + (isNamed instanceof IsNamed));
			System.out.println( "getClass(): " + isNamed.getClass());	
			if (isNamed instanceof Student) {
				// Casting, um wieder an den "ganzen Studenten" zu kommen 
				System.out.println("Student's favorite topic: " + ((Student) isNamed).getFavoriteTopic() );
			}
		}

		// Objektgleichheit: equals-Methode
		Quest quest1 = new Quest("Java 01 : The JDK", "https://odyssey.wildcodeschool.com/quests/853");
		Quest questX = new Quest("Java 1: The JDK", "https://odyssey.wildcodeschool.com/quests/855");
		System.out.println("quest1 == questX: " + (quest1 == questX));
		System.out.println("quest1.equals(questX): " + (quest1.equals(questX)));

		// Array Sorting / Comparable (natürliche Ordnung)
		Integer[] integers = { 56, 1, 3, 55 };
		System.out.println("integers: " + Arrays.toString(integers));
		Arrays.sort(integers);
		System.out.println("integers (sorted): " + Arrays.toString(integers));			
		
		String[] strings = { "X", "Hallo", "A", "Huhu" };
		System.out.println("strings: " + Arrays.toString(strings));
		Arrays.sort(strings);
		System.out.println("strings (sorted): " + Arrays.toString(strings));		
		
		Student jane1 = new Student("Jane", "HTML");
		Student jane2 = new Student("Jane", "CSS");
		Student zacharias = new Student("Zacharias", "Jav");
		Student bert = new Student("Bert", "CSS");
		Student albert = new Student("Albert", "CSS");
		Student [] students = {jane1, jane2, zacharias, bert, albert};	
		System.out.println("students: " + Arrays.toString(students));
		Arrays.sort(students);
		System.out.println("students (sorted): " + Arrays.toString(students));		
		

		// Comparator: Festlegen einer (nicht unbedingt natürlichen) Ordnung
		StudentOrder comparator = new StudentOrder(true);
		Arrays.sort(students, comparator);
		System.out.println("students (StudentOrder): " + Arrays.toString(students));



		// Comparator als anonyme Klasse
		Comparator<Student> reverseOrder = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getName().compareTo(o1.getName());
			}
		};
		Arrays.sort(students, reverseOrder);
		System.out.println("students (reverse order): " + Arrays.toString(students));				
	}

}
