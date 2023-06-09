package com.hackathon.brainbox.greenbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.brainbox.greenbox.dto.PremiseStatusDto;
import com.hackathon.brainbox.greenbox.properties.PremiseProperties;
import com.hackathon.brainbox.greenbox.service.DashboardService;
import com.hackathon.brainbox.greenbox.service.PremiseDataProcessingService;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

	@Autowired
	private DashboardService dashboardService;
	
	@Autowired
	private PremiseDataProcessingService dataProcessingService;
	
	@GetMapping("/premise/info")
	public ResponseEntity<PremiseProperties> getPremiseDetails() {
		return new ResponseEntity<PremiseProperties>(dashboardService.getPremiseDetails(), HttpStatus.OK);
	}
	
	@GetMapping("/premise/status")
	public ResponseEntity<PremiseStatusDto> getPremiseDisplay() {
		return new ResponseEntity<PremiseStatusDto>(dataProcessingService.getPremiseStatus(), HttpStatus.OK);
	}
	
}
