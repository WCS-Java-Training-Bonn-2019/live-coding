package com.wildcodeschool.bootcamp;

import java.util.Arrays;

public class Bootcamp {

	private Participant[] participants;

	public Bootcamp(Participant[] participants) {
		this.participants = participants;
	}

	@Override
	public String toString() {
		return "Bootcamp [participants=" + Arrays.toString(participants) + "]";
	}
}
