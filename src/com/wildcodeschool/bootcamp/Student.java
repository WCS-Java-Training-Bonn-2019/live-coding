package com.wildcodeschool.bootcamp;

import java.util.Arrays;

public class Student extends Participant {

	private String favoriteTopic;

	public Student(String name, String favoriteTopic) {
		super(name);
		this.favoriteTopic = favoriteTopic;
	}
	
	@Override
	public void startQuest(String quest) {
		if (activeQuests.length == 3) {
			throw new RuntimeException("Students are not allowed to have more than 3 quests ongoing.");
		}
		super.startQuest(quest);
	}

	@Override
	public String toString() {
		return "Student [favoriteTopic=" + favoriteTopic + ", name=" + name + ", activeQuests="
				+ Arrays.toString(activeQuests) + "]";
	}

	
	public static void doStuff() {
		System.out.println("HUHU");
	}

	
}
