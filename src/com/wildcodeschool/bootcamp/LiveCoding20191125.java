package com.wildcodeschool.bootcamp;

public class LiveCoding20191125 {

	public static void main(String[] args) {

		// Vererbung: Student und Instructor erben von Participant
		Participant jon = new Student("Jon", "HTML");
		Student jane = new Student("Jane", "HTML");
		Student jack = new Student("Jack", "Java");
		Instructor andre = new Instructor("Andre", "Do", "Fr");		
		Participant[] participants = {jon, jane, jack, andre};
		Bootcamp bootCampBonn = new Bootcamp(participants);
		System.out.println(bootCampBonn);
		
		// Polymorphie (Student darf nur drei Quests haben, Instructor beliebig viele)
		jon.startQuest("Java 01");
		jon.startQuest("Java 02");
		jon.startQuest("Java 03");
//		jon.startQuest("Java 04"); // bei der 4. Quest knallt es

		// aber nicht beim Instructor
		andre.startQuest("Java 01");
		andre.startQuest("Java 02");
		andre.startQuest("Java 03");
		andre.startQuest("Java 04");

		// Autoboxing (primitive Typen werden bei Bedarf automatisch in Wrapper-Klassen verpackt)
		Object o = 33;
		System.out.println("Class von 33: " +  o.getClass());
		
		// Casting und instanceof
		Object [] objects = {"Hallo", Integer.valueOf(42), jon, andre};
		for (Object object : objects) {
//			System.out.println("Class: " + object.getClass());
			if (object instanceof Integer) {
				// Casting des Object in einen Integer
				Integer integer = (Integer) object;
				System.out.println(-integer.intValue());
			}
		}

		// Overriding equals (Quest)
//		Quest quest1 = new Quest("Java 01: The JDK", "https://odyssey.wildcodeschool.com/quests/853");
//		Quest quest2 = new Quest("Java 01: The JDK", "https://odyssey.wildcodeschool.com/quests/853");
	}

}
