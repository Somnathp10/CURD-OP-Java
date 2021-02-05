package com.repository;

import java.util.Optional;

import com.model.EmployeeEntity;

public interface UserRepositoryCustom {
	
	Optional<EmployeeEntity> findById(Integer Row_id);

}
