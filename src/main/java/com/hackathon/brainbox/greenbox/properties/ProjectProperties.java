package com.hackathon.brainbox.greenbox.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "hackathon.greebox.info")
public class ProjectProperties {
	
	private String teamName;
	private String projectName;

}
