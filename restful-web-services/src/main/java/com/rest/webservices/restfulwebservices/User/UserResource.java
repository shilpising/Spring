package com.rest.webservices.restfulwebservices.User;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.util.List;
import java.net.URI;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService service;
	
	@GetMapping(path="/users")
	public List<User> getAllUsers(){
		return service.findAll();
	}
	
	@GetMapping(path="/users/{id}")
	public User getUser(@PathVariable int id){
		User user=service.findOne(id);
		if(user==null) {
			throw new UserNotFoundException("id- "+id);
		}
		return user;
	}
	
	@PostMapping(path="/users")
	public ResponseEntity<Object> saveUser(@RequestBody User user){
		User saveService=service.save(user);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveService.getId()).toUri();
		return ResponseEntity.created(location).build();
}
}
