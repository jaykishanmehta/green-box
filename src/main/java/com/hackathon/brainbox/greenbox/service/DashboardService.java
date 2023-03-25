package com.hackathon.brainbox.greenbox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.hackathon.brainbox.greenbox.properties.PremiseProperties;

@Service
@EnableConfigurationProperties(PremiseProperties.class)
public class DashboardService {

	@Autowired
	private PremiseProperties premiseProperties;
	
	
	public PremiseProperties getPremiseDetails() {
		return premiseProperties;
	}
	
}
