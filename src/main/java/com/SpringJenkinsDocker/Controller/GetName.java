package com.SpringJenkinsDocker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("name")
public class GetName {
	
	@GetMapping("getName")
	public String getName() {
		return "David Successfully In!!!";
	}
}
