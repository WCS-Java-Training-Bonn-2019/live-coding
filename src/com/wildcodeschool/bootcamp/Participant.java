package com.wildcodeschool.bootcamp;

import java.util.Arrays;

public abstract class Participant {

	protected String name;
	protected String[] activeQuests = new String[0];

	public Participant(String name) {
		this.name = name;
	}

	public void startQuest(String quest) {
		activeQuests = Arrays.copyOf(activeQuests, activeQuests.length + 1);
		activeQuests[activeQuests.length - 1] = quest;
	}

	@Override
	public String toString() {
		return "Participant [name=" + name + ", activeQuests=" + Arrays.toString(activeQuests) + "]";
	}

}
