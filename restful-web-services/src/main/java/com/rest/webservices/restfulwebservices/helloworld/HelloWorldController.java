package com.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import java.util.Locale;
@RestController
public class HelloWorldController {
	
	@Autowired
	MessageSource messageSource;
	
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
	/*@GetMapping(path="/helloWorld internationalized")
	public String helloWorldInternationalized(
			@RequestHeader(name="Accept-language",required=false)Locale locale) {
		return messageSource.getMessage("good.morning.message", null, locale);
	}*/
	
	@GetMapping(path="/helloWorld internationalized")
	public String helloWorldInternationalized() {
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}
}
