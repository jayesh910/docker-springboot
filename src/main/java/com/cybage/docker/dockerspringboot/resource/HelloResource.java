package com.cybage.docker.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloResource {
	
	@GetMapping
	public String hello() {
		return "Hello Jayesh_springboot_app_with DAtabase: Values are Data1 AND data2";
	}

}
