package com.hackathon.brainbox.greenbox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.hackathon.brainbox.greenbox.dto.ProjectInfoDto;
import com.hackathon.brainbox.greenbox.properties.ProjectProperties;

@Service
@EnableConfigurationProperties(ProjectProperties.class)
public class ProjectInfoService {

	@Autowired
	private ProjectProperties projectProperties;
	
	public ProjectInfoDto getProjectInfo() {
		return ProjectInfoDto.builder()
				.projectName(projectProperties.getProjectName())
				.teamName(projectProperties.getTeamName())
				.build();
	}
	
}
