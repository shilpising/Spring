package com.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class HelloWorldController {
	
	/*@RequestMapping(method=RequestMethod.GET,path="/rest")*/
	@GetMapping(path="/rest")
	public String helloWorld() {
		return "Hello World";
	}
	@GetMapping(path="/restWorld")
	public HelloWorldBean helloWorldRest() {
		return new HelloWorldBean("Hello World Bean");
	}
	@GetMapping(path="/restWorld/pathVariable/{name}")
	public HelloWorldBean helloWorldRestPathVariable(@PathVariable String name) {
		return new HelloWorldBean("Hello World Bean"+name);
	}
}
