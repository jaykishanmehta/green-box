package com.hackathon.brainbox.greenbox.properties;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "premise.info")
public class PremiseProperties {

	private String name;
	private int totalFloors;
	private List<FloorDetailProperties> floorDetails;
	
	@Data
	private static class FloorDetailProperties {

		private String sectionName;
		private int capacity;
		private int controller;
		
	}
}
