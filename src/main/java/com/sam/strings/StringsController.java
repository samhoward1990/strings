package com.sam.strings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringsController {
	
	@RequestMapping("/")
	public String clientMessage() {
		return "Hello Client! Lovely weather this spring!";
	}
	
	@RequestMapping("/random")
	public String springBootMessage() {
		return "Spring Boot is lovely! Just like the weather!";
	}
}
