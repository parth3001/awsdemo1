package com.example.awsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/aws")
public class AwsController {
	
	@GetMapping(path="/test")
	public String testme( @RequestParam String name) {
		return " Hello "+name+" !! Welcome to AWS";
	}

}
