package com.phearun.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phearun.model.User;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);
	
}
