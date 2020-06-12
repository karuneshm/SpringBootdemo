package com.karunesh.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${team.name}")
	private String teamName;
	
	@Value("${coach.name}")
	private String teamCoach;
	
	
	@GetMapping("/")
	public String sayHello() {
		
		return "Hello World!. Time on the server is "+ LocalDateTime.now();
				
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k";
				
	}
	
	@GetMapping("/team-info")
	public String getTeamInfo() {
		return "Team Name "+teamName+ "Coach Name "+teamCoach;
	}

}
