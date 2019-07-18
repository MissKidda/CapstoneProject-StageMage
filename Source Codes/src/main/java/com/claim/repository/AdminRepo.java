package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.claim.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

	@Query("Select U from Admin U where email = ?1 and password = ?2")
	Admin login(String email, String password);


	
}
