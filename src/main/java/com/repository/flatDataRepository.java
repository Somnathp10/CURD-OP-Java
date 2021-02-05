package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.Book;
import com.model.flatData;

public interface flatDataRepository extends CrudRepository<flatData, Integer>{

	//flatData findById(int id); 

}
