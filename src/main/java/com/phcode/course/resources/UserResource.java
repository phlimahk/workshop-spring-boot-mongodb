package com.phcode.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.phcode.course.domain.User;
import com.phcode.course.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	
	@Autowired
	private UserService service;
	
	
	@RequestMapping(method =RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
	
		List<User> list = service.findAll();
		//list.addAll(Arrays.asList(maria,alex));
		
		return ResponseEntity.ok().body(list);
	}
	
}
