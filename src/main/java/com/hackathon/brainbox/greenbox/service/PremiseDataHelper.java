package com.hackathon.brainbox.greenbox.service;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public interface PremiseDataHelper {
	static Random rand = new Random();
	static int minimumFloor = 1;
	

	/**
	 * Displaying random number between minimumFloor to totalFloors
	 * @param totalFloors
	 * @return
	 */
	default Integer getRandomFloor(int totalFloors) {
		return minimumFloor + rand.nextInt((totalFloors - minimumFloor) + 1);
	}
	
	static int minimumHeadCount = 30;
	static int maximumHeadCount = 350;
	
	default Integer getHeadCount() {
		return minimumHeadCount + rand.nextInt((maximumHeadCount - minimumHeadCount) + 1);
	}
	
	
	default Set<Integer> getActiveFloors(int totalFloors) {
		
		Set<Integer> floors = new HashSet<>();
		
		for (int i = 0; i < 3; i++) {
			floors.add(getRandomFloor(totalFloors));
		}
		
		return floors;
	}
}
