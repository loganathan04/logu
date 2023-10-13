package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class JenkinsController {
@GetMapping(value="/getjenkin")
public String getjen() {
	return "Hi jenkin";
}

}
