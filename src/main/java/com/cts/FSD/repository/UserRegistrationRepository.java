package com.cts.FSD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.FSD.model.UserRegistrationModel;

public interface UserRegistrationRepository extends JpaRepository<UserRegistrationModel, Long> {
	
	

}
