package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.claim.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	@Query("Select U from User U where email = ?1 and password = ?2")
	User login(String email, String password);

}
