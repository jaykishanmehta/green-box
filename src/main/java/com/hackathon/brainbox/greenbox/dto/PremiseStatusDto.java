package com.hackathon.brainbox.greenbox.dto;

import java.time.LocalDateTime;
import java.util.Set;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class PremiseStatusDto {

	private Integer headCount;
	private Set<Integer> activeFloors;
	private String message;
	private LocalDateTime dateTime;
	
}
