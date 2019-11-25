package com.wildcodeschool.bootcamp;

import java.util.Arrays;

public class Instructor extends Participant {

	private String[] weeklyTeachingDays;

	public Instructor(String name, String... weeklyTeachingDays) {
		super(name);
		this.weeklyTeachingDays = weeklyTeachingDays;
	}

	public String[] getWeeklyTeachingDays() {
		return weeklyTeachingDays;
	}

	@Override
	public String toString() {
		return "Instructor [weeklyTeachingDays=" + Arrays.toString(weeklyTeachingDays) + ", name=" + name
				+ ", activeQuests=" + Arrays.toString(activeQuests) + "]";
	}

}
