package com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>  {

	//EmployeeEntity findById(int i);

	//EmployeeEntity findBy_id(ObjectId _id);

	//Optional<EmployeeEntity> findById(int row_id);
	


}
