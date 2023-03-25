package com.hackathon.brainbox.greenbox.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProjectInfoDto {

	private String projectName;
	private String teamName;
	
}
