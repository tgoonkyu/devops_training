package com.trivium.springwebapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class App1Controller {
	
//	@Autowired
	RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping("test")
	public String m1() {
		
		return "App 1";
	}

	@GetMapping("/alpha")
	public String m2() {
		System.out.println("Inside m2 method alpha of 1st project");
		// will call Demmo2Controller's api
		// Trigger @GetMapping("/beta") from 2nd application
		return restTemplate.getForObject("http://app2/beta", String.class);
		
	}


}
