package com.trivium;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("time")
	public String m1() {
		String current_time = Instant.now().toString();
		System.out.println(current_time);
		return  "Kubernetes deployment instance, current time :"+current_time;
	}
}
