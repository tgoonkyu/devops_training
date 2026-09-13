package com.trivium.springwebapp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {

	@GetMapping("beta")
	public String m1() {
		
		return "App 2";
	}
}
