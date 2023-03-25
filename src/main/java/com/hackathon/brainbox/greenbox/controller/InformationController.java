package com.hackathon.brainbox.greenbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.brainbox.greenbox.dto.ProjectInfoDto;
import com.hackathon.brainbox.greenbox.service.ProjectInfoService;

@RestController
@RequestMapping("/greenbox")
public class InformationController {

	@Autowired
	private ProjectInfoService projectInfoService;
	
	@GetMapping("/info")
	public ResponseEntity<ProjectInfoDto> getProjectInfo() {
		return new ResponseEntity<ProjectInfoDto>(projectInfoService.getProjectInfo(), HttpStatus.OK);
	}
	
}
