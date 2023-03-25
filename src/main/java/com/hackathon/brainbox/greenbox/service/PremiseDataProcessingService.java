package com.hackathon.brainbox.greenbox.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.hackathon.brainbox.greenbox.dto.PremiseStatusDto;
import com.hackathon.brainbox.greenbox.properties.PremiseProperties;

@EnableConfigurationProperties(PremiseProperties.class)
@Service
public class PremiseDataProcessingService implements PremiseDataHelper {

	@Autowired
	private PremiseProperties premiseProperties;
	
	public PremiseStatusDto getPremiseStatus() {
		
		return PremiseStatusDto.builder()
				.headCount(getHeadCount())
				.dateTime(LocalDateTime.now())
				.message("Please move from floor X to floor Y to save Z amonut of energy!")
				.activeFloors(getActiveFloors(premiseProperties.getTotalFloors()))
				.build();
	}

}
