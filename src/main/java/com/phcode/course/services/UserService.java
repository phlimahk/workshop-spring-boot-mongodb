package com.phcode.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phcode.course.domain.User;
import com.phcode.course.repository.UserRepository;

@Service
public class UserService {
	
@Autowired
private UserRepository repo;

public List<User> findAll(){
	
	return repo.findAll();
	
}
	
	
}
