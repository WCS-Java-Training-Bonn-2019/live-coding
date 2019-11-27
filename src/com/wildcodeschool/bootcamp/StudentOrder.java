package com.wildcodeschool.bootcamp;

import java.util.Comparator;

public class StudentOrder implements Comparator<Student> {

	boolean reverse = false;
	
	public StudentOrder(boolean reverse) {
		this.reverse = reverse;
	}
	
	@Override
	public int compare(Student o1, Student o2) {
		if (reverse) {
			return o2.getName().compareTo(o1.getName());	
		}
		return o1.getName().compareTo(o2.getName());
	}

}
