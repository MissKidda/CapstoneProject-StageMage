package com.claim.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.User;
import com.claim.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userrepo;
	
	public void saveUser(User user) {
		userrepo.save(user);
	}

	public ArrayList<User> findAll() {
		
	return (ArrayList<User>) userrepo.findAll();
		
	}

	public User login(String email, String password) {
		// TODO Auto-generated method stub
		return userrepo.login(email, password);
	}
}
