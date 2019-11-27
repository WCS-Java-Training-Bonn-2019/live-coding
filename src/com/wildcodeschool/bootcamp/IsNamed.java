package com.wildcodeschool.bootcamp;

public interface IsNamed {
	
	String getName();
	
	// default-Methoden haben nur den Interface-Kontext zur Verfügung
	default String getUppercaseName() {
		return getName().toUpperCase();
	}

}
