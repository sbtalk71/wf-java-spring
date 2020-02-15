package com.demo.spring.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping(path = "/greet/{user}", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String greet(@PathVariable("user") String name) {
		return "Welcome to Spring REST " + name;
	}

	@GetMapping(path = "/add", produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity add(@RequestParam("a")int a, @RequestParam("b") int b) {
		int x=a;
		int y=b;
		return ResponseEntity.ok(x+y);
	}
}
