package com.claim.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.claim.entity.Admin;
import com.claim.repository.AdminRepo;

public class AdminService {

	
	@Autowired
	AdminRepo adminRepo;
	
	public void saveAdmin(Admin admin) {
		adminRepo.save(admin);
	}
	public Admin getAdminById(int adminId) {
		return adminRepo.findById(adminId).orElse(null);
	}
	
	public Admin login(String email, String password){
		return adminRepo.login(email, password);
		
	}
}
