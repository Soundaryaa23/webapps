package com.webapps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class webappsController {
	@GetMapping("/get")
	public String get() {
		return "Success";
	}

}
